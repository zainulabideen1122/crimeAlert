package com.example.crimealert.businessLayer;

import com.example.crimealert.dataLayer.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
    public boolean authenticateUser(String email, String password) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM CITIZEN WHERE EMAIL = ? AND PASSWORD = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next(); // If there is a match, user is authenticated
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
