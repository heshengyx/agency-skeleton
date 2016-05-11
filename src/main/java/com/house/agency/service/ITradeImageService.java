package com.house.agency.service;

import com.house.agency.entity.TradeImage;
import com.house.agency.param.TradeImageParam;

public interface ITradeImageService {

	void save(TradeImage param);
	void update(TradeImage param);
	void deleteById(String id);
	TradeImage getDataById(String id);
	void cover(TradeImage param);
	String saveData(TradeImageParam param);
}
