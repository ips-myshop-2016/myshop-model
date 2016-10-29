package com.myshop.model.payments;

import com.myshop.model.contracts.DatabaseEntity;

public class PaymentType implements DatabaseEntity{
	
	private int paymentTypeId;
	private String name;
	
	public PaymentType(int paymentTypeId, String name) {
		this.paymentTypeId = paymentTypeId;
		this.name = name;
	}

	public PaymentType(){}

	@Override
	public int getID() {
		return paymentTypeId;
	}

	@Override
	public void setID(int paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
