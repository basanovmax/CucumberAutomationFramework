package com.automation.utils;

import java.sql.*;

public class DatabaseDemo {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://18.118.14.155:3306/digitalbank";

		// 1.Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//2.Create connections
		Connection con = DriverManager.getConnection(url, "digitaluser", "Demo123!");

		//3.Create object of statement
		Statement stmt = con.createStatement();

		//4.Execute Query
		ResultSet rs = stmt.executeQuery("SELECT name FROM account;");

		while (rs.next()){
			System.out.println(rs.getString("name"));
		}
	}
}
