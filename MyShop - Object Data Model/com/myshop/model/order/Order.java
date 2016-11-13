package com.myshop.model.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.customer.Customer;

public class Order implements DatabaseEntity {

	private int orderID;
	private List<OrderItem> products;
	private Status status;
	private Date dateReceived;
	private Customer customer;

	public Order(int orderID, List<OrderItem> products, Status status, Date dateReceived, Customer customer) {
		this.orderID = orderID;
		this.products = products;
		this.status = status;
		this.dateReceived = dateReceived;
		this.customer = customer;
		products = new ArrayList<OrderItem>();
	}

	public Order() {
		products = new ArrayList<OrderItem>();
	}

	/**
	 * 
	 * @return orders ID
	 */
	@Override
	public int getID() {
		return orderID;
	}

	/**
	 * 
	 * @param orderID
	 */
	@Override
	public void setID(int orderID) {
		this.orderID = orderID;
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
	public void setProducts(List<OrderItem> products) {
		this.products = products;
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
	public void setStatus(String estado) {
		status = Status.valueOf(estado);
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
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
		
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
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * 
	 * @return getCustomerID
	 */
	public int getCustomerID(){
		return customer.getID();
	}
	
	/**
	 * 
	 * @param customerID
	 */
	public void setCustomerID(int customerID){
		if(customer==null) {
			customer = new Customer();
		}
		customer.setID(customerID);
		
	}
}
