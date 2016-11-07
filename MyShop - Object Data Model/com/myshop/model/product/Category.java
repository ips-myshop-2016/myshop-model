package com.myshop.model.product;

import java.util.List;

public class Category {
	
	private String name;
	private List<Category> children;
	
	public Category(String name) {
		this.name = name;
	}
	
	/**
	 * @return the category name.
	 */
	public String getCategoryName() { return this.name; }
	
	/**
	 * @param category the new category name.
	 */
	public void setCategoryName(String category) {this.name = category;}
	
	public void addChild (Category hijo){
		children.add(hijo);
	}

	public List<Category> getChildren() {
		return children;
	}

}
