package com.house.agency.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.house.agency.data.ImageData;
import com.house.agency.entity.Image;
import com.house.agency.page.IPage;
import com.house.agency.param.ImageParam;
import com.house.agency.param.ImageQueryParam;

public interface IImageService {

	void save(Image param);

	void update(Image param);

	void deleteById(String id);

	Image getDataById(String id);

	IPage<Image> query(ImageQueryParam param, int page, int rows);

	List<Image> queryData(ImageQueryParam param);

	List<Image> queryDataByFid(ImageQueryParam param);

	Image upload(ImageParam param, Map<String, File> map, String path);

	void trash(String id, String path);
	
	List<ImageData> queryDataByFuid(ImageQueryParam param);
	
	List<ImageData> queryHomeDataByFuid(ImageQueryParam param);
}
