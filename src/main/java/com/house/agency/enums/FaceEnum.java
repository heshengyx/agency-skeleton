package com.house.agency.enums;


public enum FaceEnum {

	EAST(CommonEnum.ONE, "东"), 
    SOUTH(CommonEnum.TWO, "南"),
    WEST(CommonEnum.THREE, "西"),
    NORTH(CommonEnum.FOUR, "北");
	
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
	
	public static String getTextByValue(String value) {
		String text = "";
		for(FaceEnum e : FaceEnum.values()){
			if (e.getValue().equals(value)) {
				text = e.getText();
				break;
			}
        }
		return text;
	}
}
