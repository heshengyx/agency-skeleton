package com.house.agency.service;

import java.util.List;

import com.house.agency.entity.Role;
import com.house.agency.page.IPage;
import com.house.agency.param.RoleQueryParam;

public interface IRoleService {

	int save(Role param);
	int update(Role param);
	int delete(Role param);
	Role getData(Role param);
	
	IPage<Role> query(RoleQueryParam param);
	List<Role> list(RoleQueryParam param);
	
	List<Role> queryRolesByUserId(String userId);
}
