package com.house.agency.enums;

public enum OwnerEnum {

	INDIVIDUAL(CommonEnum.ONE, "个人产权"),
	COLLECTIVE(CommonEnum.TWO, "集体产权");

	
	private String value;
	private String text;
	
	private OwnerEnum(String value, String text){
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
