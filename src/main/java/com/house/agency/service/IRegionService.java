package com.house.agency.service;

import java.util.List;
import java.util.Map;

import com.house.agency.data.manage.RegionManageData;
import com.house.agency.entity.Region;
import com.house.agency.page.IPage;
import com.house.agency.param.RegionQueryParam;
import com.house.agency.param.manage.RegionManageQueryParam;

public interface IRegionService {

	void save(Region param);

	void update(Region param);
	
	void saveOrUpdate(Region param);

	void deleteById(String id);

	Region getDataById(String id);

	IPage<Region> query(RegionQueryParam param, int page, int rows);

	List<Region> list(RegionQueryParam param);
	
	IPage<RegionManageData> queryManageData(RegionManageQueryParam param,
			int page, int rows);
	
	Map<String, List<Region>> getRegionById(String id, Map<String, List<Region>> regions);
}
