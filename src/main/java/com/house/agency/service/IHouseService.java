package com.house.agency.service;

import java.util.List;

import com.house.agency.data.HouseData;
import com.house.agency.data.HouseInfoData;
import com.house.agency.data.home.HouseHomeData;
import com.house.agency.data.home.HouseHomeDescData;
import com.house.agency.data.manage.HouseManageData;
import com.house.agency.entity.House;
import com.house.agency.page.IPage;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.param.home.HouseHomeQueryParam;
import com.house.agency.param.manage.HouseManageQueryParam;

public interface IHouseService {

	void save(House param);

	void update(House param);

	void deleteById(String id);

	House getDataById(String id);

	IPage<House> query(HouseQueryParam param, int page, int rows);

	HouseInfoData getData(String tradeId);

	IPage<HouseData> queryData(HouseQueryParam param, int page, int rows);

	List<HouseHomeDescData> queryByBuildingUnitId(String buildingUnitId);

	IPage<HouseHomeData> queryHomeData(HouseHomeQueryParam param,
			int page, int rows);
	
	IPage<HouseManageData> queryManageData(HouseManageQueryParam param,
			int page, int rows);
	
	IPage<HouseHomeData> queryByCustomerRequire(HouseHomeQueryParam param,
			int page, int rows);
}