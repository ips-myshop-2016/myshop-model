package com.myshop.model.order;

import java.util.List;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.product.Category;
import com.myshop.model.product.Product;

public class OrderItem implements DatabaseEntity {

	private int ID, quantity;
	private Product product;
	private Incidence incidence;
	private MailBox mailbox;
	private Order parent;
	public int itemsPackaged;

	public OrderItem(int ID, int quantity, Product product, Incidence incidence,
			MailBox mailbox, int itemsPackaged) {
		this.ID = ID;
		this.quantity = quantity;
		this.product = product;
		this.incidence = incidence;
		this.mailbox = mailbox;
		this.itemsPackaged = itemsPackaged;
	}
	
	public OrderItem(int ID, int quantity, Product product) {
		this.ID = ID;
		this.quantity = quantity;
		this.product = product;
	}

	/**
	 * 
	 * @return orderItemID
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
	public OrderItem setID(int ID) {
		this.ID = ID;
		return this;
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
	public OrderItem setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
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
	public OrderItem setProduct(Product product) {
		this.product = product;
		return this;
	}

	/**
	 * 
	 * @return productID
	 */
	public int getProductID() {
		return product.getID();
	}

	/**
	 * 
	 * @param productid
	 */
	public OrderItem setProductID(int id) {
		if (product == null) {
			product = new Product();
		}
		product.setID(id);

		return this;
	}

	/**
	 * 
	 * @return product stock
	 */
	public int getProductStock() {
		return product.getStock();
	}

	/**
	 * 
	 * @param product stock
	 */
	public OrderItem setProductStock(int stock) {
		if (product == null) {
			product = new Product();
		}
		product.setStock(stock);

		return this;
	}

	/**
	 * 
	 * @return product name
	 */
	public String getProductName() {
		return product.getName();
	}

	/**
	 * 
	 * @param product name
	 */
	public OrderItem setProductName(String name) {
		if (product == null) {
			product = new Product();
		}
		product.setName(name);

		return this;
	}

	/**
	 * 
	 * @return product description
	 */
	public String getProductDescription() {
		return product.getDescription();
	}

	/**
	 * 
	 * @param product description
	 */
	public OrderItem setProductDescription(String description) {
		if (product == null) {
			product = new Product();
		}
		product.setDescription(description);

		return this;
	}

	/**
	 * 
	 * @return product weight
	 */
	public double getProductWeight() {
		return product.getWeight();
	}

	/**
	 * 
	 * @param product weight
	 */
	public OrderItem setProductWeight(double weight) {
		if (product == null) {
			product = new Product();
		}
		product.setWeight(weight);

		return this;
	}

	/**
	 * 
	 * @return product price
	 */
	public double getProductPrice() {
		return product.getPrice();
	}

	/**
	 * 
	 * @param product price
	 */
	public OrderItem setProductPrice(double price) {
		if (product == null) {
			product = new Product();
		}
		product.setPrice(price);

		return this;
	}

	/**
	 * 
	 * @return product category
	 */
	public String getProductCategory() {
		return product.getCategory();
	}

	/**
	 * 
	 * @param product category
	 */
	public OrderItem setProductCategory(String category) {
		if (product == null) {
			product = new Product();
		}
		product.setCategory(category);

		return this;
	}

	/**
	 * 
	 * @return product subcategory
	 */
	public List<Category> getProductSubCategory() {
		return product.getSubCategory();
	}

	/**
	 * 
	 * @param product subcategory
	 */
	public OrderItem setProductSubCategory(String subcategory) {
		if (product == null) {
			product = new Product();
		}
		product.addSubcategory(subcategory);

		return this;
	}

	/**
	 * 
	 * @return productLocation corridor
	 */
	public int getProductProductLocationCorridor() {
		return product.getCorridor();
	}

	/**
	 * 
	 * @param productLocation corridor
	 */
	@Deprecated
	public OrderItem setProductProductLocationCorridor(int corridor) {
		if (product == null) {
			product = new Product();
		}
		product.setCorridor(corridor);

		return this;
	}

	/**
	 * 
	 * @return productLocation position
	 */
	public int getProductProductLocationPosition() {
		return product.getPosition();
	}

	/**
	 * 
	 * @param productLocation position
	 */
	@Deprecated
	public OrderItem setProductProductLocationPosition(int position) {
		if (product == null) {
			product = new Product();
		}
		product.setPosition(position);

		return this;
	}

	/**
	 * 
	 * @return productLocation Height
	 */
	public int getProductProductLocationHeight() {
		return product.getHeight();
	}

	/**
	 * 
	 * @param productLocation Heigth
	 */
	@Deprecated
	public OrderItem setProductProductLocationHeight(int height) {
		if (product == null) {
			product = new Product();
		}
		product.setHeight(height);

		return this;
	}

	/**
	 * 
	 * @return productLocation side
	 */
	public String getProductProductLocationSide() {
		return product.getSide();
	}

	/**
	 * 
	 * @param productLocation side
	 */
	@Deprecated
	public OrderItem setProductProductLocationSide(String side) {
		if (product == null) {
			product = new Product();
		}
		product.setSide(side);

		return this;
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
	public OrderItem setIncidence(Incidence incidence) {
		this.incidence = incidence;
		return this;
	}

	/**
	 * 
	 * @return incidences description
	 */
	public String getIncidenceDescription() {
		return incidence.getDescription();
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
	public OrderItem setMailbox(MailBox mailbox) {
		this.mailbox = mailbox;

		return this;
	}

	/**
	 * 
	 * @param mailBoxID
	 */
	public OrderItem setMailBoxID(int mailBoxID) {
		if (mailbox == null)
			mailbox = new MailBox(mailBoxID);
		else
			mailbox.setID(mailBoxID);

		return this;
	}

	public Order getParent() {
		return parent;
	}

	public OrderItem setParent(Order parent) {
		this.parent = parent;

		return this;
	}
}
