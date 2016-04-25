package com.house.agency.data.manage;

import java.io.Serializable;
import java.util.Date;

public class RegionManageData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6060017394477297741L;
	private String id;
	private String name;
	private String code;
	private String status;
	private Date createTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
}
