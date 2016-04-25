package com.house.agency.param.manage;

import com.house.agency.param.QueryParam;

public class RegionManageQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1992923274209511813L;
	private String parentId;
	private String name;
	private String code;
	
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
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
}
