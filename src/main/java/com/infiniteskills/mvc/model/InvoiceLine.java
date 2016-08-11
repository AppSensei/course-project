package com.infiniteskills.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InvoiceLine")
public class InvoiceLine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="InvoiceLineId")
	private int invoiceLineId;
	
	@Column(name="InvoiceId")
	private int invoiceId;
	
	@Column(name="TrackId")
	private int trackId;
	
	@Column(name="UnitPrice")
	private double unitPrice;
	
	@Column(name="Quantity")
	private int quantity;

	public int getInvoiceLineId() {
		return invoiceLineId;
	}

	public void setInvoiceLineId(int invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
