package com.myshop.model.customer;

import java.sql.Date;

import com.myshop.model.contracts.DatabaseEntity;

public class CreditCards implements DatabaseEntity{

	private int creditCardId;
	private int creditCardNumber;
	private Date creditCardExDate;
	
	public CreditCards(int creditCardId, int creditCardNumber, Date creditCardExDate) {
		this.creditCardId = creditCardId;
		this.creditCardNumber = creditCardNumber;
		this.creditCardExDate = creditCardExDate;
	}

	public CreditCards(){}
	
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public Date getCreditCardExDate() {
		return creditCardExDate;
	}
	public void setCreditCardExDate(Date creditCardExDate) {
		this.creditCardExDate = creditCardExDate;
	}
	@Override
	public int getID() {
		return creditCardId;
	}
	@Override
	public void setID(int creditCardId) {
		this.creditCardId = creditCardId;
		
	}
	
}
