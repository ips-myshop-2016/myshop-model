package com.myshop.model.customer;

import com.myshop.model.contracts.Person;
import com.myshop.model.user.User;

public class IndividualCustomer extends Customer implements Person {

	private String name, surname;
	private User user;
	private CreditCards creditCard;

	public IndividualCustomer(int ID, String name, String surname, User user,
			Address address, CreditCards creditCard) {
		super(ID);
		this.name = name;
		this.surname = surname;
		this.user = user;
		this.setAddress(address);
		this.creditCard = creditCard;
	}

	public IndividualCustomer(int ID, String name, String surname, Address address) {
		super(ID);
		this.name = name;
		this.surname = surname;
		this.setAddress(address);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IndividualCustomer setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public IndividualCustomer setSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public User getUser() {
		return user;
	}

	public IndividualCustomer setUser(User user) {
		this.user = user;
		return this;
	}

	@Override
	public Address getAddress() {
		return super.getAddress();
	}

	@Override
	public IndividualCustomer setAddress(Address address) {
		super.setAddress(address);
		return this;
	}

	public CreditCards getCreditCard() {
		return creditCard;
	}

	public IndividualCustomer setCreditCard(CreditCards creditCard) {
		this.creditCard = creditCard;
		return this;
	}

	public String toString() {
		return this.name + " " + this.surname;
	}

}
