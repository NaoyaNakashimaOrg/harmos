package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

public class SC_01_01_01_documentForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6829897413872927146L;

	/**
	 * 参考資料概要
	 */
	@Size(min = 0, max = 100)
	private String overview;

	/**
	 * 参考資料
	 */
	private MultipartFile document;

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
	 * 参考資料を取得する
	 * @return 参考資料
	 */
	public MultipartFile getDocument() {
	    return document;
	}

	/**
	 * 参考資料を設定する
	 * @param document 参考資料
	 */
	public void setDocument(MultipartFile document) {
	    this.document = document;
	}

}
