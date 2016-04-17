package com.house.agency.service;

import com.house.agency.entity.User;
import com.house.agency.page.IPage;
import com.house.agency.param.UserQueryParam;


public interface IUserService {

	void save(User param);
	void update(User param);
	void deleteById(String id);
	User getDataById(String id);
	User getDataByUsername(String username);

	IPage<User> query(UserQueryParam param, int page, int rows);
}
