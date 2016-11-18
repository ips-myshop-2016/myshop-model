package com.myshop.model.order;

import com.myshop.model.contracts.DatabaseEntity;

public class Incidence implements DatabaseEntity {

	private int ID;
	private String description;
	private boolean solved;


	public Incidence(int incidenceID, String description) {
		this.ID = incidenceID;
		this.description = description;
		this.solved = false;
	}

	public Incidence(String description) {
		this.description = description;
		this.solved = false;
	}
	
	/**
	 * 
	 * @return incidences ID
	 */
	@Override
	public int getID() {
		return ID;
	}

	/**
	 * 
	 * @param ID
	 */
	@Override
	public Incidence setID(int ID) {
		this.ID = ID;
		return this;
	}

	/**
	 * 
	 * @return the description of the incidence
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public Incidence setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * 
	 * @return if the incidence is solve
	 */
	public boolean isSolve() {
		return solved;
	}

	/**
	 * 
	 * @param solve
	 */
	public Incidence setSolve(boolean solve) {
		this.solved = solve;
		return this;
	}

}
