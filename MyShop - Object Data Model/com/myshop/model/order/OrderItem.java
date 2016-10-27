package com.myshop.model.order;

import com.myshop.model.product.Product;

public class OrderItem {

	private int orderItemID,quantity;
	private Product product;
	private boolean collected = false;
	private Incidence incidence;
	private MailBox mailbox;
	
	/**
	 * 
	 * @return orderItemID
	 */
	public int getOrderItemID() {
		return orderItemID;
	}

	/**
	 * 
	 * @param orderItemID
	 */
	public void setOrderItemID(int orderItemID) {
		this.orderItemID = orderItemID;
	}
	
	/**
	 * 
	 * @return products quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * 
	 * @param product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * 
	 * @return if its collected
	 */
	public boolean isCollected() {
		return collected;
	}

	/**
	 * 
	 * @param collected
	 */
	public void setCollected(boolean collected) {
	
	}

	/**
	 * 
	 * @return the incidence
	 */
	public Incidence getIncidence() {
		return incidence;
	}

	/**
	 * 
	 * @param incidence
	 */
	public void setIncidence(Incidence incidence) {
		this.incidence = incidence;
	}

	/**
	 * 
	 * @return mailbox
	 */
	public MailBox getMailbox() {
		return mailbox;
	}

	/**
	 * 
	 * @param mailbox
	 */
	public void setMailbox(MailBox mailbox) {
		this.mailbox = mailbox;
	}

	
}
