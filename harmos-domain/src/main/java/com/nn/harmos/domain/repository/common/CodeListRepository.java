package com.nn.harmos.domain.repository.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nn.harmos.domain.model.common.fw.dto.KbnCode;

/**
 * 
 * 区分コード関連のリポジトリ
 * 
 * @author nakashima
 */
public interface CodeListRepository {

	/**
	 * 区分コードを取得する
	 * 
	 * @param bunruiCd
	 * @return
	 */
	List<KbnCode> getKbnCodeList(@Param("bunruiCd") String bunruiCd);
}
