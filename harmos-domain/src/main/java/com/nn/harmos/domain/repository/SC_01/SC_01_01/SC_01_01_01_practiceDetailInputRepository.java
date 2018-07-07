package com.nn.harmos.domain.repository.SC_01.SC_01_01;

import java.io.InputStream;

import org.apache.ibatis.annotations.Param;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_bibliographyForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_practiceDetailInputForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_webSiteForm;
import com.nn.harmos.domain.model.common.UserAccount;

/**
 * 
 * サンプル詳細のリポジトリ
 * 
 * @author nakashima
 */
public interface SC_01_01_01_practiceDetailInputRepository {

	/**
	 * サンプル管理番号を採番する
	 * 
	 * @return サンプル管理番号
	 */
	String numberingPracticeMngNo();

	/**
	 * TH0101_サンプル管理を登録する
	 * 
	 * @param form
	 * @param registModule
	 * @param registBibliography
	 * @param registWebsite
	 * @param registDocument
	 * @param account
	 */
	void insertPracticeMng(@Param("form") SC_01_01_01_practiceDetailInputForm form,
			@Param("registModule") boolean registModule, @Param("registBibliography") boolean registBibliography,
			@Param("registWebsite") boolean registWebsite, @Param("registDocument") boolean registDocument,
			@Param("account") UserAccount account);

	/**
	 * 
	 * TH0102_サンプルモジュールを登録する
	 * 
	 * @param practiceMngNo
	 * @param index
	 * @param overview
	 * @param moduleName
	 * @param module
	 * @param account
	 */
	void insertPracticeModule(@Param("practiceMngNo") String practiceMngNo, @Param("index") int index,
			@Param("overview") String overview, @Param("moduleName") String moduleName,
			@Param("module") InputStream module, @Param("account") UserAccount account);

	/**
	 * TH0103_参考文献を登録する
	 * 
	 * @param practiceMngNo
	 * @param index
	 * @param form
	 * @param account
	 * @return
	 */
	void insertPracticeBibliography(@Param("practiceMngNo") String practiceMngNo, @Param("index") int index,
			@Param("form") SC_01_01_01_bibliographyForm form, @Param("account") UserAccount account);

	/**
	 * TH0104_参考サイトを登録する
	 * 
	 * @param practiceMngNo
	 * @param index
	 * @param form
	 * @param account
	 * @return
	 */
	void insertPracticeWebsite(@Param("practiceMngNo") String practiceMngNo, @Param("index") int index,
			@Param("form") SC_01_01_01_webSiteForm form, @Param("account") UserAccount account);

	/**
	 * 
	 * TH0105_参考資料を登録する
	 * 
	 * @param practiceMngNo
	 * @param index
	 * @param overview
	 * @param documentName
	 * @param document
	 * @param account
	 */
	void insertPracticeDocment(@Param("practiceMngNo") String practiceMngNo, @Param("index") int index,
			@Param("overview") String overview, @Param("documentName") String documentName,
			@Param("document") InputStream document, @Param("account") UserAccount account);
}
