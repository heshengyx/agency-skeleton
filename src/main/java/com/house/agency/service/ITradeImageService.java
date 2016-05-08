package com.house.agency.service;

import com.house.agency.entity.TradeImage;

public interface ITradeImageService {

	String save(TradeImage param);
	void update(TradeImage param);
	void deleteById(String id);
	TradeImage getDataById(String id);
	void cover(TradeImage param);
}
