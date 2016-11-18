package com.myshop.model.product;

import java.util.List;

import com.myshop.model.contracts.DatabaseEntity;

public class Product implements DatabaseEntity {

	private int ID, stock;
	private String name, description;
	private double weight, price, companyPrice;
	private Category category;
	private ProductLocation productLocation;
	private Dimension3D dimensions;
	private IVAType iva;

	/**
	 * You should use a parameter vector structure to set all the attributes.
	 */
	@Deprecated
	public Product(int productID, int stock, String name, String description,
			double weight, double price, Category category,
			Category subcategory, ProductLocation productLocation,
			double companyPrice) {
		this.ID = productID;
		this.stock = stock;
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.price = price;
		this.category = category;
		this.productLocation = productLocation;
		this.companyPrice = companyPrice;
	}

	public Product() {}

	/**
	 * @return the productID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param productID the productID to set
	 */
	public Product setID(int productID) {
		this.ID = productID;
		return this;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public Product setStock(int stock) {
		this.stock = stock;
		return this;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public Product setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public Product setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public Product setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public Product setPrice(double price) {
		this.price = price;
		return this;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category.getName();
	}

	/**
	 * @param category the category to set
	 */
	public Product setCategory(String category) {
		this.category = new Category(category);
		return this;
	}

	/**
	 * @return the subcategory
	 */
	public List<Category> getSubCategory() {
		return category.getChildren();
	}

	/**
	 * @param subcategory the subcategory to set
	 */
	public Product addSubcategory(String subcategory) {
		category.addChild(new Category(subcategory));
		return this;
	}

	/**
	 * @return the productLocation
	 */
	public ProductLocation getProductLocation() {
		return productLocation;
	}

	/**
	 * @param productLocation the productLocation to set
	 */
	public Product setProductLocation(ProductLocation productLocation) {
		this.productLocation = productLocation;
		return this;
	}

	/**
	 * @return the corridor
	 */
	public int getCorridor() {
		return productLocation.getCorridor();
	}

	/**
	 * @param corridor corridor the be set for this product.
	 */
	@Deprecated
	public Product setCorridor(int corridor) {
		if (productLocation == null) {
			productLocation = new ProductLocation();
		}
		productLocation.setCorridor(corridor);
		return this;
	}

	/**
	 * @return the side
	 */
	public String getSide() {
		return productLocation.getSide().toString();
	}

	/**
	 * @param side the side to set
	 */
	@Deprecated
	public Product setSide(String side) {
		if (productLocation == null) {
			productLocation = new ProductLocation();
		}

		if (side.equals(Side.LEFT.toString()))
			productLocation.setSide(Side.LEFT);
		else
			productLocation.setSide(Side.RIGHT);
		return this;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return productLocation.getPosition();
	}

	/**
	 * @param pos position of the product.
	 */
	@Deprecated
	public Product setPosition(int pos) {
		if (productLocation == null) {
			productLocation = new ProductLocation();
		}
		productLocation.setPosition(pos);
		return this;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return productLocation.getHeight();
	}

	/**
	 * @param h height where this product is placed
	 */
	@Deprecated
	public Product setHeight(int h) {
		if (productLocation == null) {
			productLocation = new ProductLocation();
		}
		productLocation.setHeight(h);
		return this;
	}

	public double getCompanyPrice() {
		return companyPrice;
	}

	public Product setCompanyPrice(double companyPrice) {
		this.companyPrice = companyPrice;
		return this;
	}

	public Dimension3D getDimensions() {
		return dimensions;
	}

	public Product setDimensions(Dimension3D dimensions) {
		this.dimensions = dimensions;
		return this;
	}

	public IVAType getIva() {
		return iva;
	}

	public void setIva(IVAType iva) {
		this.iva = iva;
	}
}
