package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean;

import java.io.Serializable;

public class PracticeMng implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5814183763108134050L;

	/**
	 * サンプル管理番号
	 */
	private String practiceMngNo;

	/**
	 * 概要
	 */
	private String overview;

	/**
	 * カテゴリ
	 */
	private String category;

	/**
	 * 詳細
	 */
	private String detail;

	/**
	 * メモ
	 */
	private String memo;

	/**
	 * バージョン
	 */
	private int version;

	/**
	 * サンプル管理番号を取得する
	 * @return サンプル管理番号
	 */
	public String getPracticeMngNo() {
	    return practiceMngNo;
	}

	/**
	 * サンプル管理番号を設定する
	 * @param practiceMngNo サンプル管理番号
	 */
	public void setPracticeMngNo(String practiceMngNo) {
	    this.practiceMngNo = practiceMngNo;
	}

	/**
	 * 概要を取得する
	 * @return 概要
	 */
	public String getOverview() {
	    return overview;
	}

	/**
	 * 概要を設定する
	 * @param overview 概要
	 */
	public void setOverview(String overview) {
	    this.overview = overview;
	}

	/**
	 * カテゴリを取得する
	 * @return カテゴリ
	 */
	public String getCategory() {
	    return category;
	}

	/**
	 * カテゴリを設定する
	 * @param category カテゴリ
	 */
	public void setCategory(String category) {
	    this.category = category;
	}

	/**
	 * 詳細を取得する
	 * @return 詳細
	 */
	public String getDetail() {
	    return detail;
	}

	/**
	 * 詳細を設定する
	 * @param detail 詳細
	 */
	public void setDetail(String detail) {
	    this.detail = detail;
	}

	/**
	 * メモを取得する
	 * @return メモ
	 */
	public String getMemo() {
	    return memo;
	}

	/**
	 * メモを設定する
	 * @param memo メモ
	 */
	public void setMemo(String memo) {
	    this.memo = memo;
	}

	/**
	 * バージョンを取得する
	 * @return バージョン
	 */
	public int getVersion() {
	    return version;
	}

	/**
	 * バージョンを設定する
	 * @param version バージョン
	 */
	public void setVersion(int version) {
	    this.version = version;
	}

}
