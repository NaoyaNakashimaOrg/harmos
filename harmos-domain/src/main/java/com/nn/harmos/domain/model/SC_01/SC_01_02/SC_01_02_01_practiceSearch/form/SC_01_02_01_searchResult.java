package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form;

import java.io.Serializable;

public class SC_01_02_01_searchResult implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1028480180603681968L;

	/**
	 * No
	 */
	private String no;

	/**
	 * サンプルNo
	 */
	private String practiceNo;

	/**
	 * 概要
	 */
	private String overview;

	/**
	 * モジュール
	 */
	private boolean module;

	/**
	 * 参考文献
	 */
	private boolean bibliography;

	/**
	 * 参考サイト
	 */
	private boolean webSite;

	/**
	 * 参考資料
	 */
	private boolean document;

	/**
	 * Noを取得する
	 * @return No
	 */
	public String getNo() {
	    return no;
	}

	/**
	 * Noを設定する
	 * @param no No
	 */
	public void setNo(String no) {
	    this.no = no;
	}

	/**
	 * サンプルNoを取得する
	 * @return サンプルNo
	 */
	public String getPracticeNo() {
		return practiceNo;
	}

	/**
	 * サンプルNoを設定する
	 * @param practiceNo サンプルNo
	 */
	public void setPracticeNo(String practiceNo) {
		this.practiceNo = practiceNo;
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
	 * モジュールを取得する
	 * @return モジュール
	 */
	public boolean isModule() {
		return module;
	}

	/**
	 * モジュールを設定する
	 * @param module モジュール
	 */
	public void setModule(boolean module) {
		this.module = module;
	}

	/**
	 * 参考文献を取得する
	 * @return 参考文献
	 */
	public boolean isBibliography() {
		return bibliography;
	}

	/**
	 * 参考文献を設定する
	 * @param bibliography 参考文献
	 */
	public void setBibliography(boolean bibliography) {
		this.bibliography = bibliography;
	}

	/**
	 * 参考サイトを取得する
	 * @return 参考サイト
	 */
	public boolean isWebSite() {
		return webSite;
	}

	/**
	 * 参考サイトを設定する
	 * @param webSite 参考サイト
	 */
	public void setWebSite(boolean webSite) {
		this.webSite = webSite;
	}

	/**
	 * 参考資料を取得する
	 * @return 参考資料
	 */
	public boolean isDocument() {
		return document;
	}

	/**
	 * 参考資料を設定する
	 * @param document 参考資料
	 */
	public void setDocument(boolean document) {
		this.document = document;
	}

}
