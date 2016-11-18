package com.myshop.model.customer;

import java.util.Date;

import com.myshop.model.contracts.DatabaseEntity;

public class CreditCards implements DatabaseEntity {

	private int ID, creditCardNumber;
	private Date creditCardExDate;

	public CreditCards(int ID, int creditCardNumber, Date creditCardExDate) {
		this.ID = ID;
		this.creditCardNumber = creditCardNumber;
		this.creditCardExDate = creditCardExDate;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public CreditCards setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
		return this;
	}

	public Date getCreditCardExDate() {
		return creditCardExDate;
	}

	public CreditCards setCreditCardExDate(Date creditCardExDate) {
		this.creditCardExDate = creditCardExDate;
		return this;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public CreditCards setID(int ID) {
		this.ID = ID;
		return this;

	}

}
