package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service;

import java.io.Serializable;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.model.common.fw.io.ServiceInput;

public class SC_01_02_01_002_searchServiceInput extends ServiceInput implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5414609226515283683L;

	/**
	 * ユーザ情報
	 */
	private UserAccount account;

	/**
	 * フォーム
	 */
	private SC_01_02_01_practiceSearchForm form;

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
	public SC_01_02_01_practiceSearchForm getForm() {
	    return form;
	}

	/**
	 * フォームを設定する
	 * @param form フォーム
	 */
	public void setForm(SC_01_02_01_practiceSearchForm form) {
	    this.form = form;
	}
}
