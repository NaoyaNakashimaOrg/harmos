package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form;

import java.io.Serializable;

public class SC_01_02_01_searchCondition implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1249316249979503201L;

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
	 * 詳細
	 */
	private String detail;

	/**
	 * モジュール登録あり
	 */
	private boolean existsModule;

	/**
	 * モジュール登録なし
	 */
	private boolean notExistsModule;

	/**
	 * 参考文献登録あり
	 */
	private boolean existsBibliography;

	/**
	 * 参考文献登録なし
	 */
	private boolean notExistsBibliography;

	/**
	 * 参考サイト登録あり
	 */
	private boolean existsWebSite;

	/**
	 * 参考サイト登録なし
	 */
	private boolean notExistsWebSite;

	/**
	 * 参考資料登録あり
	 */
	private boolean existsDocument;

	/**
	 * 参考資料登録なし
	 */
	private boolean notExistsDocument;

	/**
	 * メモ
	 */
	private String memo;

	/**
	 * サンプルNo Fromを取得する
	 * @return サンプルNo From
	 */
	public String getPracticeNoFrom() {
	    return practiceNoFrom;
	}

	/**
	 * サンプルNo Fromを設定する
	 * @param practiceNoFrom サンプルNo From
	 */
	public void setPracticeNoFrom(String practiceNoFrom) {
	    this.practiceNoFrom = practiceNoFrom;
	}

	/**
	 * サンプルNo Toを取得する
	 * @return サンプルNo To
	 */
	public String getPracticeNoTo() {
	    return practiceNoTo;
	}

	/**
	 * サンプルNo Toを設定する
	 * @param practiceNoTo サンプルNo To
	 */
	public void setPracticeNoTo(String practiceNoTo) {
	    this.practiceNoTo = practiceNoTo;
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
	 * モジュール登録ありを取得する
	 * @return モジュール登録あり
	 */
	public boolean isExistsModule() {
	    return existsModule;
	}

	/**
	 * モジュール登録ありを設定する
	 * @param existsModule モジュール登録あり
	 */
	public void setExistsModule(boolean existsModule) {
	    this.existsModule = existsModule;
	}

	/**
	 * モジュール登録なしを取得する
	 * @return モジュール登録なし
	 */
	public boolean isNotExistsModule() {
	    return notExistsModule;
	}

	/**
	 * モジュール登録なしを設定する
	 * @param notExistsModule モジュール登録なし
	 */
	public void setNotExistsModule(boolean notExistsModule) {
	    this.notExistsModule = notExistsModule;
	}

	/**
	 * 参考文献登録ありを取得する
	 * @return 参考文献登録あり
	 */
	public boolean isExistsBibliography() {
	    return existsBibliography;
	}

	/**
	 * 参考文献登録ありを設定する
	 * @param existsBibliography 参考文献登録あり
	 */
	public void setExistsBibliography(boolean existsBibliography) {
	    this.existsBibliography = existsBibliography;
	}

	/**
	 * 参考文献登録なしを取得する
	 * @return 参考文献登録なし
	 */
	public boolean isNotExistsBibliography() {
	    return notExistsBibliography;
	}

	/**
	 * 参考文献登録なしを設定する
	 * @param notExistsBibliography 参考文献登録なし
	 */
	public void setNotExistsBibliography(boolean notExistsBibliography) {
	    this.notExistsBibliography = notExistsBibliography;
	}

	/**
	 * 参考サイト登録ありを取得する
	 * @return 参考サイト登録あり
	 */
	public boolean isExistsWebSite() {
	    return existsWebSite;
	}

	/**
	 * 参考サイト登録ありを設定する
	 * @param existsWebSite 参考サイト登録あり
	 */
	public void setExistsWebSite(boolean existsWebSite) {
	    this.existsWebSite = existsWebSite;
	}

	/**
	 * 参考サイト登録なしを取得する
	 * @return 参考サイト登録なし
	 */
	public boolean isNotExistsWebSite() {
	    return notExistsWebSite;
	}

	/**
	 * 参考サイト登録なしを設定する
	 * @param notExistsWebSite 参考サイト登録なし
	 */
	public void setNotExistsWebSite(boolean notExistsWebSite) {
	    this.notExistsWebSite = notExistsWebSite;
	}

	/**
	 * 参考資料登録ありを取得する
	 * @return 参考資料登録あり
	 */
	public boolean isExistsDocument() {
	    return existsDocument;
	}

	/**
	 * 参考資料登録ありを設定する
	 * @param existsDocument 参考資料登録あり
	 */
	public void setExistsDocument(boolean existsDocument) {
	    this.existsDocument = existsDocument;
	}

	/**
	 * 参考資料登録なしを取得する
	 * @return 参考資料登録なし
	 */
	public boolean isNotExistsDocument() {
	    return notExistsDocument;
	}

	/**
	 * 参考資料登録なしを設定する
	 * @param notExistsDocument 参考資料登録なし
	 */
	public void setNotExistsDocument(boolean notExistsDocument) {
	    this.notExistsDocument = notExistsDocument;
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
