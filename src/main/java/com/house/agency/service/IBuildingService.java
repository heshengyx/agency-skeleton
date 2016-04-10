package com.house.agency.service;

import java.util.List;

import com.house.agency.data.BuildingData;
import com.house.agency.entity.Building;
import com.house.agency.page.IPage;
import com.house.agency.param.BuildingQueryParam;

public interface IBuildingService {

	void save(Building param);
	void update(Building param);
	void deleteById(String id);
	Building getDataById(String id);
	
	IPage<Building> query(BuildingQueryParam param, int page, int rows);
	List<BuildingData> list(BuildingQueryParam param);
}
