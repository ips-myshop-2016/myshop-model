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

	public WarehouseKeeper(int ID, String name, String surname) {
		this.ID = ID;
		this.name = name;
		this.surname = surname;
	}

	@Deprecated
	public WarehouseKeeper() {}

	/**
	 * @return the warehouse keeper id.
	 */
	@Override
	public int getID() {
		return this.ID;
	}

	/**
	 * @param warehouseKeeperID the warehouse keeper id.
	 */
	@Override
	public WarehouseKeeper setID(int warehouseKeeperID) {
		this.ID = warehouseKeeperID;
		return this;
	}

	/**
	 * @return the name of the warehouse keeper.
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name of the warehouse keeper.
	 */
	@Override
	public WarehouseKeeper setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the surname of the warehouse keeper.
	 */
	@Override
	public String getSurname() {
		return this.surname;
	}

	/**
	 * @param surname the surname of the warehouse keeper.
	 */
	@Override
	public WarehouseKeeper setSurname(String surname) {
		this.surname = surname;
		return this;
	}

	@Override
	public String toString() {
		return getName() + " " + getSurname();
	}

}
