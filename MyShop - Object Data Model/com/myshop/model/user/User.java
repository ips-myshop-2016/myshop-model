package com.myshop.model.user;

import com.myshop.model.contracts.DatabaseEntity;

public class User implements DatabaseEntity {

	private int ID;
	private String username;
	private String password;

	public User(int ID, String username, String password) {
		this.ID = ID;
		this.username = username;
		this.password = password;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public User setID(int user_id) {
		this.ID = user_id;
		return this;

	}

	public String getUsername() {
		return username;
	}

	public User setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}

}
