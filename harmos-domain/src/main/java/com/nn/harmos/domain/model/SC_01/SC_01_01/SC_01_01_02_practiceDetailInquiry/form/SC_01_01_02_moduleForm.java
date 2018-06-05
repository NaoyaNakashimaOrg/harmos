package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form;

import java.io.Serializable;

public class SC_01_01_02_moduleForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2012938262137757072L;

	/**
	 * モジュール番号
	 */
	private Integer moduleNo;

	/**
	 * モジュール概要
	 */
	private String overview;

	/**
	 * モジュールファイル名
	 */
	private String moduleName;

	/**
	 * モジュール番号を取得する
	 * @return モジュール番号
	 */
	public Integer getModuleNo() {
	    return moduleNo;
	}

	/**
	 * モジュール番号を設定する
	 * @param moduleNo モジュール番号
	 */
	public void setModuleNo(Integer moduleNo) {
	    this.moduleNo = moduleNo;
	}

	/**
	 * モジュール概要を取得する
	 * @return モジュール概要
	 */
	public String getOverview() {
	    return overview;
	}

	/**
	 * モジュール概要を設定する
	 * @param overview モジュール概要
	 */
	public void setOverview(String overview) {
	    this.overview = overview;
	}

	/**
	 * モジュールファイル名を取得する
	 * @return モジュールファイル名
	 */
	public String getModuleName() {
	    return moduleName;
	}

	/**
	 * モジュールファイル名を設定する
	 * @param moduleName モジュールファイル名
	 */
	public void setModuleName(String moduleName) {
	    this.moduleName = moduleName;
	}

}
