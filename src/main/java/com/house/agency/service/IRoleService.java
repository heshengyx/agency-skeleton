package com.house.agency.service;

import com.house.agency.entity.Role;

public interface IRoleService {

	int save(Role param);
	int update(Role param);
	int delete(Role param);
	Role getData(Role param);
}
