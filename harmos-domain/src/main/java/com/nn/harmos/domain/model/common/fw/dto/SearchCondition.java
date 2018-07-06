package com.nn.harmos.domain.model.common.fw.dto;

import java.io.Serializable;

public class SearchCondition implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4893719524831489761L;

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
