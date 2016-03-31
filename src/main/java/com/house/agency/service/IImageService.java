package com.house.agency.service;

import com.house.agency.entity.Image;
import com.house.agency.page.IPage;
import com.house.agency.param.ImageQueryParam;

public interface IImageService {

	void save(Image param);
	void update(Image param);
	void deleteById(String id);
	Image getDataById(String id);

	IPage<Image> query(ImageQueryParam param, int page, int rows);
}
