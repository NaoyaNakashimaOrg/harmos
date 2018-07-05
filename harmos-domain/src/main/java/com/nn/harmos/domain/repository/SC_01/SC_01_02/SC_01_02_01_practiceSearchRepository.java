package com.nn.harmos.domain.repository.SC_01.SC_01_02;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_searchCondition;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_searchResult;

/**
 * 
 * サンプル検索のリポジトリ
 * 
 * @author nakashima
 */
public interface SC_01_02_01_practiceSearchRepository {

	/**
	 * 検索
	 * 
	 * @param form
	 * @param account
	 * @return
	 */
	List<SC_01_02_01_searchResult> search(@Param("searchCondition") SC_01_02_01_searchCondition searchCondition);

}
