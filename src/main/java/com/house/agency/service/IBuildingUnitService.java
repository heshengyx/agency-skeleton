package com.house.agency.service;

import com.house.agency.entity.BuildingUnit;
import com.house.agency.page.IPage;
import com.house.agency.param.BuildingUnitQueryParam;

public interface IBuildingUnitService {

	void save(BuildingUnit param);
	void update(BuildingUnit param);
	void deleteById(String id);
	BuildingUnit getDataById(String id);
	
	IPage<BuildingUnit> query(BuildingUnitQueryParam param, int page, int rows);
}
