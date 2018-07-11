package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.nn.harmos.domain.model.common.fw.dto.KbnCode;

public class SC_01_01_01_practiceDetailInputForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7327200504091879424L;

	/**
	 * サンプルNO
	 */
	private String practiceMngNo;

	/**
	 * 概要
	 */
	@NotBlank
	@Size(min = 0, max = 100)
	private String overview;

	/**
	 * カテゴリリスト
	 */
	private List<KbnCode> categoryList;

	/**
	 * カテゴリ
	 */
	private String category;

	/**
	 * 詳細
	 */
	@Size(min = 0, max = 1000)
	private String detail;

	/**
	 * モジュールリスト
	 */
	private List<SC_01_01_01_moduleForm> moduleList;

	/**
	 * 参考文献リスト
	 */
	private List<SC_01_01_01_bibliographyForm> bibliographyList;

	/**
	 * 参考サイトリスト
	 */
	@Valid
	private List<SC_01_01_01_webSiteForm> webSiteList;

	/**
	 * 参考資料 リスト
	 */
	@Valid
	private List<SC_01_01_01_documentForm> documentList;

	/**
	 * メモ
	 */
	@Size(min = 0, max = 1000)
	private String memo;

	/**
	 * サンプルNOを取得する
	 * 
	 * @return サンプルNO
	 */
	public String getPracticeMngNo() {
		return practiceMngNo;
	}

	/**
	 * サンプルNOを設定する
	 * 
	 * @param practiceMngNo
	 *            サンプルNO
	 */
	public void setPracticeMngNo(String practiceMngNo) {
		this.practiceMngNo = practiceMngNo;
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
	 * カテゴリリストを取得する
	 * 
	 * @return カテゴリリスト
	 */
	public List<KbnCode> getCategoryList() {
		return categoryList;
	}

	/**
	 * カテゴリリストを設定する
	 * 
	 * @param categoryList
	 *            カテゴリリスト
	 */
	public void setCategoryList(List<KbnCode> categoryList) {
		this.categoryList = categoryList;
	}

	/**
	 * カテゴリを取得する
	 * 
	 * @return カテゴリ
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * カテゴリを設定する
	 * 
	 * @param category
	 *            カテゴリ
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 詳細を取得する
	 * 
	 * @return 詳細
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * 詳細を設定する
	 * 
	 * @param detail
	 *            詳細
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * モジュールリストを取得する
	 * 
	 * @return モジュールリスト
	 */
	public List<SC_01_01_01_moduleForm> getModuleList() {
		return moduleList;
	}

	/**
	 * モジュールリストを設定する
	 * 
	 * @param moduleList
	 *            モジュールリスト
	 */
	public void setModuleList(List<SC_01_01_01_moduleForm> moduleList) {
		this.moduleList = moduleList;
	}

	/**
	 * 参考文献リストを取得する
	 * 
	 * @return 参考文献リスト
	 */
	public List<SC_01_01_01_bibliographyForm> getBibliographyList() {
		return bibliographyList;
	}

	/**
	 * 参考文献リストを設定する
	 * 
	 * @param bibliographyList
	 *            参考文献リスト
	 */
	public void setBibliographyList(List<SC_01_01_01_bibliographyForm> bibliographyList) {
		this.bibliographyList = bibliographyList;
	}

	/**
	 * 参考サイトリストを取得する
	 * 
	 * @return 参考サイトリスト
	 */
	public List<SC_01_01_01_webSiteForm> getWebSiteList() {
		return webSiteList;
	}

	/**
	 * 参考サイトリストを設定する
	 * 
	 * @param webSiteList
	 *            参考サイトリスト
	 */
	public void setWebSiteList(List<SC_01_01_01_webSiteForm> webSiteList) {
		this.webSiteList = webSiteList;
	}

	/**
	 * 参考資料 リストを取得する
	 * 
	 * @return 参考資料 リスト
	 */
	public List<SC_01_01_01_documentForm> getDocumentList() {
		return documentList;
	}

	/**
	 * 参考資料 リストを設定する
	 * 
	 * @param documentList
	 *            参考資料 リスト
	 */
	public void setDocumentList(List<SC_01_01_01_documentForm> documentList) {
		this.documentList = documentList;
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
}
