package com.house.agency.service;

import com.house.agency.entity.Trade;
import com.house.agency.page.IPage;
import com.house.agency.param.TradeQueryParam;

public interface ITradeService {

	void save(Trade param);
	void update(Trade param);
	void deleteById(String id);
	Trade getDataById(String id);

	IPage<Trade> query(TradeQueryParam param, int page, int rows);
	void saveOrUpdate(Trade param);
}
