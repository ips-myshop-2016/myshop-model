package com.myshop.model.product;

public class Dimension3D {

	private double height, width, deep;

	public Dimension3D(double height, double width, double deep) {
		this.height = height;
		this.width = width;
		this.deep = deep;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWith() {
		return this.width;
	}

	public double getDeep() {
		return this.deep;
	}

	public double calculateVolume() {
		return height * width * deep;
	}

}
