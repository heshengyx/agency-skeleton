package com.house.agency.enums;

public enum TradeEnum {

	SALE(CommonEnum.ONE, "出售"), 
	RENT(CommonEnum.TWO, "出租");
	
	private String value;
	private String text;
	
	private TradeEnum(String value, String text){
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
		for(TradeEnum e : TradeEnum.values()){
			if (e.getValue().equals(value)) {
				text = e.getText();
				break;
			}
        }
		return text;
	}
}
