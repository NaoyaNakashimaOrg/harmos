package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service;

import java.io.Serializable;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_practiceDetailInputForm;
import com.nn.harmos.domain.model.common.fw.io.ServiceOutput;

public class SC_01_01_01_002_RegisterServiceOutput extends ServiceOutput implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5568892536215757955L;

	/**
	 * フォーム
	 */
	private SC_01_01_01_practiceDetailInputForm form;

	/**
	 * フォームを取得する
	 * 
	 * @return フォーム
	 */
	public SC_01_01_01_practiceDetailInputForm getForm() {
		return form;
	}

	/**
	 * フォームを設定する
	 * 
	 * @param form
	 *            フォーム
	 */
	public void setForm(SC_01_01_01_practiceDetailInputForm form) {
		this.form = form;
	}

}
