package com.cybertek.jdbc;

import java.sql.*;

public class DB_Connection {

    public static void main(String[] args) throws SQLException {

        String connectionStr="jdbc:oracle:thin:@54.81.111.10:1521:XE";
        String username="hr";
        String password="hr";


        Connection conn= DriverManager.getConnection(connectionStr,username,password);


        Statement stmnt=conn.createStatement();

        ResultSet rs=stmnt.executeQuery("Select * From Regions");
         rs.next();

         System.out.println(rs.getString(1)+" "+rs.getString(2));
        rs.next();
        System.out.println(rs.getString(1)+" "+rs.getString(2));



    }



}
