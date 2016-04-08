package com.house.agency.param;

public class TradeQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2552853770169182981L;
	private int pattern;
	private int areaBegin;
	private int areaEnd;
	private String symbol;
	
	public int getPattern() {
		return pattern;
	}
	public void setPattern(int pattern) {
		this.pattern = pattern;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getAreaBegin() {
		return areaBegin;
	}
	public void setAreaBegin(int areaBegin) {
		this.areaBegin = areaBegin;
	}
	public int getAreaEnd() {
		return areaEnd;
	}
	public void setAreaEnd(int areaEnd) {
		this.areaEnd = areaEnd;
	}
}
