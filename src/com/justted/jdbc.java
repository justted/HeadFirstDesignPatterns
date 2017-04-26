package com.justted;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Justted on 2017/4/21.
 */
public class jdbc {
    private static final String URL="jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8&useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="ABCd15108321289#";

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select cost_name,last_update from server_cost");
        while(rs.next()){//如果对象中有数据，就会循环打印出来
            System.out.println(rs.getString("cost_name")+","+rs.getInt("last_update"));
        }

    }
}
