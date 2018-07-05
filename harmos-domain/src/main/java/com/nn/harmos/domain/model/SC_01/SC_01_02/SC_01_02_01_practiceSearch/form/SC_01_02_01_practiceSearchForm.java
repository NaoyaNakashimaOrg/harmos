package com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form;

import java.io.Serializable;
import java.util.List;

public class SC_01_02_01_practiceSearchForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4604995769336915266L;

	/**
	 * 検索条件
	 */
	private SC_01_02_01_searchCondition searchCondition;

	/**
	 * 検索結果リスト
	 */
	private List<SC_01_02_01_searchResult> searchResultList;

	/**
	 * 検索条件を取得する
	 * @return 検索条件
	 */
	public SC_01_02_01_searchCondition getSearchCondition() {
		return searchCondition;
	}

	/**
	 * 検索条件を設定する
	 * @param searchCondition 検索条件
	 */
	public void setSearchCondition(SC_01_02_01_searchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}

	/**
	 * 検索結果リストを取得する
	 * @return 検索結果リスト
	 */
	public List<SC_01_02_01_searchResult> getSearchResultList() {
	    return searchResultList;
	}

	/**
	 * 検索結果リストを設定する
	 * @param searchResultList 検索結果リスト
	 */
	public void setSearchResultList(List<SC_01_02_01_searchResult> searchResultList) {
	    this.searchResultList = searchResultList;
	}

}
