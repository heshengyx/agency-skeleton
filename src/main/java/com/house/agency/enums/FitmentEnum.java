package com.house.agency.enums;

public enum FitmentEnum {

	ROUGHCAST(CommonEnum.ONE, "毛坯"),
	SIMPLE(CommonEnum.TWO, "简装"),
	HARDBACK(CommonEnum.THREE, "精装");

	
	private String value;
	private String text;
	
	private FitmentEnum(String value, String text){
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
		for(FitmentEnum e : FitmentEnum.values()){
			if (e.getValue().equals(value)) {
				text = e.getText();
				break;
			}
        }
		return text;
	}
}
