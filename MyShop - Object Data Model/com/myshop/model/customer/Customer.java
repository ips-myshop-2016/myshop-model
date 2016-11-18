package com.myshop.model.customer;

import com.myshop.model.contracts.DatabaseEntity;

public class Customer implements DatabaseEntity {

	private int ID;
	private Address address;

	public Customer(int ID) {
		this.ID = ID;
	}

	/**
	 * 
	 * @return customerID
	 */
	@Override
	public int getID() {
		return ID;
	}

	/**
	 * 
	 * @param customerID
	 */
	@Override
	public Customer setID(int customerID) {
		throw new RuntimeException(
				"The ID of the customer must be set at the constructor.");
	}

	public Address getAddress() {
		return address;
	}

	public Customer setAddress(Address address) {
		this.address = address;
		return this;
	}

}
