package com.cybertek.jdbc;


import java.sql.*;

public class DB_Connection_for_Country {

    public static void main(String[] args) throws SQLException {

        String connSTR="jdbc:oracle:thin:@54.81.111.10:1521:XE";
        String usernmae="hr";
        String password="hr";
        Connection conn= DriverManager.getConnection(connSTR,usernmae,password);

        Statement stt=conn.createStatement();

        ResultSet Rs=stt.executeQuery("Select * from COUNTRIES");

        while (Rs.next()){
            System.out.println(Rs.getString(1) +" "+Rs.getString(2));
        }


    }

}
