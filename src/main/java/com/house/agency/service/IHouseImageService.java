package com.house.agency.service;

import com.house.agency.entity.HouseImage;
import com.house.agency.page.IPage;
import com.house.agency.param.HouseImageQueryParam;

public interface IHouseImageService {

	void save(HouseImage param);
	void update(HouseImage param);
	void deleteById(String id);
	HouseImage getDataById(String id);
	
	IPage<HouseImage> query(HouseImageQueryParam param, int page, int rows);
}