package com.house.agency.entity;

import java.io.Serializable;

public class CustomerRequireNum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8903345797663660970L;
	private String id;
	private String requireId;
	private int num;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRequireId() {
		return requireId;
	}
	public void setRequireId(String requireId) {
		this.requireId = requireId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
