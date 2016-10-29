package com.myshop.model.customer;

import com.myshop.model.contracts.Person;
import com.myshop.model.user.User;

public class IndividualCustomer implements Person{
	
	private Customer customer;
	private String name;
	private String surname;
	private User user;
	
	public IndividualCustomer(){}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name= name;
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
