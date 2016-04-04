package com.house.agency.param;

public class RegionQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7099805599561943303L;
	private String code;
	private String level;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
