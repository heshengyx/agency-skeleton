package com.house.agency.service;

import com.house.agency.entity.CustomerRequire;
import com.house.agency.page.IPage;
import com.house.agency.param.CustomerRequireQueryParam;

public interface ICustomerRequireService {

	void save(CustomerRequire param);

	void update(CustomerRequire param);

	void deleteById(String id);

	CustomerRequire getDataById(String id);

	IPage<CustomerRequire> query(CustomerRequireQueryParam param, int page,
			int rows);
	
	void saveOrUpdate(CustomerRequire param);
}
