package com.example.crimealert.businessLayer;

import com.example.crimealert.dataLayer.ConnectionUtil;
import com.example.crimealert.businessLayer.classes.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
    public enum UserType
    {
        CITIZEN,
        OFFICER,
        ADMIN
    }
    public User authenticateUser(String email, String password, UserType userType) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            String tableName = getTableName(userType);
            String sql = "SELECT * FROM " + tableName + " WHERE EMAIL = ? AND PASSWORD = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return createUserFromResultSet(userType, resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getTableName(UserType userType) {
        switch (userType) {
            case CITIZEN:
                return "CITIZEN";
            case OFFICER:
                return "OFFICER";
            case ADMIN:
                return "ADMIN";
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
    }

    private User createUserFromResultSet(UserType userType, ResultSet resultSet) throws SQLException {
        switch (userType) {
            case CITIZEN:
                return new Citizen(
                        resultSet.getInt("ID"),
                        resultSet.getString("NAME"),
                        resultSet.getString("EMAIL"),
                        resultSet.getInt("CNIC"),
                        resultSet.getInt("CONTACT"),
                        resultSet.getString("ADDRESS"),
                        resultSet.getString("GENDER"),
                        resultSet.getString("PASSWORD"),
                        true
                );
            case OFFICER:
                return new Officer(
                        resultSet.getInt("ID"),
                        resultSet.getString("NAME"),
                        resultSet.getString("EMAIL"),
                        resultSet.getInt("CNIC"),
                        resultSet.getInt("CONTACT"),
                        resultSet.getString("ADDRESS"),
                        resultSet.getString("GENDER"),
                        resultSet.getString("PASSWORD"),
                        true
                );
            case ADMIN:
                return new Admin(
                        resultSet.getInt("ID"),
                        resultSet.getString("NAME"),
                        resultSet.getString("EMAIL"),
                        resultSet.getInt("CNIC"),
                        resultSet.getInt("CONTACT"),
                        resultSet.getString("ADDRESS"),
                        resultSet.getString("GENDER"),
                        resultSet.getString("PASSWORD"),
                        true
                );
            default:
                throw new IllegalArgumentException("Invalid user type");
        }

    }
}


