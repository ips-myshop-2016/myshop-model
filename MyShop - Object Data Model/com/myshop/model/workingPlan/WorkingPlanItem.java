package com.myshop.model.workingPlan;

import com.myshop.model.order.OrderItem;

public class WorkingPlanItem  {
	
	private OrderItem orderItem;
	private boolean collected = false;
	
	public WorkingPlanItem(OrderItem orderItem, boolean collected) {
		this.orderItem = orderItem;
		this.collected = collected;
	}

	/**
	 * @return the orderItem
	 */
	public OrderItem getOrderItem() { return orderItem; }
	
	/**
	 * @param orderItem the orderItem to set
	 */
	public void setOrderItem(OrderItem orderItem) { this.orderItem = orderItem; }
	
	/**
	 * @return if the item has been collected.
	 */
	public boolean getCollected() { return this.collected; }
	
	/**
	 * @param collected
	 */
	public void setCollected(boolean collected) { this.collected = collected; }

}
