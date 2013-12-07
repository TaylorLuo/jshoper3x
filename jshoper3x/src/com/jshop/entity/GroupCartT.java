package com.jshop.entity;

// Generated 2013-12-7 17:08:38 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GroupCartT generated by hbm2java
 */
@Entity
@Table(name = "group_cart_t", catalog = "jshoper3")
public class GroupCartT implements java.io.Serializable {

	private String id;
	private String cartid;
	private String orderid;
	private String goodsid;
	private String goodsname;
	private String userid;
	private String username;
	private int needquantity;
	private double price;
	private double groupprice;
	private Double changeprice;
	private double points;
	private double subtotal;
	private Date addtime;
	private Integer quantity;
	private String picture;
	private String usersetnum;
	private String weight;
	private String state;
	private String htmlpath;
	private String productid;

	public GroupCartT() {
	}

	public GroupCartT(String id, String goodsid, String goodsname,
			String userid, String username, int needquantity, double price,
			double groupprice, double points, double subtotal, Date addtime,
			String picture, String usersetnum, String state, String htmlpath,
			String productid) {
		this.id = id;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.userid = userid;
		this.username = username;
		this.needquantity = needquantity;
		this.price = price;
		this.groupprice = groupprice;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.state = state;
		this.htmlpath = htmlpath;
		this.productid = productid;
	}

	public GroupCartT(String id, String cartid, String orderid, String goodsid,
			String goodsname, String userid, String username, int needquantity,
			double price, double groupprice, Double changeprice, double points,
			double subtotal, Date addtime, Integer quantity, String picture,
			String usersetnum, String weight, String state, String htmlpath,
			String productid) {
		this.id = id;
		this.cartid = cartid;
		this.orderid = orderid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.userid = userid;
		this.username = username;
		this.needquantity = needquantity;
		this.price = price;
		this.groupprice = groupprice;
		this.changeprice = changeprice;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.quantity = quantity;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.weight = weight;
		this.state = state;
		this.htmlpath = htmlpath;
		this.productid = productid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "CARTID", length = 20)
	public String getCartid() {
		return this.cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
	}

	@Column(name = "ORDERID", length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "GOODSNAME", nullable = false, length = 100)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "USERID", nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "NEEDQUANTITY", nullable = false)
	public int getNeedquantity() {
		return this.needquantity;
	}

	public void setNeedquantity(int needquantity) {
		this.needquantity = needquantity;
	}

	@Column(name = "PRICE", nullable = false, precision = 10)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "GROUPPRICE", nullable = false, precision = 10)
	public double getGroupprice() {
		return this.groupprice;
	}

	public void setGroupprice(double groupprice) {
		this.groupprice = groupprice;
	}

	@Column(name = "CHANGEPRICE", precision = 10)
	public Double getChangeprice() {
		return this.changeprice;
	}

	public void setChangeprice(Double changeprice) {
		this.changeprice = changeprice;
	}

	@Column(name = "POINTS", nullable = false, precision = 10)
	public double getPoints() {
		return this.points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	@Column(name = "SUBTOTAL", nullable = false, precision = 10)
	public double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ADDTIME", nullable = false, length = 0)
	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	@Column(name = "QUANTITY")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "PICTURE", nullable = false, length = 250)
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name = "USERSETNUM", nullable = false, length = 20)
	public String getUsersetnum() {
		return this.usersetnum;
	}

	public void setUsersetnum(String usersetnum) {
		this.usersetnum = usersetnum;
	}

	@Column(name = "WEIGHT", length = 20)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "HTMLPATH", nullable = false)
	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	@Column(name = "PRODUCTID", nullable = false, length = 20)
	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

}
