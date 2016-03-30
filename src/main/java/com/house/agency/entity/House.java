package com.house.agency.entity;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -528732409800963930L;
	private String id;
	private String buildingUnitId;
	private String status;
	private Date createTime;
	private Date updateTime;
	private String remarks;
	
	public String getBuildingUnitId() {
		return buildingUnitId;
	}
	public void setBuildingUnitId(String buildingUnitId) {
		this.buildingUnitId = buildingUnitId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
