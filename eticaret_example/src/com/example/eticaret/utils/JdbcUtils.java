package com.example.eticaret.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	public static Connection connection = null;
	public static PreparedStatement preparedStatement = null;
	public static Statement statement = null;

	public static String url = "jdbc:mysql://localhost:3306/eticaret";
	public static String name = "root";
	public static String password = "12345";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, name, password);

	}
	
	public static Statement getStatement(){
		try {
			connection = getConnection();
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}
	
	public static PreparedStatement getPreparedStatement(String url){
		try {
			connection =  getConnection();
			preparedStatement = connection.prepareStatement(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;
	}
	
	public static void connectionAndStatement(){
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void connectionAndPrepareStatment(){
		try {
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void connectionClose() throws SQLException{
		connection.close();
		
	}
	
	public static void statementClose() throws SQLException{
		statement.close();
		
	}
	
	public static void preparedStatementClose() throws SQLException{
		preparedStatement.close();
		
	}
}
