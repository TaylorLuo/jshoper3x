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
 * AdvertiseT generated by hbm2java
 */
@Entity
@Table(name = "advertise_t", catalog = "jshoper3")
public class AdvertiseT implements java.io.Serializable {

	private String id;
	private String type;
	private String advPath;
	private String showPosition;
	private int showAmount;
	private double showCount;
	private String showWhere;
	private String alt;
	private Date begintime;
	private Date endtime;
	private Date createtime;
	private String creatorid;
	private String state;
	private String templateName;
	private int sort;
	private int height;
	private int width;
	private int versiont;

	public AdvertiseT() {
	}

	public AdvertiseT(String id, String type, String advPath,
			String showPosition, int showAmount, double showCount,
			String showWhere, String alt, Date begintime, Date endtime,
			Date createtime, String state, int sort, int height, int width,
			int versiont) {
		this.id = id;
		this.type = type;
		this.advPath = advPath;
		this.showPosition = showPosition;
		this.showAmount = showAmount;
		this.showCount = showCount;
		this.showWhere = showWhere;
		this.alt = alt;
		this.begintime = begintime;
		this.endtime = endtime;
		this.createtime = createtime;
		this.state = state;
		this.sort = sort;
		this.height = height;
		this.width = width;
		this.versiont = versiont;
	}

	public AdvertiseT(String id, String type, String advPath,
			String showPosition, int showAmount, double showCount,
			String showWhere, String alt, Date begintime, Date endtime,
			Date createtime, String creatorid, String state,
			String templateName, int sort, int height, int width, int versiont) {
		this.id = id;
		this.type = type;
		this.advPath = advPath;
		this.showPosition = showPosition;
		this.showAmount = showAmount;
		this.showCount = showCount;
		this.showWhere = showWhere;
		this.alt = alt;
		this.begintime = begintime;
		this.endtime = endtime;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
		this.templateName = templateName;
		this.sort = sort;
		this.height = height;
		this.width = width;
		this.versiont = versiont;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TYPE", nullable = false, length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "ADV_PATH", nullable = false)
	public String getAdvPath() {
		return this.advPath;
	}

	public void setAdvPath(String advPath) {
		this.advPath = advPath;
	}

	@Column(name = "SHOW_POSITION", nullable = false, length = 1)
	public String getShowPosition() {
		return this.showPosition;
	}

	public void setShowPosition(String showPosition) {
		this.showPosition = showPosition;
	}

	@Column(name = "SHOW_AMOUNT", nullable = false)
	public int getShowAmount() {
		return this.showAmount;
	}

	public void setShowAmount(int showAmount) {
		this.showAmount = showAmount;
	}

	@Column(name = "SHOW_COUNT", nullable = false, precision = 10)
	public double getShowCount() {
		return this.showCount;
	}

	public void setShowCount(double showCount) {
		this.showCount = showCount;
	}

	@Column(name = "SHOW_WHERE", nullable = false, length = 1)
	public String getShowWhere() {
		return this.showWhere;
	}

	public void setShowWhere(String showWhere) {
		this.showWhere = showWhere;
	}

	@Column(name = "ALT", nullable = false, length = 100)
	public String getAlt() {
		return this.alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BEGINTIME", nullable = false, length = 0)
	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDTIME", nullable = false, length = 0)
	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "TEMPLATE_NAME", length = 45)
	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@Column(name = "SORT", nullable = false)
	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Column(name = "HEIGHT", nullable = false)
	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Column(name = "WIDTH", nullable = false)
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

}
