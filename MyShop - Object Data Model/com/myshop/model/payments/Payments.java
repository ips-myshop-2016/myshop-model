package com.myshop.model.payments;

import com.myshop.model.contracts.DatabaseEntity;

public class Payments implements DatabaseEntity {

	private int ID;
	private PaymentType type;
	private boolean received = false;

	public Payments(int ID, PaymentType type, boolean received) {
		this.ID = ID;
		this.type = type;
		this.received = received;
	}
	
	public Payments(int ID, PaymentType type) {
		this.ID = ID;
		this.type = type;
	}

	public PaymentType getType() {
		return type;
	}

	public Payments setType(PaymentType type) {
		this.type = type;
		return this;
	}

	public boolean isReceived() {
		return received;
	}

	public Payments setReceived(boolean received) {
		this.received = received;
		return this;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public Payments setID(int paymentId) {
		this.ID = paymentId;
		return this;
	}

}
