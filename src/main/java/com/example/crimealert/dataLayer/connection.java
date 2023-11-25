package com.example.crimealert.dataLayer;
import java.awt.SystemTray;
import java.sql.*;

public class connection {
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crimeAlert","root","12345678");
            Statement st=con.createStatement();
            ResultSet rows = st.executeQuery("select * from test");
            while (rows.next()){
                System.out.print(rows.getInt("id"));
                System.out.print(rows.getString("name"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);}
    }

}
