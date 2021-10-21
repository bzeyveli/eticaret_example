package com.example.eticaret.business;

import java.util.ArrayList;
import java.util.List;
import com.example.eticaret.business.abstracts.DaoManagerHelper;

public class Login {

	DaoManagerHelper daoManagerHelper;

	public Login(DaoManagerHelper daoManagerHelper) {
		this.daoManagerHelper = daoManagerHelper;
	}
	
	public boolean loginControl(String email, String password) {
		boolean result = validation(email,password);
		if (result) {
			return true;
		}
		return false;
	}

	public boolean validation(String email, String password) {
		List<String> list = new ArrayList<String>();
		if (email != null && password != null) {
			System.out.println("list control");
			list = daoManagerHelper.read(email,password);
			if (list.get(1).equals(email) && list.get(2).equals(password)) {
				return true;
			}
		}
		return false;
	}


}
