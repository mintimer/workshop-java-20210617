package com.example.hellorest.employee;

import java.sql.*;

public class DemoSQL {
    public void workingWithDB() throws ClassNotFoundException, SQLException {
        Class.forName("driver class of database");
        Connection conn = DriverManager.getConnection("");
        PreparedStatement prep = conn.prepareStatement("SQL");
        ResultSet resultSet = prep.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
        }
    }
}
