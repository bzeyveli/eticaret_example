package com.example.eticaret.business.abstracts;

import java.util.List;

import com.example.eticaret.entity.User;



public interface DaoManagerHelper {
	boolean add(User user);

	List<String> read(String email,String password);

	boolean update(User user);

	boolean delete(User user);

}
