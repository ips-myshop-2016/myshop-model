package com.myshop.model.order;

import com.myshop.model.contracts.DatabaseEntity;

public class MailBox implements DatabaseEntity {
	
	private int mailBoxID;

	public MailBox(int mailboxid){
		this.mailBoxID=mailboxid;
	}
	
	/**
	 * 
	 * @return MailBoxID
	 */
	@Override
	public int getID() {
		return mailBoxID;
	}
	
	/**
	 * 
	 * @param mailBoxID
	 */
	@Override
	public void setID(int mailBoxID) {
		this.mailBoxID = mailBoxID;
	}
	
	

}
