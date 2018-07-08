package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service;

import java.io.Serializable;

import org.springframework.data.domain.Page;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_searchResult;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.model.common.fw.io.ServiceOutput;

public class SC_01_02_01_002_searchServiceOutput extends ServiceOutput implements Serializable {

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
	 * ページ
	 */
	private Page<SC_01_02_01_searchResult> page;

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

	/**
	 * ページを取得する
	 * @return ページ
	 */
	public Page<SC_01_02_01_searchResult> getPage() {
	    return page;
	}

	/**
	 * ページを設定する
	 * @param page ページ
	 */
	public void setPage(Page<SC_01_02_01_searchResult> page) {
	    this.page = page;
	}
}
