package com.myshop.model.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.customer.Customer;

public class Order implements DatabaseEntity {

	private int ID;
	private List<OrderItem> products;
	private Status status;
	private Date dateReceived;
	private Customer customer;

	public Order(int ID, List<OrderItem> products, Status status,
			Date dateReceived, Customer customer) {
		this.ID = ID;
		this.products = products;
		this.status = status;
		this.dateReceived = dateReceived;
		this.customer = customer;
		products = new ArrayList<OrderItem>();
	}

	/**
	 * 
	 * @return orders ID
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
	public Order setID(int ID) {
		this.ID = ID;
		return this;
	}

	/**
	 * 
	 * @return products
	 */
	public List<OrderItem> getProducts() {
		return products;
	}

	/**
	 * 
	 * @param products
	 */
	public Order setProducts(List<OrderItem> products) {
		this.products = products;
		return this;
	}

	/**
	 * 
	 * @return orders status
	 */
	public String getStatus() {
		return status.toString();
	}

	/**
	 * 
	 * @param status
	 */
	public Order setStatus(String estado) {
		status = Status.valueOf(estado);
		return this;
	}

	/**
	 * 
	 * @return orders date
	 */
	public Date getDateReceived() {
		return dateReceived;
	}

	/**
	 * 
	 * @param dateReceived
	 */
	public Order setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
		return this;

	}

	/**
	 * 
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public Order setCustomer(Customer customer) {
		this.customer = customer;
		return this;
	}

	/**
	 * 
	 * @return getCustomerID
	 */
	public int getCustomerID() {
		return customer.getID();
	}

	/**
	 * 
	 * @param customerID
	 */
	public Order setCustomerID(int customerID) {
		if (customer == null)
			customer = new Customer(customerID);
		else
			customer.setID(customerID);

		return this;

	}
}
