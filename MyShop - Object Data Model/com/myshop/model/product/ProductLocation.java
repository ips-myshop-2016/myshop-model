package com.myshop.model.product;

public class ProductLocation implements Comparable<ProductLocation> {

	private int corridor, position, height;
	private Side side;

	public ProductLocation(int corridor, int position, int height, Side side) {
		this.corridor = corridor;
		this.position = position;
		this.height = height;
		this.side = side;
	}

	@Deprecated
	public ProductLocation() {}

	/**
	 * @return the corridor
	 */
	public int getCorridor() {
		return corridor;
	}

	/**
	 * @param corridor the corridor to set
	 */
	public ProductLocation setCorridor(int corridor) {
		this.corridor = corridor;
		return this;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public ProductLocation setPosition(int position) {
		this.position = position;
		return this;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public ProductLocation setHeight(int height) {
		this.height = height;
		return this;
	}

	/**
	 * @return the side
	 */
	public Side getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public ProductLocation setSide(Side side) {
		this.side = side;
		return this;
	}

	public String toString() {
		return "PASILLO: " + corridor + ". LADO: " + side + ". POSICIÓN: "
				+ position + ". ALTURA: " + height + ".";
	}

	@Override
	public int compareTo(ProductLocation o) {
		return this.toString().compareTo(o.toString());
	}

}
