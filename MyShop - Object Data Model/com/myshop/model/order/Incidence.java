package com.myshop.model.order;

public class Incidence {
	private int incidenceID;
	private String description;
	private boolean solve;

	
	/**
	 * 
	 * @return incidences ID
	 */
	public int getIncidenceID() {
		return incidenceID;
	}
	
	/**
	 * 
	 * @param incidenceID
	 */
	public void setIncidenceID(int incidenceID) {
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