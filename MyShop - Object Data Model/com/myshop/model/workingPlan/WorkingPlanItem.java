package com.myshop.model.workingPlan;

import com.myshop.model.order.OrderItem;

public class WorkingPlanItem {

	private OrderItem orderItem;
	private boolean collected = false;
	private int itemsCollected = 0;

	@Deprecated
	public WorkingPlanItem(OrderItem orderItem, boolean collected) {
		this.orderItem = orderItem;
		this.collected = collected;
	}
	
	public WorkingPlanItem(OrderItem orderItem, boolean collected, int itemsCollected) {
		this.orderItem = orderItem;
		this.collected = collected;
		this.setItemsCollected(itemsCollected);
	}
	
	public WorkingPlanItem() { }

	/**
	 * @return the orderItem
	 */
	public OrderItem getOrderItem() {
		return orderItem;
	}

	/**
	 * @param orderItem the orderItem to set
	 */
	public WorkingPlanItem setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
		return this;
	}

	/**
	 * @return if the item has been collected.
	 */
	public boolean getCollected() {
		return this.collected;
	}

	/**
	 * @param collected
	 */
	public WorkingPlanItem setCollected(boolean collected) {
		this.collected = collected;
		return this;
	}

	public int getItemsCollected() {
		return itemsCollected;
	}

	public void setItemsCollected(int itemsCollected) {
		this.itemsCollected = itemsCollected;
	}

}
