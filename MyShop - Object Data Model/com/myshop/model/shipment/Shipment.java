package com.myshop.model.shipment;

import java.util.ArrayList;
import java.util.List;

import com.myshop.model.contracts.DatabaseEntity;
import com.myshop.model.order.MailBox;
import com.myshop.model.warehouseKeeper.WarehouseKeeper;

public class Shipment implements DatabaseEntity {
	
	private int ID;
	private List<MailBox> boxes;
	private Transporter transporter;
	private WarehouseKeeper owner;
	private boolean sent = false;
	
	public Shipment() {
		setBoxes(new ArrayList<MailBox>());
	}
	
	public Shipment(int ID, Transporter transporter, WarehouseKeeper owner) {
		setID(ID);
		setTransporter(transporter);
		setBoxes(new ArrayList<MailBox>());
		setOwner(owner);
	}
	
	@Deprecated
	public Shipment(int ID, Transporter transporter) {
		setID(ID);
		setTransporter(transporter);
		setBoxes(new ArrayList<MailBox>());
	}

	@Override
	public int getID() {
		return this.ID;
	}

	@Override
	public Shipment setID(int ID) {
		this.ID = ID;
		return this;
	}

	public List<MailBox> getBoxes() {
		return boxes;
	}

	public Shipment setBoxes(List<MailBox> boxes) {
		this.boxes = boxes;
		return this;
	}

	public Transporter getTransporter() {
		return transporter;
	}

	public Shipment setTransporter(Transporter transporter) {
		this.transporter = transporter;
		return this;
	}

	public boolean isSent() {
		return sent;
	}

	public void setSent(boolean sent) {
		this.sent = sent;
	}

	public WarehouseKeeper getOwner() {
		return owner;
	}

	public void setOwner(WarehouseKeeper owner) {
		this.owner = owner;
	}

}
