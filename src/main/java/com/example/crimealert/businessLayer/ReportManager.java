package com.example.crimealert.businessLayer;

import com.example.crimealert.businessLayer.classes.Report;
import com.example.crimealert.dataLayer.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportManager {


    public static boolean submitReport(String type, String place, String description, String evidence, int userID)
    {
        Report report = new Report(type, place, description, evidence);
        try (Connection connection = ConnectionUtil.getConnection()) {
            String sql = "INSERT INTO REPORT (TYPE, PLACE, DESCRIPTION, EVIDENCE, REPORTER) VALUES (?,?,?,?, ?);";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, report.getType());
                preparedStatement.setString(2, report.getPlace());
                preparedStatement.setString(3, report.getDescription());
                preparedStatement.setString(4, report.getEvidence());
                preparedStatement.setInt(5,userID);

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0; // Returns true if user registration is successful
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    };
}
