package com.house.agency.param;

import java.io.Serializable;

public class QueryParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6056569204683753213L;
	protected String draw;
	protected int start;
	protected int page;
	protected int length;
	
	public String getDraw() {
		return draw;
	}
	public void setDraw(String draw) {
		this.draw = draw;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getPage() {
		return start / length + 1;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
