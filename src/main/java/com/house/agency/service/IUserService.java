package com.house.agency.service;

import com.house.agency.entity.User;
import com.house.agency.page.IPage;
import com.house.agency.param.UserQueryParam;


public interface IUserService {

	int save(User param);
	int update(User param);
	int deleteById(String id);
	User getDataById(String id);
	User getDataByUsername(User param);

	IPage<User> query(UserQueryParam param);
}
