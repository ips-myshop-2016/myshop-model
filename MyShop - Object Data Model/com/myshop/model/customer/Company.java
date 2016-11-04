package com.myshop.model.customer;

import com.myshop.model.user.User;

public class Company extends Customer {
	
	private String name;
	private User user;

	public Company(int customerID, String name, User user) {
		super(customerID);
		this.name = name;
		this.user = user;
	}

	public Company(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String toString () {
		return this.name;
	}

}
