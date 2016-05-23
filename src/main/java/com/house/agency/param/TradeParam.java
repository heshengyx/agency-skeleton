package com.house.agency.param;

import java.io.Serializable;

public class TradeParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8008159588638730167L;

	private String id;
	private String buildingId;
	private String houseId;
	private String userId;
	private String imageId;
	private String title;
	private long price;
	private String matchs;
	private String content;
	private String type;
	private String style;
	private int images;
	
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public int getImages() {
		return images;
	}
	public void setImages(int images) {
		this.images = images;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getMatchs() {
		return matchs;
	}
	public void setMatchs(String matchs) {
		this.matchs = matchs;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
}
