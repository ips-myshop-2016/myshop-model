package com.myshop.model.customer;

import com.myshop.model.user.User;

public class Company extends Customer {

	private String name;
	private User user;

	public Company(int ID, String name, User user, Address address) {
		super(ID);
		this.name = name;
		this.user = user;
		this.setAddress(address);
	}

	public String getName() {
		return name;
	}

	public Company setName(String name) {
		this.name = name;
		return this;
	}

	public User getUser() {
		return user;
	}

	public Company setUser(User user) {
		this.user = user;
		return this;
	}

	public String toString() {
		return this.name;
	}
	
	@Override
	public Company setAddress(Address address) {
		super.setAddress(address);
		return this;
	}

}
