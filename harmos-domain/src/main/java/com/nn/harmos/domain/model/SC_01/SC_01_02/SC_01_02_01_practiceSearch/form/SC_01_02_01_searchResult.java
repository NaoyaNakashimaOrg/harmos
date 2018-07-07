package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form;

import java.io.Serializable;

/**
 * @author nakashima
 *
 */
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
	private String practiceMngNo;

	/**
	 * 概要
	 */
	private String overview;

	/**
	 * モジュール
	 */
	private String registModule;

	/**
	 * 参考文献
	 */
	private String registBibliography;

	/**
	 * 参考サイト
	 */
	private String registWebSite;

	/**
	 * 参考資料
	 */
	private String registDocument;

	/**
	 * メモ
	 */
	private String memo;

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
	public String getPracticeMngNo() {
		return practiceMngNo;
	}

	/**
	 * サンプルNoを設定する
	 * @param practiceMngNo サンプルNo
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
	 * モジュールを取得する
	 * @return モジュール
	 */
	public String getRegistModule() {
		return registModule;
	}

	/**
	 * モジュールを設定する
	 * @param registModule モジュール
	 */
	public void setRegistModule(String registModule) {
		this.registModule = registModule;
	}

	/**
	 * 参考文献を取得する
	 * @return 参考文献
	 */
	public String getRegistBibliography() {
		return registBibliography;
	}

	/**
	 * 参考文献を設定する
	 * @param registBibliography 参考文献
	 */
	public void setRegistBibliography(String registBibliography) {
		this.registBibliography = registBibliography;
	}

	/**
	 * 参考サイトを取得する
	 * @return 参考サイト
	 */
	public String getRegistWebSite() {
		return registWebSite;
	}

	/**
	 * 参考サイトを設定する
	 * @param registWebSite 参考サイト
	 */
	public void setRegistWebSite(String registWebSite) {
		this.registWebSite = registWebSite;
	}

	/**
	 * 参考資料を取得する
	 * @return 参考資料
	 */
	public String getRegistDocument() {
		return registDocument;
	}

	/**
	 * 参考資料を設定する
	 * @param registDocument 参考資料
	 */
	public void setRegistDocument(String registDocument) {
		this.registDocument = registDocument;
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
}
