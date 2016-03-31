package com.house.agency.param;

import java.util.Date;

public class PermissionQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7241466352812943665L;
	private String name;
	private String status;
	private Date createTime;
	private String parentId;
	private String roleId;
	
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
