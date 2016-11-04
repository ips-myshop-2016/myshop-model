package com.myshop.model.product;

public enum Side {

	RIGHT ("right"), LEFT ("left");
	
	private String lado;
	
	Side(String lado) {
		this.lado = lado;
	}
	
	public String toString() { return this.lado; }
	
}
