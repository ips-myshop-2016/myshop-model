package com.myshop.model;

public class Product {

	private int productID, stock, corridor, position, height;
	private String name,description,categoryName,subcategoryName;
	private double weight, price;
	private Side side;
	private enum Side {
		RIGHT ("derecha"), LEFT ("izquierda");
		
		private String lado;
		
		Side(String lado) {
			this.lado = lado;
		}
		
		public String toString() { return this.lado; }
	}
	
	/**
	 * @return the productID
	 */
	public int getProductID() { return productID; }
	
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) { this.productID = productID; }
	
	/**
	 * @return the stock
	 */
	public int getStock() { return stock; }
	
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) { this.stock = stock; }
	
	/**
	 * @return the name
	 */
	public String getName() { return name; }
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) { this.name = name; }
	
	/**
	 * @return the description
	 */
	public String getDescription() { return description; }
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) { this.description = description; }
	
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() { return categoryName; }
	
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
	
	/**
	 * @return the subcategoryName
	 */
	public String getSubcategoryName() { return subcategoryName; }
	
	/**
	 * @param subcategoryName the subcategoryName to set
	 */
	public void setSubcategoryName(String subcategoryName) { this.subcategoryName = subcategoryName; }
	
	/**
	 * @return the weight
	 */
	public double getWeight() { return weight; }
	
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) { this.weight = weight; }
	
	/**
	 * @return the price
	 */
	public double getPrice() { return price; }
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) { this.price = price; }

	/**
	 * @return the corridor
	 */
	public int getCorridor() { return corridor; }

	/**
	 * @param corridor the corridor to set
	 */
	public void setCorridor(int corridor) { this.corridor = corridor; }

	/**
	 * @return the position
	 */
	public int getPosition() { return position; }

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) { this.position = position; }

	/**
	 * @return the height
	 */
	public int getHeight() { return height; }

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) { this.height = height; }
	
	/**
	 * @return the side
	 */
	public String getSide() { return this.side.toString(); }
	
	/**
	 * @param side the side to set
	 */
	public void setSide(String side) {
		if(side.equals(Side.LEFT.toString()))
			this.side=Side.LEFT;
		else
			this.side=Side.RIGHT;
	}
}
