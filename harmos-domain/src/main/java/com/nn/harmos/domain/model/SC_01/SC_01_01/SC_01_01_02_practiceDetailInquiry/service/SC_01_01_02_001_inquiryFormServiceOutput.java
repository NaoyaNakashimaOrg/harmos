package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.service;

import java.io.Serializable;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_practiceDetailInquiryForm;
import com.nn.harmos.domain.model.common.fw.io.ServiceOutput;

public class SC_01_01_02_001_inquiryFormServiceOutput extends ServiceOutput implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2382662430315573496L;
	
	/**
	 * フォーム
	 */
	private SC_01_01_02_practiceDetailInquiryForm form;

	/**
	 * フォームを取得する
	 * @return フォーム
	 */
	public SC_01_01_02_practiceDetailInquiryForm getForm() {
	    return form;
	}

	/**
	 * フォームを設定する
	 * @param form フォーム
	 */
	public void setForm(SC_01_01_02_practiceDetailInquiryForm form) {
	    this.form = form;
	}

}
