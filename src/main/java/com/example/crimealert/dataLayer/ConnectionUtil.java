package com.example.crimealert.dataLayer;
import java.sql.*;

public class ConnectionUtil {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/crimeAlert";
    private static final String USER = "root";
    private static final String PASSWORD = "12345678";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }





    //    public static void main(String[] args) {
//        try {
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crimeAlert","root","12345678");
//            Statement st=con.createStatement();
//            ResultSet rows = st.executeQuery("select * from test");
//            while (rows.next()){
//                System.out.print(rows.getInt("id"));
//                System.out.print(rows.getString("name"));
//            }
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);}
//    }
}
