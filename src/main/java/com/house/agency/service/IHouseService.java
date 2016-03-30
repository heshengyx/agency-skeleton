package com.house.agency.service;

import com.house.agency.entity.House;
import com.house.agency.page.IPage;
import com.house.agency.param.HouseQueryParam;

public interface IHouseService {

	void save(House param);
	void update(House param);
	void deleteById(String id);
	House getDataById(String id);
	
	IPage<House> query(HouseQueryParam param, int page, int rows);
}