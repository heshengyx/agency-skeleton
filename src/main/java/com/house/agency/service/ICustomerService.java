package com.house.agency.service;

import com.house.agency.entity.Customer;
import com.house.agency.page.IPage;
import com.house.agency.param.CustomerQueryParam;

public interface ICustomerService {

	void save(Customer param);

	void update(Customer param);

	void deleteById(String id);

	Customer getDataById(String id);

	IPage<Customer> query(CustomerQueryParam param, int page, int rows);
	
	void saveOrUpdate(Customer param);
}
