package com.myshop.model.workingPlan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.warehouseKeeper.WarehouseKeeper;

/**
 * Working Plan ODM.
 * 
 * @version 2610161321
 * @author Guillermo Facundo Colunga
 */
public class WorkingPlan implements DatabaseEntity {

	private int ID;
	private WarehouseKeeper wk;
	private List<WorkingPlanItem> items;
	private Date generated;
	private Date completed;

	@Deprecated
	public WorkingPlan(int ID, WarehouseKeeper wk,
			List<WorkingPlanItem> items) {
		this.ID = ID;
		this.wk = wk;
		this.items = items;
	}

	@Deprecated
	public WorkingPlan() {
		wk = new WarehouseKeeper();
		items = new ArrayList<WorkingPlanItem>();
	}

	/**
	 * @return the wpID
	 */
	@Override
	public int getID() {
		return ID;
	}

	/**
	 * @param wpID the wpID to set
	 */
	@Override
	public WorkingPlan setID(int wpID) {
		this.ID = wpID;
		return this;
	}

	/**
	 * @return the warehouse keeper.
	 */
	public WarehouseKeeper getWarehouseKeeper() {
		return this.wk;
	}

	/**
	 * @param warehouseKeeper is the warehouse keeper assigned to this
	 *            workingPlan.
	 */
	public WorkingPlan setWarehouseKeeper(WarehouseKeeper warehouseKeeper) {
		this.wk = warehouseKeeper;
		return this;
	}

	/**
	 * @return the list of items.
	 */
	public List<WorkingPlanItem> getItems() {
		return this.items;
	}

	/**
	 * @param items the list of items.
	 */
	public WorkingPlan setItems(List<WorkingPlanItem> items) {
		this.items = items;
		return this;
	}

	public Date getGenerated() {
		return generated;
	}

	public void setGenerated(Date generated) {
		this.generated = generated;
	}

	public Date getCompleted() {
		return completed;
	}

	public void setCompleted(Date completed) {
		this.completed = completed;
	}
}
