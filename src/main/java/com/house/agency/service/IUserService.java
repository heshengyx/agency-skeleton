package com.house.agency.service;

import com.house.agency.entity.User;
import com.house.agency.page.IPage;
import com.house.agency.param.UserQueryParam;


public interface IUserService {

	void save(User param);
	void update(User param);
	void deleteById(String id);
	User getDataById(String id);
	User getDataByAccount(String account);

	IPage<User> query(UserQueryParam param, int page, int rows);
	
	void checkByAccount(String account);
	void signup(User param);
}
