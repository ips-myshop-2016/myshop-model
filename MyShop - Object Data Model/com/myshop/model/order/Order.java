package com.myshop.model.order;

import java.util.Date;
import java.util.List;

import com.myshop.model.customer.Customer;

public class Order{

	private int orderID;
	private List<OrderItem> products;
	private Status status;
	private Date dateReceived;
	private Customer customer;
	

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
	public String getStatus() {
		return status.toString();
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String estado) {
		if(estado.equals(Status.EMPAQUETANDO)){
			status = Status.EMPAQUETANDO;
		}
		if(estado.equals(Status.FINALIZADO)){
			status = Status.FINALIZADO;
		}
		if(estado.equals(Status.PAGADO)){
			status = Status.PAGADO;
		}
		if(estado.equals(Status.PENDIENTE_EMPAQUETADO)){
			status = Status.PENDIENTE_EMPAQUETADO;
		}
		if(estado.equals(Status.PENDIENTE_PAGO)){
			status = Status.PENDIENTE_PAGO;
		}
		if(estado.equals(Status.PREPARANDO)){
			status = Status.PREPARANDO;
		}
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
		return customer.getCustomerID();
	}
	
	/**
	 * 
	 * @param customerID
	 */
	public void setCustomerID(int customerID){
		if(customer==null) {
			customer = new Customer();
		}
		customer.setCustomerID(customerID);
		
	}
}
