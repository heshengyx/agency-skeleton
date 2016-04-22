package com.house.agency.param;

import java.io.Serializable;

public class ImageParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2515078973110512750L;
	private String foreignId;
	private String type;
	private String folder;
	
	public String getForeignId() {
		return foreignId;
	}
	public void setForeignId(String foreignId) {
		this.foreignId = foreignId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFolder() {
		return folder;
	}
	public void setFolder(String folder) {
		this.folder = folder;
	}
}
