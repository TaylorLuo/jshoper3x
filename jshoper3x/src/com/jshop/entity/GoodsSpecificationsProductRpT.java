package com.jshop.entity;

// Generated 2013-12-7 17:08:38 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GoodsSpecificationsProductRpT generated by hbm2java
 */
@Entity
@Table(name = "goods_specifications_product_rp_t", catalog = "jshoper3")
public class GoodsSpecificationsProductRpT implements java.io.Serializable {

	private String goodsSpecificationsProductRpTid;
	private String goodsid;
	private String specidicationsid;
	private String productid;

	public GoodsSpecificationsProductRpT() {
	}

	public GoodsSpecificationsProductRpT(
			String goodsSpecificationsProductRpTid, String goodsid,
			String specidicationsid) {
		this.goodsSpecificationsProductRpTid = goodsSpecificationsProductRpTid;
		this.goodsid = goodsid;
		this.specidicationsid = specidicationsid;
	}

	public GoodsSpecificationsProductRpT(
			String goodsSpecificationsProductRpTid, String goodsid,
			String specidicationsid, String productid) {
		this.goodsSpecificationsProductRpTid = goodsSpecificationsProductRpTid;
		this.goodsid = goodsid;
		this.specidicationsid = specidicationsid;
		this.productid = productid;
	}

	@Id
	@Column(name = "GOODS_SPECIFICATIONS_PRODUCT_RP_TID", unique = true, nullable = false, length = 45)
	public String getGoodsSpecificationsProductRpTid() {
		return this.goodsSpecificationsProductRpTid;
	}

	public void setGoodsSpecificationsProductRpTid(
			String goodsSpecificationsProductRpTid) {
		this.goodsSpecificationsProductRpTid = goodsSpecificationsProductRpTid;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "SPECIDICATIONSID", nullable = false, length = 200)
	public String getSpecidicationsid() {
		return this.specidicationsid;
	}

	public void setSpecidicationsid(String specidicationsid) {
		this.specidicationsid = specidicationsid;
	}

	@Column(name = "PRODUCTID", length = 20)
	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

}
