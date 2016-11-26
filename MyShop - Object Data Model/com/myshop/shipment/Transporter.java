package com.myshop.shipment;

import com.myshop.model.contracts.DatabaseEntity;

public class Transporter implements DatabaseEntity {
	
	private int ID;
	private String name;
	
	public Transporter(int ID, String name) {
		setID(ID);
		setName(name);
	}

	@Override
	public int getID() {
		return this.ID;
	}

	@Override
	public Transporter setID(int ID) {
		this.ID = ID;
		return this;
	}
	
	public String getName() { return this.name; }
	
	public Transporter setName(String name) {
		this.name = name;
		return this;
	}

}
