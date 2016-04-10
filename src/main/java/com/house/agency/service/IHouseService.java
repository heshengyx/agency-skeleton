package com.house.agency.service;

import com.house.agency.data.HouseDetailData;
import com.house.agency.data.HouseListData;
import com.house.agency.entity.House;
import com.house.agency.page.IPage;
import com.house.agency.param.HouseQueryParam;

public interface IHouseService {

	void save(House param);
	void update(House param);
	void deleteById(String id);
	House getDataById(String id);
	IPage<House> query(HouseQueryParam param, int page, int rows);
	
	HouseDetailData getData(String tradeId);
	IPage<HouseListData> queryData(HouseQueryParam param, int page, int rows);
}