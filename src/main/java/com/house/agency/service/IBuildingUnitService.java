package com.house.agency.service;

import java.util.List;

import com.house.agency.data.manage.BuildingUnitManageData;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.page.IPage;
import com.house.agency.param.BuildingUnitQueryParam;
import com.house.agency.param.manage.BuildingUnitManageQueryParam;

public interface IBuildingUnitService {

	void save(BuildingUnit param);

	void update(BuildingUnit param);

	void deleteById(String id);

	BuildingUnit getDataById(String id);

	IPage<BuildingUnit> query(BuildingUnitQueryParam param, int page, int rows);

	List<BuildingUnit> queryByBuildingId(String buildingId);

	IPage<BuildingUnitManageData> queryManageData(BuildingUnitManageQueryParam param, int page, int rows);
}
