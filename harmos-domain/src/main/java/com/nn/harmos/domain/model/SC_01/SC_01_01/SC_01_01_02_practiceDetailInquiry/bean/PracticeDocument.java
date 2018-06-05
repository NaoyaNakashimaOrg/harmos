package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean;

import java.io.Serializable;

public class PracticeDocument implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4167626791947593289L;

	/**
	 * 資料番号
	 */
	private int documentNo;

	/**
	 * 資料概要
	 */
	private String documentOverview;

	/**
	 * 資料名
	 */
	private String documentName;

	/**
	 * 資料番号を取得する
	 * 
	 * @return 資料番号
	 */
	public int getDocumentNo() {
		return documentNo;
	}

	/**
	 * 資料番号を設定する
	 * 
	 * @param documentNo
	 *            資料番号
	 */
	public void setDocumentNo(int documentNo) {
		this.documentNo = documentNo;
	}

	/**
	 * 資料概要を取得する
	 * @return 資料概要
	 */
	public String getDocumentOverview() {
	    return documentOverview;
	}

	/**
	 * 資料概要を設定する
	 * @param documentOverview 資料概要
	 */
	public void setDocumentOverview(String documentOverview) {
	    this.documentOverview = documentOverview;
	}

	/**
	 * 資料名を取得する
	 * 
	 * @return 資料名
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * 資料名を設定する
	 * 
	 * @param documentName
	 *            資料名
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
}
