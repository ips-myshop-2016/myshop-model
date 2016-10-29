package com.myshop.model.customer;

import com.myshop.model.contracts.Person;
import com.myshop.model.user.User;

public class IndividualCustomer extends Customer implements Person{
	
	private String name;
	private String surname;
	private User user;
	private Address address;
	private CreditCards creditCard;
	
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CreditCards getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCards creditCard) {
		this.creditCard = creditCard;
	}

}
