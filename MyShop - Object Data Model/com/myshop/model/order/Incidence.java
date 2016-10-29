package com.myshop.model.order;

import com.myshop.model.contracts.DatabaseEntity;

public class Incidence implements DatabaseEntity {
	private int incidenceID;
	private String description;
	private boolean solve;

	
	public Incidence(int incidenceID, String description, boolean solve) {
		this.incidenceID = incidenceID;
		this.description = description;
		this.solve = solve;
	}

	public Incidence(){}
	
	public Incidence(int incidenceID){
		this.incidenceID=incidenceID;
	}
	/**
	 * 
	 * @return incidences ID
	 */
	@Override
	public int getID() {
		return incidenceID;
	}
	
	/**
	 * 
	 * @param incidenceID
	 */
	@Override
	public void setID(int incidenceID) {
		this.incidenceID = incidenceID;
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
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return if the incidence is solve
	 */
	public boolean isSolve() {
		return solve;
	}

	/**
	 * 
	 * @param solve
	 */
	public void setSolve(boolean solve) {
		this.solve = solve;
	}

}
