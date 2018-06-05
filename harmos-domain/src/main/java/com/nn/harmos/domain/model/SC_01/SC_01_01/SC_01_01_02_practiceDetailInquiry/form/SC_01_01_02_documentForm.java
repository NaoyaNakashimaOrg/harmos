package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form;

import java.io.Serializable;

public class SC_01_01_02_documentForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8283331772199244360L;

	/**
	 * 参考資料番号
	 */
	private Integer documentNo;

	/**
	 * 参考資料概要
	 */
	private String overview;

	/**
	 * 参考資料名
	 */
	private String documentName;

	/**
	 * 参考資料番号を取得する
	 * 
	 * @return 参考資料番号
	 */
	public Integer getDocumentNo() {
		return documentNo;
	}

	/**
	 * 参考資料番号を設定する
	 * 
	 * @param documentNo
	 *            参考資料番号
	 */
	public void setDocumentNo(Integer documentNo) {
		this.documentNo = documentNo;
	}

	/**
	 * 参考資料概要を取得する
	 * 
	 * @return 参考資料概要
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * 参考資料概要を設定する
	 * 
	 * @param overview
	 *            参考資料概要
	 */
	public void setOverview(String overview) {
		this.overview = overview;
	}

	/**
	 * 参考資料名を取得する
	 * 
	 * @return 参考資料名
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * 参考資料名を設定する
	 * 
	 * @param documentName
	 *            参考資料名
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

}
