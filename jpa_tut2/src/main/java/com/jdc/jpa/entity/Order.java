package com.jdc.jpa.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity
@Table(name = "order_tbl")
public class Order implements Serializable {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer order_id;
	private String item;
	private Integer unitPrice;
	private Integer count;
	private static final long serialVersionUID = 1L;

	public Order() {
		super();
	}   
	public Integer getOrder_id() {
		return this.order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}   
	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}   
	public Integer getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}   
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
   
}
