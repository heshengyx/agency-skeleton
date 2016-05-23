package com.house.agency.enums;

public enum HouseEnum {

	NEW(CommonEnum.ONE, "新房"), 
	USED(CommonEnum.TWO, "二手房");
	
	private String value;
	private String text;
	
	private HouseEnum(String value, String text){
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
		for(HouseEnum e : HouseEnum.values()){
			if (e.getValue().equals(value)) {
				text = e.getText();
				break;
			}
        }
		return text;
	}
}
