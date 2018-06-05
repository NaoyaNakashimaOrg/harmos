package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

public class SC_01_01_01_moduleForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7415981818865005533L;

	/**
	 * モジュール概要
	 */
	@Size(min = 0, max = 100)
	private String overview;

	/**
	 * モジュールファイル
	 */
	private MultipartFile module;

	/**
	 * モジュール概要を取得する
	 * 
	 * @return モジュール概要
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * モジュール概要を設定する
	 * 
	 * @param overview
	 *            モジュール概要
	 */
	public void setOverview(String overview) {
		this.overview = overview;
	}

	/**
	 * モジュールファイルを取得する
	 * @return モジュールファイル
	 */
	public MultipartFile getModule() {
	    return module;
	}

	/**
	 * モジュールファイルを設定する
	 * @param module モジュールファイル
	 */
	public void setModule(MultipartFile module) {
	    this.module = module;
	}

}
