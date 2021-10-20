package com.example.eticaret.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.eticaret.business.abstracts.DaoManagerHelper;
import com.example.eticaret.entity.User;
import com.example.eticaret.utils.JdbcUtils;

public class DaoManager implements DaoManagerHelper {
	
	public static PreparedStatement preparedStatement = null;
	public static Statement statement = null;
	public static ResultSet resultSet;

	public boolean add(User user) {
		return false;
	}

	public List<String> read(String email,String password) {
		List<String> list = new ArrayList<String>();
		preparedStatement  = JdbcUtils.getPreparedStatement("select * email,password from user where email="+email+" password ="+password);
		try {
			resultSet =preparedStatement.executeQuery();
			while(resultSet.next()){
				list.add(resultSet.getString("id"));
				list.add(resultSet.getString("name"));
				list.add(resultSet.getString("email"));
				list.add(resultSet.getString("passwor"));
			}
		} catch (SQLException e) {
			System.out.println("Kullanýcý kayýtlý deðil");
			e.printStackTrace();
		}
		
		return list;
	}

	public boolean update(User user) {
		return false;
	}

	public boolean delete(User user) {
		return false;
	}

}
