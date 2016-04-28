package com.house.agency.page;

import java.util.ArrayList;
import java.util.Collection;

public class Page<T> implements IPage<T> {

	/**  */
	private static final long serialVersionUID = 4336812407961532349L;

	// the record in page
	private int size;

	// page index
	private int index;

	// the record total
	private int total;

	private int totalRecord;

	private Collection<T> data;

	public Page() {
	}

	public Page(Collection<T> data, int totalRecord, int index, int size) {
		this.data = (data == null ? new ArrayList<T>(0) : data);
		this.totalRecord = totalRecord;
		this.size = size;
		this.index = index;
		this.total = (totalRecord - 1) / size + 1;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSize() {
		return size;
	}

	public int getTotal() {
		return total;
	}

	public int getIndex() {
		return index;
	}

	public Collection<T> getData() {
		return data;
	}

}
