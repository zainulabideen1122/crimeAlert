package com.example.crimealert.businessLayer;

import com.example.crimealert.dataLayer.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class SignupService {
    public boolean registerCitizen(String name, String email, String password, int cnic, int contact, String address, String gender) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            String sql = "Insert INTO CITIZEN (NAME, EMAIL, CNIC, CONTACT, ADDRESS, GENDER, PASSWORD) VALUES (?,?,?,?,?,?,?);";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                preparedStatement.setInt(3, cnic);
                preparedStatement.setInt(4, contact );
                preparedStatement.setString(5, address);
                preparedStatement.setString(6, gender);
                preparedStatement.setString(7, password);

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0; // Returns true if user registration is successful
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
