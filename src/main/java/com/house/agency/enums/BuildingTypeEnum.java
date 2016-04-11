package com.house.agency.enums;

public enum BuildingTypeEnum {

	HOUSE(CommonEnum.ONE, "住宅"), 
	SHOP(CommonEnum.TWO, "商铺");
	
	private String value;
	private String text;
	
	private BuildingTypeEnum(String value, String text){
		this.value = value;
		this.text = text;
	}
	
	public String getValue(){
		return this.value;
	}
	public String getText(){
		return this.text;
	}
	
	public static String getTextByValue(String value) {
		String text = "";
		for(BuildingTypeEnum e : BuildingTypeEnum.values()){
			if (e.getValue().equals(value)) {
				text = e.getText();
				break;
			}
        }
		return text;
	}
}
