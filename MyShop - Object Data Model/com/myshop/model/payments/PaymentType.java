package com.myshop.model.payments;

import com.myshop.model.contracts.DatabaseEntity;

public class PaymentType implements DatabaseEntity {

	private int ID;
	private String name;

	public PaymentType(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public PaymentType setID(int paymentTypeId) {
		this.ID = paymentTypeId;
		return this;
	}

	public String getName() {
		return name;
	}

	public PaymentType setName(String name) {
		this.name = name;
		return this;
	}

}
