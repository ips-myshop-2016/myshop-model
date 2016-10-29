package com.myshop.model.warehouseKeeper;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.contracts.Person;

/**
 * Warehouse keeper ODM.
 * 
 * @version 2610161321
 * @author Guillermo Facundo Colunga
 */
public class WarehouseKeeper implements DatabaseEntity, Person {
	
	private int ID;
	private String name, surname;
	
	public WarehouseKeeper(int iD, String name, String surname) {
		ID = iD;
		this.name = name;
		this.surname = surname;
	}
	
	public WarehouseKeeper() { }

	/**
	 * @return the warehouse keeper id.
	 */
	@Override
	public int getID() { return this.ID; }
	
	/**
	 * @param warehouseKeeperID the warehouse keeper id.
	 */
	@Override
	public void setID(int warehouseKeeperID) { this.ID = warehouseKeeperID; }
	
	/**
	 * @return the name of the warehouse keeper.
	 */
	@Override
	public String getName() { return this.name; }
	
	/**
	 * @param name the name of the warehouse keeper.
	 */
	@Override
	public void setName(String name) { this.name = name; }
	
	/**
	 * @return the surname of the warehouse keeper.
	 */
	@Override
	public String getSurname() { return this.surname; }
	
	/**
	 * @param surname the surname of the warehouse keeper.
	 */
	@Override
	public void setSurname(String surname) { this.surname = surname; }
	
	@Override
	public String toString() {
		return getName() + " " + getSurname();
	}

}
