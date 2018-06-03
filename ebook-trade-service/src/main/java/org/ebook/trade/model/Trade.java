package org.ebook.trade.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trade")
public class Trade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	@Column(name = "order_id", nullable = false)
	Integer order_id;

	@Column(name = "user_id", nullable = false)
	Integer user_id;

	@Column(name = "price", nullable = false)
	Integer price;

	
	@Column(name = "pay_status", nullable = false)
	Integer pay_status;

	@Column(name = "pay_type", nullable = false)
	Integer pay_type;
	
	
	@Column(name = "gateway_pay_num", nullable = false)
	String gateway_pay_num;
	
	@Column(name = "gateway_pay_time", nullable = false)
	Date gateway_pay_time;
	
	@Column(name = "gateway_pay_price", nullable = false)
	Integer gateway_pay_price;

	@Column(name = "deleted", nullable = false)
	Integer deleted;

	@Column(name = "create_time", nullable = false)
	Date create_time;

	@Column(name = "update_time", nullable = false)
	Date update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPay_status() {
		return pay_status;
	}

	public void setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
	}

	public Integer getPay_type() {
		return pay_type;
	}

	public void setPay_type(Integer pay_type) {
		this.pay_type = pay_type;
	}

	public String getGateway_pay_num() {
		return gateway_pay_num;
	}

	public void setGateway_pay_num(String gateway_pay_num) {
		this.gateway_pay_num = gateway_pay_num;
	}

	public Date getGateway_pay_time() {
		return gateway_pay_time;
	}

	public void setGateway_pay_time(Date gateway_pay_time) {
		this.gateway_pay_time = gateway_pay_time;
	}

	
	public Integer getGateway_pay_price() {
		return gateway_pay_price;
	}

	public void setGateway_pay_price(Integer gateway_pay_price) {
		this.gateway_pay_price = gateway_pay_price;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", order_id=" + order_id + ", user_id=" + user_id + ", price=" + price
				+ ", pay_status=" + pay_status + ", pay_type=" + pay_type + ", gateway_pay_num=" + gateway_pay_num
				+ ", gateway_pay_time=" + gateway_pay_time + ", gateway_pay_price=" + gateway_pay_price + ", deleted="
				+ deleted + ", create_time=" + create_time + ", update_time=" + update_time + "]";
	}
	

}