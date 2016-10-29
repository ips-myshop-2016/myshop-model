package com.myshop.model.customer;


public class Address{

	private String street;
	private String city;
	private String state;
	private String cip_code;
	
	public Address(){}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCip_code() {
		return cip_code;
	}
	public void setCip_code(String cip_code) {
		this.cip_code = cip_code;
	}
	
}
