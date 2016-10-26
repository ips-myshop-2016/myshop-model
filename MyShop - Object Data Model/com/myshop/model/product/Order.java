package com.myshop.model.product;

import java.util.Date;
import java.util.List;

public class Order{

	private int orderID;
	private List<OrderItem> products;
	private Status status;
	private Date dateReceived;
	
	
	/**
	 * 
	 * @return orders ID
	 */
	public int getOrderID() {
		return orderID;
	}

	/**
	 * 
	 * @param orderID
	 */
	public void setOrderID(int orderID) {
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
	public Status getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
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

}
