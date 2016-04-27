package com.house.agency.service;

import com.house.agency.entity.Configure;
import com.house.agency.page.IPage;
import com.house.agency.param.ConfigureQueryParam;

public interface IConfigureService {

	void save(Configure param);

	void update(Configure param);

	void deleteById(String id);

	Configure getDataById(String id);

	IPage<Configure> query(ConfigureQueryParam param, int page, int rows);
	
	String getValueByKey(String key);
}
