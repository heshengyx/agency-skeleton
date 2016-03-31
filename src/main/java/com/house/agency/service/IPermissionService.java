package com.house.agency.service;

import com.house.agency.entity.Permission;
import com.house.agency.page.IPage;
import com.house.agency.param.PermissionQueryParam;

public interface IPermissionService {

	int save(Permission param);
	int update(Permission param);
	int delete(Permission param);
	Permission getData(Permission param);
	
	IPage<Permission> query(PermissionQueryParam param);
}
