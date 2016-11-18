package com.myshop.model.product;

import java.util.ArrayList;
import java.util.List;

public class Category {

	private String name;
	private List<Category> children;

	public Category(String name) {
		this.name = name;
		children = new ArrayList<Category>();
	}

	/**
	 * @return the category name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param category the new category name.
	 */
	public Category setName(String category) {
		this.name = category;
		return this;
	}

	public Category addChild(Category hijo) {
		children.add(hijo);
		return this;
	}

	public List<Category> getChildren() {
		return children;
	}

}
