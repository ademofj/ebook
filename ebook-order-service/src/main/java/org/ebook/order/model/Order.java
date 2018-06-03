package org.ebook.order.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	@Column(name = "product_id", nullable = false)
	Integer product_id;

	@Column(name = "price", nullable = false)
	Integer price;

	@Column(name = "user_id", nullable = false)
	Integer user_id;

	@Column(name = "trade_id", nullable = false)
	Integer trade_id;
	
	@Column(name = "trade_status", nullable = false)
	Integer trade_status;

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

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getTrade_id() {
		return trade_id;
	}

	public void setTrade_id(Integer trade_id) {
		this.trade_id = trade_id;
	}

	public Integer getTrade_status() {
		return trade_status;
	}

	public void setTrade_status(Integer trade_status) {
		this.trade_status = trade_status;
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
		return "Order [id=" + id + ", product_id=" + product_id + ", price=" + price + ", user_id=" + user_id
				+ ", trade_id=" + trade_id + ", trade_status=" + trade_status + ", deleted=" + deleted
				+ ", create_time=" + create_time + ", update_time=" + update_time + "]";
	}


	

}