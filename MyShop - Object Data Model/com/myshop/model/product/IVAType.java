package com.myshop.model.product;

import com.myshop.model.contracts.DatabaseEntity;

public class IVAType implements DatabaseEntity {

	private int ID, IVA;
	private String name;
	
	public IVAType(int ID, String name, int IVA) {
		setID(ID);
		this.name=name;
		this.IVA = IVA;
	}
	
	@Override
	public int getID() {
		return ID;
	}

	@Override
	public IVAType setID(int ID) {
		this.ID = ID;
		return this;
	}
	
	public int getIVA() {
		return this.IVA;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double asPercentage() {
		return this.IVA/100.0;
	}

}
