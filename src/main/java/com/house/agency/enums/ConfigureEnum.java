package com.house.agency.enums;

public enum ConfigureEnum {
	
	UPLOAD_FOLDER("upload_folder"),
	IMAGE_WIDTH("image_width"),
	IMAGE_HEIGHT("image_height"),
	IMAGE_BLANK("image_blank"),
	IMAGE_URL("image_url"),
	PROFILE_BLANK("profile_blank"),
	MATCHS("matchs"),
	FACES("faces"),
	ROOMS("rooms"),
	SALOONS("saloons"),
	TOILETS("toilets"),
	
	FITMENTS("fitments"),
	PROPERTYS("propertys"),
	BUILDING_TYPES("building_types"),
	
	PRICES("prices"),
	AREAS("areas"),
	PATTERNS("patterns"),
	SUBWAYS("subways");
	
	private final String value;
	
	ConfigureEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
