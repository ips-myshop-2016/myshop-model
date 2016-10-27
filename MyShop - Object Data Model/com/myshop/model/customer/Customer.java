package com.myshop.model.customer;

import com.myshop.model.contracts.DatabaseEntity;

public class Customer implements DatabaseEntity {
	
	private int customerID;

	public Customer(){}
	/**
	 * 
	 * @return customerID
	 */
	@Override
	public int getID() {
		return customerID;
	}

	/**
	 * 
	 * @param customerID
	 */
	@Override
	public void setID(int customerID) {
		this.customerID = customerID;
	}
	
	

}
