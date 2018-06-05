package com.nn.harmos.domain.repository.SC_01.SC_01_01;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeBibliography;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeDocument;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeMng;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeModule;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeWebsite;

/**
 * 
 * サンプル詳細のリポジトリ
 * 
 * @author nakashima
 */
public interface SC_01_01_02_practiceDetailInquiryRepository {

	/**
	 * TH0101_サンプル管理を取得する
	 * 
	 * @param practiceMngNo
	 * @return
	 */
	PracticeMng getPracticeMng(@Param("practiceMngNo") String practiceMngNo);

	/**
	 * TH0102_サンプルモジュールを取得する
	 * 
	 * @param practiceMngNo
	 * @return
	 */
	List<PracticeModule> getPracticeModule(@Param("practiceMngNo") String practiceMngNo);

	/**
	 * TH0103_参考文献を取得する
	 * 
	 * @param practiceMngNo
	 * @return
	 */
	List<PracticeBibliography> getPracticeBibliography(@Param("practiceMngNo") String practiceMngNo);

	/**
	 * TH0104_参考サイトを取得する
	 * 
	 * @param practiceMngNo
	 * @return
	 */
	List<PracticeWebsite> getPracticeWebsite(@Param("practiceMngNo") String practiceMngNo);

	/**
	 * TH0105_参考資料を取得する
	 * 
	 * @param practiceMngNo
	 * @return
	 */
	List<PracticeDocument> getPracticeDocument(@Param("practiceMngNo") String practiceMngNo);

}
