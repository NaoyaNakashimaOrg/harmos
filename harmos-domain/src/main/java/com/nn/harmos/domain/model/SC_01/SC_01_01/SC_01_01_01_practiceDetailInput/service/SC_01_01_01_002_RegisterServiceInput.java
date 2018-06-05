package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service;

import java.io.Serializable;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_practiceDetailInputForm;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.model.common.fw.io.ServiceInput;

public class SC_01_01_01_002_RegisterServiceInput extends ServiceInput implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 98394149238538262L;

	/**
	 * ユーザ情報
	 */
	private UserAccount account;

	/**
	 * フォーム
	 */
	private SC_01_01_01_practiceDetailInputForm form;

	/**
	 * ユーザ情報を取得する
	 * @return ユーザ情報
	 */
	public UserAccount getAccount() {
	    return account;
	}

	/**
	 * ユーザ情報を設定する
	 * @param account ユーザ情報
	 */
	public void setAccount(UserAccount account) {
	    this.account = account;
	}

	/**
	 * フォームを取得する
	 * @return フォーム
	 */
	public SC_01_01_01_practiceDetailInputForm getForm() {
	    return form;
	}

	/**
	 * フォームを設定する
	 * @param form フォーム
	 */
	public void setForm(SC_01_01_01_practiceDetailInputForm form) {
	    this.form = form;
	}

}
