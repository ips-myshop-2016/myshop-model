package com.myshop.model.customer;

public class Address {

	private String street, city, state, cip_code;

	public Address(String street, String city, String state, String cip_code) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.cip_code = cip_code;
	}

	public String getStreet() {
		return street;
	}

	public Address setStreet(String street) {
		this.street = street;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public Address setState(String state) {
		this.state = state;
		return this;
	}

	public String getCip_code() {
		return cip_code;
	}

	public Address setCip_code(String cip_code) {
		this.cip_code = cip_code;
		return this;
	}

}
