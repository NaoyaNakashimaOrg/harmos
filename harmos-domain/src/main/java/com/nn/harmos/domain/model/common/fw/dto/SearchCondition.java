package com.nn.harmos.domain.model.common.fw.dto;

import java.io.Serializable;

public class SearchCondition implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7949876669695027772L;

	private int from;

	private int to;

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

}
