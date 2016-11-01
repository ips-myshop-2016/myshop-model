package com.myshop.model.order;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.product.Product;

public class OrderItem implements DatabaseEntity,Comparable<OrderItem>{

	private int orderItemID,quantity;
	private Product product;
	private Incidence incidence;
	private MailBox mailbox;
	
	public OrderItem(int orderItemID, int quantity, Product product, Incidence incidence, MailBox mailbox) {
		this.orderItemID = orderItemID;
		this.quantity = quantity;
		this.product = product;
		this.incidence = incidence;
		this.mailbox = mailbox;
	}

	public OrderItem() { }
	
	/**
	 * 
	 * @return orderItemID
	 */
	@Override
	public int getID() {
		return orderItemID;
	}

	/**
	 * 
	 * @param orderItemID
	 */
	@Override
	public void setID(int orderItemID) {
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
	 * @return productID
	 */
	public int getProductID(){
		return product.getID();
	}
	
	/**
	 * 
	 * @param productid
	 */
	public void setProductID(int id){
		if(product==null){
			product = new Product();
		}
		product.setID(id);
	}
	
	/**
	 * 
	 * @return product stock
	 */
	public int getProductStock(){
		return product.getStock();
	}
	
	/**
	 * 
	 * @param product stock
	 */
	public void setProductStock(int stock){
		if(product==null){
			product=new Product();
		}
		product.setStock(stock);
	}
	
	/**
	 * 
	 * @return product name
	 */
	public String getProductName(){
		return product.getName();
	}
	
	/**
	 * 
	 * @param product name
	 */
	public void setProductName(String name){
		if(product==null){
			product=new Product();
		}
		product.setName(name);
	}
	
	/**
	 * 
	 * @return product description
	 */
	public String getProductDescription(){
		return product.getDescription();
	}
	
	/**
	 * 
	 * @param product description
	 */
	public void setProductDescription(String description){
		if(product==null){
			product=new Product();
		}
		product.setDescription(description);
	}
	
	/**
	 * 
	 * @return product weight
	 */
	public double getProductWeight(){
		return product.getWeight();
	}
	
	/**
	 * 
	 * @param product weight
	 */
	public void setProductWeight(double weight){
		if(product==null){
			product=new Product();
		}
		product.setWeight(weight);
	}
	
	/**
	 * 
	 * @return product price
	 */
	public double getProductPrice(){
		return product.getPrice();
	}
	
	/**
	 * 
	 * @param product price
	 */
	public void setProductPrice(double price){
		if(product==null){
			product=new Product();
		}
		product.setPrice(price);
	}
	
	/**
	 * 
	 * @return product category
	 */
	public String getProductCategory(){
		return product.getCategory();
	}
	
	/**
	 * 
	 * @param product category
	 */
	public void setProductCategory(String category){
		if(product==null){
			product=new Product();
		}
		product.setCategory(category);
	}
	
	/**
	 * 
	 * @return product subcategory
	 */
	public String getProductSubCategory(){
		return product.getSubcategory();
	}
	
	/**
	 * 
	 * @param product subcategory
	 */
	public void setProductSubCategory(String subcategory){
		if(product==null){
			product=new Product();
		}
		product.setSubcategory(subcategory);
	}
	
	/**
	 * 
	 * @return productLocation corridor
	 */
	public int getProductProductLocationCorridor(){
		return product.getCorridor();
	}
	
	/**
	 * 
	 * @param productLocation corridor
	 */
	public void setProductProductLocationCorridor(int corridor){
		if(product==null){
			product=new Product();
		}
		product.setCorridor(corridor);
	}
	
	/**
	 * 
	 * @return productLocation position
	 */
	public int getProductProductLocationPosition(){
		return product.getPosition();
	}
	
	/**
	 * 
	 * @param productLocation position
	 */
	public void setProductProductLocationPosition(int position){
		if(product==null){
			product=new Product();
		}
		product.setPosition(position);
	}
	
	/**
	 * 
	 * @return productLocation Height
	 */
	public int getProductProductLocationHeight(){
		return product.getHeight();
	}
	
	/**
	 * 
	 * @param productLocation Heigth
	 */
	public void setProductProductLocationHeight(int height){
		if(product==null){
			product=new Product();
		}
		product.setHeight(height);
	}
	
	/**
	 * 
	 * @return productLocation side
	 */
	public String getProductProductLocationSide(){
		return product.getSide();
	}
	
	/**
	 * 
	 * @param productLocation side
	 */
	public void setProductProductLocationSide(String side){
		if(product==null){
			product=new Product();
		}
		product.setSide(side);
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
	 * @return IncidenceID
	 */
	public int getIncidenceID(){
		return incidence.getID();
	}
	
	/**
	 * 
	 * @param incidenceID
	 */
	public void setIncidenceID(int incidenceID){
		if(incidence==null){
			incidence = new Incidence();
		}
		incidence.setID(incidenceID);
	}
	
	/**
	 * 
	 * @return incidences description
	 */
	public String getIncidenceDescription(){
		return incidence.getDescription();
	}
	
	/**
	 * 
	 * @param incidences description
	 */
	public void setIncidenceDescription(String description){
		if(incidence==null){
			incidence = new Incidence();
		}
		incidence.setDescription(description);
	}
	
	/**
	 * 
	 * @return incidences solve
	 */
	public boolean isIncidenceSolve(){
		return incidence.isSolve();
	}
	
	/**
	 * 
	 * @param incidences solve
	 */
	public void setIncidenceSolve(boolean solve){
		if(incidence==null){
			incidence = new Incidence();
		}
		incidence.setSolve(solve);
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

	/**
	 * 
	 * @return MailBoxID
	 */
	public int getMailBoxID(){
		return mailbox.getID();
	}
	
	/**
	 * 
	 * @param mailBoxID
	 */
	public void setMailBoxID(int mailBoxID){
		if(mailbox==null) {
			mailbox = new MailBox(mailBoxID);
		}
		mailbox.setID(mailBoxID);
	}
	
	@Override
	public int compareTo(OrderItem o) {
		return this.product.getProductLocation().compareTo(o.getProduct().getProductLocation());
	}
	
}
