package com.myshop.model.order;

import com.myshop.model.contracts.DatabaseEntity;

public class MailBox implements DatabaseEntity {

	private int ID;

	public MailBox(int ID) {
		this.ID = ID;
	}

	/**
	 * 
	 * @return MailBoxID
	 */
	@Override
	public int getID() {
		return ID;
	}

	/**
	 * 
	 * @param mailBoxID
	 */
	@Override
	public MailBox setID(int mailBoxID) {
		this.ID = mailBoxID;
		return this;
	}

}
