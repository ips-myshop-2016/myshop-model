package com.myshop.model.customer;

import com.myshop.model.user.User;

public class Company extends Customer {
	
	private String name;
	private int discount;
	private User user;

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
