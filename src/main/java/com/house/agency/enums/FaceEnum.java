package com.house.agency.enums;

public enum FaceEnum {

	EAST("1", "东"), 
    SOUTH("2", "南"),
    WEST("3", "西"),
    NORTH("4", "北");
	
	private String value;
	private String text;
	
	private FaceEnum(String value, String text){
		this.value = value;
		this.text = text;
	}
	
	public String getValue(){
		return this.value;
	}
	public String getText(){
		return this.text;
	}
}
