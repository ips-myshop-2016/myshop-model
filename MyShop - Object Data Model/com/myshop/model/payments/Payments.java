package com.myshop.model.payments;

import com.myshop.model.contracts.DatabaseEntity;

public class Payments implements DatabaseEntity{

	
	private int paymentId;
	private PaymentType type;
	private boolean received;
	
	public Payments(){}

	public PaymentType getType() {
		return type;
	}

	public void setType(PaymentType type) {
		this.type = type;
	}

	public boolean isReceived() {
		return received;
	}

	public void setReceived(boolean received) {
		this.received = received;
	}

	@Override
	public int getID() {
		return paymentId;
	}

	@Override
	public void setID(int paymentId) {
		this.paymentId = paymentId;
	}
	
	
	
}
