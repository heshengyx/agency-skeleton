package com.house.agency.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.house.agency.entity.BuildingImage;
import com.house.agency.page.IPage;
import com.house.agency.param.BuildingImageQueryParam;

public interface IBuildingImageService {

	void save(BuildingImage param);
	void update(BuildingImage param);
	void deleteById(String id);
	BuildingImage getDataById(String id);
	
	IPage<BuildingImage> query(BuildingImageQueryParam param, int page, int rows);
	List<BuildingImage> list(BuildingImageQueryParam param);
	void upload(BuildingImage param, Map<String, File> map, String path);
	void delete(String id, String path);
}
