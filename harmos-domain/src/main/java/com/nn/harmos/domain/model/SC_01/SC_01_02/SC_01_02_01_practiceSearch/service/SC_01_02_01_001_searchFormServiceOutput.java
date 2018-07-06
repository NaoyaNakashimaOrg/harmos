package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service;

import java.io.Serializable;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.common.fw.io.ServiceOutput;

public class SC_01_02_01_001_searchFormServiceOutput extends ServiceOutput implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2007450107308369387L;

	/**
	 * フォーム
	 */
	private SC_01_02_01_practiceSearchForm form;

	/**
	 * フォームを取得する
	 * 
	 * @return フォーム
	 */
	public SC_01_02_01_practiceSearchForm getForm() {
		return form;
	}

	/**
	 * フォームを設定する
	 * 
	 * @param form
	 *            フォーム
	 */
	public void setForm(SC_01_02_01_practiceSearchForm form) {
		this.form = form;
	}
}
