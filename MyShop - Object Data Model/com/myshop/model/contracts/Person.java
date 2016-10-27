package com.myshop.model.contracts;

public interface Person {

	/**
	 * @return the name of the person.
	 */
	public String getName();
	
	/**
	 * @param name the name of the person.
	 */
	public void setName(String name);
	
	/**
	 * @return the surname of the person.
	 */
	public String getSurname();
	
	/**
	 * @param surname the surname of the person.
	 */
	public void setSurname(String surname);
	
	/**
	 * @return the person as an String.
	 */
	public String toString();
}
