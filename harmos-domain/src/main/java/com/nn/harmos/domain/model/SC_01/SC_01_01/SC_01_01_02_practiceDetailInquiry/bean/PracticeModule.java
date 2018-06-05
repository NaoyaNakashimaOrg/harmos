package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean;

import java.io.Serializable;

public class PracticeModule implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6648038230237663066L;

	/**
	 * モジュール番号
	 */
	private int moduleNo;

	/**
	 * モジュール概要
	 */
	private String moduleOverview;

	/**
	 * モジュール名
	 */
	private String moduleName;

	/**
	 * モジュール番号を取得する
	 * 
	 * @return モジュール番号
	 */
	public int getModuleNo() {
		return moduleNo;
	}

	/**
	 * モジュール番号を設定する
	 * 
	 * @param moduleNo
	 *            モジュール番号
	 */
	public void setModuleNo(int moduleNo) {
		this.moduleNo = moduleNo;
	}

	/**
	 * モジュール概要を取得する
	 * @return モジュール概要
	 */
	public String getModuleOverview() {
	    return moduleOverview;
	}

	/**
	 * モジュール概要を設定する
	 * @param moduleOverview モジュール概要
	 */
	public void setModuleOverview(String moduleOverview) {
	    this.moduleOverview = moduleOverview;
	}

	/**
	 * モジュール名を取得する
	 * 
	 * @return モジュール名
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * モジュール名を設定する
	 * 
	 * @param moduleName
	 *            モジュール名
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
}
