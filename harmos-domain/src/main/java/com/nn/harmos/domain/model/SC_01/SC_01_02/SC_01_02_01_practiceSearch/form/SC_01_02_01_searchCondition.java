package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form;

import java.io.Serializable;

import com.nn.harmos.domain.model.common.fw.dto.SearchCondition;

public class SC_01_02_01_searchCondition extends SearchCondition implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3180045370399729832L;

	/**
	 * サンプルNo From
	 */
	private String practiceNoFrom;

	/**
	 * サンプルNo To
	 */
	private String practiceNoTo;

	/**
	 * 概要
	 */
	private String overview;

	/**
	 * 一致区分（概要）
	 */
	private String icchiKbnGaiyo;

	/**
	 * モジュール登録あり
	 */
	private boolean registModule;

	/**
	 * モジュール登録なし
	 */
	private boolean notRegistModule;

	/**
	 * 参考文献登録あり
	 */
	private boolean registBibliography;

	/**
	 * 参考文献登録なし
	 */
	private boolean notRegistBibliography;

	/**
	 * 参考サイト登録あり
	 */
	private boolean registWebSite;

	/**
	 * 参考サイト登録なし
	 */
	private boolean notRegistWebSite;

	/**
	 * 参考資料登録あり
	 */
	private boolean registDocument;

	/**
	 * 参考資料登録なし
	 */
	private boolean notRegistDocument;

	/**
	 * メモ
	 */
	private String memo;

	/**
	 * 一致区分（メモ）
	 */
	private String icchiKbnMemo;

	/**
	 * サンプルNo Fromを取得する
	 * 
	 * @return サンプルNo From
	 */
	public String getPracticeNoFrom() {
		return practiceNoFrom;
	}

	/**
	 * サンプルNo Fromを設定する
	 * 
	 * @param practiceNoFrom
	 *            サンプルNo From
	 */
	public void setPracticeNoFrom(String practiceNoFrom) {
		this.practiceNoFrom = practiceNoFrom;
	}

	/**
	 * サンプルNo Toを取得する
	 * 
	 * @return サンプルNo To
	 */
	public String getPracticeNoTo() {
		return practiceNoTo;
	}

	/**
	 * サンプルNo Toを設定する
	 * 
	 * @param practiceNoTo
	 *            サンプルNo To
	 */
	public void setPracticeNoTo(String practiceNoTo) {
		this.practiceNoTo = practiceNoTo;
	}

	/**
	 * 概要を取得する
	 * 
	 * @return 概要
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * 概要を設定する
	 * 
	 * @param overview
	 *            概要
	 */
	public void setOverview(String overview) {
		this.overview = overview;
	}

	/**
	 * 一致区分（概要）を取得する
	 * 
	 * @return 一致区分（概要）
	 */
	public String getIcchiKbnGaiyo() {
		return icchiKbnGaiyo;
	}

	/**
	 * 一致区分（概要）を設定する
	 * 
	 * @param icchiKbnGaiyo
	 *            一致区分（概要）
	 */
	public void setIcchiKbnGaiyo(String icchiKbnGaiyo) {
		this.icchiKbnGaiyo = icchiKbnGaiyo;
	}

	/**
	 * モジュール登録ありを取得する
	 * 
	 * @return モジュール登録あり
	 */
	public boolean isRegistModule() {
		return registModule;
	}

	/**
	 * モジュール登録ありを設定する
	 * 
	 * @param registModule
	 *            モジュール登録あり
	 */
	public void setRegistModule(boolean registModule) {
		this.registModule = registModule;
	}

	/**
	 * モジュール登録なしを取得する
	 * 
	 * @return モジュール登録なし
	 */
	public boolean isNotRegistModule() {
		return notRegistModule;
	}

	/**
	 * モジュール登録なしを設定する
	 * 
	 * @param notRegistModule
	 *            モジュール登録なし
	 */
	public void setNotRegistModule(boolean notRegistModule) {
		this.notRegistModule = notRegistModule;
	}

	/**
	 * 参考文献登録ありを取得する
	 * 
	 * @return 参考文献登録あり
	 */
	public boolean isRegistBibliography() {
		return registBibliography;
	}

	/**
	 * 参考文献登録ありを設定する
	 * 
	 * @param registBibliography
	 *            参考文献登録あり
	 */
	public void setRegistBibliography(boolean registBibliography) {
		this.registBibliography = registBibliography;
	}

	/**
	 * 参考文献登録なしを取得する
	 * 
	 * @return 参考文献登録なし
	 */
	public boolean isNotRegistBibliography() {
		return notRegistBibliography;
	}

	/**
	 * 参考文献登録なしを設定する
	 * 
	 * @param notRegistBibliography
	 *            参考文献登録なし
	 */
	public void setNotRegistBibliography(boolean notRegistBibliography) {
		this.notRegistBibliography = notRegistBibliography;
	}

	/**
	 * 参考サイト登録ありを取得する
	 * 
	 * @return 参考サイト登録あり
	 */
	public boolean isRegistWebSite() {
		return registWebSite;
	}

	/**
	 * 参考サイト登録ありを設定する
	 * 
	 * @param registWebSite
	 *            参考サイト登録あり
	 */
	public void setRegistWebSite(boolean registWebSite) {
		this.registWebSite = registWebSite;
	}

	/**
	 * 参考サイト登録なしを取得する
	 * 
	 * @return 参考サイト登録なし
	 */
	public boolean isNotRegistWebSite() {
		return notRegistWebSite;
	}

	/**
	 * 参考サイト登録なしを設定する
	 * 
	 * @param notRegistWebSite
	 *            参考サイト登録なし
	 */
	public void setNotRegistWebSite(boolean notRegistWebSite) {
		this.notRegistWebSite = notRegistWebSite;
	}

	/**
	 * 参考資料登録ありを取得する
	 * 
	 * @return 参考資料登録あり
	 */
	public boolean isRegistDocument() {
		return registDocument;
	}

	/**
	 * 参考資料登録ありを設定する
	 * 
	 * @param registDocument
	 *            参考資料登録あり
	 */
	public void setRegistDocument(boolean registDocument) {
		this.registDocument = registDocument;
	}

	/**
	 * 参考資料登録なしを取得する
	 * 
	 * @return 参考資料登録なし
	 */
	public boolean isNotRegistDocument() {
		return notRegistDocument;
	}

	/**
	 * 参考資料登録なしを設定する
	 * 
	 * @param notRegistDocument
	 *            参考資料登録なし
	 */
	public void setNotRegistDocument(boolean notRegistDocument) {
		this.notRegistDocument = notRegistDocument;
	}

	/**
	 * メモを取得する
	 * 
	 * @return メモ
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * メモを設定する
	 * 
	 * @param memo
	 *            メモ
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * 一致区分（メモ）を取得する
	 * 
	 * @return 一致区分（メモ）
	 */
	public String getIcchiKbnMemo() {
		return icchiKbnMemo;
	}

	/**
	 * 一致区分（メモ）を設定する
	 * 
	 * @param icchiKbnMemo
	 *            一致区分（メモ）
	 */
	public void setIcchiKbnMemo(String icchiKbnMemo) {
		this.icchiKbnMemo = icchiKbnMemo;
	}
}
