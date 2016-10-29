package com.myshop.model.customer;

import com.myshop.model.user.User;

public class Company extends Customer {
	
	private String name;
	private int discount;
	private User user;

	public Company(int customerID, String name, int discount, User user) {
		super(customerID);
		this.name = name;
		this.discount = discount;
		this.user = user;
	}

	public Company(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
