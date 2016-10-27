package com.myshop.model.workingPlan;

import java.util.List;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.people.WarehouseKeeper;

/**
 * Working Plan ODM.
 * 
 * @version 2610161321
 * @author Guillermo Facundo Colunga
 */
public class WorkingPlan implements DatabaseEntity {

	private int ID;
	private WarehouseKeeper wk = new WarehouseKeeper();
	private List<WorkingPlanItem> items;

	/**
	 * @return the wpID
	 */
	@Override
	public int getID() { return ID; }

	/**
	 * @param wpID the wpID to set
	 */
	@Override
	public void setID(int wpID) { this.ID = wpID; }

	/**
	 * @return the warehouse keeper.
	 */
	public WarehouseKeeper getWarehouseKeeper() { return this.wk; }
	
	/**
	 * @param warehouseKeeper is the warehouse keeper assigned to this workingPlan.
	 */
	public void setWarehouseKeeper(WarehouseKeeper warehouseKeeper) { this.wk= warehouseKeeper; }
	
	/**
	 * @return the list of items.
	 */
	public List<WorkingPlanItem> getItems() { return this.items; }
	
	/**
	 * @param items the list of items.
	 */
	public void setItems(List<WorkingPlanItem> items) { this.items = items; }
}
