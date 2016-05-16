package com.house.agency.enums;

public enum ConfigureEnum {
	
	UPLOAD_FOLDER("upload_folder"),
	IMAGE_WIDTH("image_width"),
	IMAGE_HEIGHT("image_height"),
	IMAGE_BLANK("image_blank"),
	IMAGE_URL("image_url"),
	PROFILE_BLANK("profile_blank"),
	MATCH("match"),
	FACES("faces");
	
	private final String value;
	
	ConfigureEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
