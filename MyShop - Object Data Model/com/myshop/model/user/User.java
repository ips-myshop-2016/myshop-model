package com.myshop.model.user;

import com.myshop.model.contracts.DatabaseEntity;

public class User implements DatabaseEntity {

	private int user_id;
	private String username;
	private String password;
	
	@Override
	public int getID() {
		return user_id;
	}

	@Override
	public void setID(int user_id) {
		this.user_id = user_id;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
