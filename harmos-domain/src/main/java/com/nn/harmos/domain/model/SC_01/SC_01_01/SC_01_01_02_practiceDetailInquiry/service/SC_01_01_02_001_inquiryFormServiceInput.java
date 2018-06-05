package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.service;

import java.io.Serializable;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_practiceDetailInquiryForm;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.model.common.fw.io.ServiceInput;

public class SC_01_01_02_001_inquiryFormServiceInput extends ServiceInput implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6653067156828086931L;

	/**
	 * ユーザ情報
	 */
	private UserAccount account;

	/**
	 * サンプル管理番号
	 */
	private String practiceMngNo;

	/**
	 * フォーム
	 */
	private SC_01_01_02_practiceDetailInquiryForm form;

	/**
	 * ユーザ情報を取得する
	 * 
	 * @return ユーザ情報
	 */
	public UserAccount getAccount() {
		return account;
	}

	/**
	 * ユーザ情報を設定する
	 * 
	 * @param account
	 *            ユーザ情報
	 */
	public void setAccount(UserAccount account) {
		this.account = account;
	}

	/**
	 * サンプル管理番号を取得する
	 * 
	 * @return サンプル管理番号
	 */
	public String getPracticeMngNo() {
		return practiceMngNo;
	}

	/**
	 * サンプル管理番号を設定する
	 * 
	 * @param practiceMngNo
	 *            サンプル管理番号
	 */
	public void setPracticeMngNo(String practiceMngNo) {
		this.practiceMngNo = practiceMngNo;
	}

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
