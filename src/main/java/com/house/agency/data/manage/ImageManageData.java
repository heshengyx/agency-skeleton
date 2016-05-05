package com.house.agency.data.manage;

import java.io.Serializable;

public class ImageManageData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2943936115109365659L;
	private String id;
	private String title;
	private String url;
	private String thumb;
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
