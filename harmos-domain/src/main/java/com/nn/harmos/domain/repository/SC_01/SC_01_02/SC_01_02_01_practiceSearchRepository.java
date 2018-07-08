package com.nn.harmos.domain.repository.SC_01.SC_01_02;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

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
	 * 件数カウント
	 * 
	 * @param searchCondition
	 * @return
	 */
	int count(@Param("searchCondition") SC_01_02_01_searchCondition searchCondition);

	/**
	 * 検索
	 * 
	 * @param searchCondition
	 * @param rowBounds
	 * @return
	 */
	List<SC_01_02_01_searchResult> search(@Param("searchCondition") SC_01_02_01_searchCondition searchCondition,
			RowBounds rowBounds);

}
