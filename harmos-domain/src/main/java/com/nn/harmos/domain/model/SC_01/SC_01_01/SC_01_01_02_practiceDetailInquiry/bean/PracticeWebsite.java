package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean;

import java.io.Serializable;

public class PracticeWebsite implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7711331281833498857L;

	/**
	 * サイト番号
	 */
	private int websiteNo;

	/**
	 * サイト概要
	 */
	private String websiteOverview;

	/**
	 * サイトURL
	 */
	private String websiteUrl;

	/**
	 * サイト番号を取得する
	 * 
	 * @return サイト番号
	 */
	public int getWebsiteNo() {
		return websiteNo;
	}

	/**
	 * サイト番号を設定する
	 * 
	 * @param websiteNo
	 *            サイト番号
	 */
	public void setWebsiteNo(int websiteNo) {
		this.websiteNo = websiteNo;
	}

	/**
	 * サイト概要を取得する
	 * 
	 * @return サイト概要
	 */
	public String getWebsiteOverview() {
		return websiteOverview;
	}

	/**
	 * サイト概要を設定する
	 * 
	 * @param websiteOverview
	 *            サイト概要
	 */
	public void setWebsiteOverview(String websiteOverview) {
		this.websiteOverview = websiteOverview;
	}

	/**
	 * サイトURLを取得する
	 * 
	 * @return サイトURL
	 */
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	/**
	 * サイトURLを設定する
	 * 
	 * @param websiteUrl
	 *            サイトURL
	 */
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
}
