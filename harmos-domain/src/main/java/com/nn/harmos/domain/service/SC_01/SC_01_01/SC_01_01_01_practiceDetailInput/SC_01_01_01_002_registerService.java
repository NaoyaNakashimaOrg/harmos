package com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessages;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_bibliographyForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_documentForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_moduleForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_practiceDetailInputForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_webSiteForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service.SC_01_01_01_002_RegisterServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service.SC_01_01_01_002_RegisterServiceOutput;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.repository.SC_01.SC_01_01.SC_01_01_01_practiceDetailInputRepository;
import com.nn.harmos.domain.service.common.fw.AbstractService;
import com.nn.harmos.domain.service.common.validator.SizeValidatorForArraysOfChar;
import com.nn.harmos.domain.util.FileUtils;

@Service
@Transactional
public class SC_01_01_01_002_registerService
		extends AbstractService<SC_01_01_01_002_RegisterServiceInput, SC_01_01_01_002_RegisterServiceOutput> {

	/**
	 * サンプル詳細のリポジトリ
	 */
	@Inject
	SC_01_01_01_practiceDetailInputRepository practiceDetailInputRepository;

	@Override
	public SC_01_01_01_002_RegisterServiceOutput doExecute(SC_01_01_01_002_RegisterServiceInput input) {

		UserAccount account = input.getAccount();
		SC_01_01_01_practiceDetailInputForm form = input.getForm();
		ResultMessages resultMessages = ResultMessages.error();

		// ■ 単項目チェック
		// モジュール、参考文献、参考サイト、参考資料に関しては動的なフォームの増減を許容しているため、サービスにて短項目チェックを実施する.
		boolean hasError = false;
		List<SC_01_01_01_moduleForm> moduleList = form.getModuleList();
		int moduleOverviewMin = 0;
		int moduleOverviewMax = 100;
		int moduleValidateIndex = 1;
		for (SC_01_01_01_moduleForm module : moduleList) {
			if (!SizeValidatorForArraysOfChar.isValid(module.getOverview().toCharArray(), moduleOverviewMin,
					moduleOverviewMax)) {
				// モジュールがセットで入力されていなければエラー
				resultMessages.add("e.hw.SC_01_01_01.0001", moduleValidateIndex + "番目のモジュール概要", moduleOverviewMin,
						moduleOverviewMax);
				hasError = true;
			}
		}

		if (hasError) {
			// 短項目チェックを実施した結果1件でもエラーがある場合、業務例外処理を実施.
			throw new BusinessException(resultMessages);
		}

		// ■ 相関チェック
		for (SC_01_01_01_moduleForm module : moduleList) {
			if (StringUtils.isNotBlank(module.getOverview()) || FileUtils.isValid(module.getModule())) {
				if (StringUtils.isBlank(module.getOverview()) || !FileUtils.isValid(module.getModule())) {
					// モジュールがセットで入力されていなければエラー
					resultMessages.add("e.hw.SC_01_01_01.0002", "モジュール", "概要", "ファイル");
					hasError = true;
					break;
				}
			}
		}

		List<SC_01_01_01_bibliographyForm> bibliographyList = form.getBibliographyList();
		for (SC_01_01_01_bibliographyForm bibliography : bibliographyList) {
			if (StringUtils.isNotBlank(bibliography.getName()) || StringUtils.isNotBlank(bibliography.getPublisher())) {
				if (StringUtils.isBlank(bibliography.getName()) || StringUtils.isBlank(bibliography.getPublisher())) {
					// 参考文献がセットで入力されていなければエラー
					resultMessages.add("e.hw.SC_01_01_01.0002", "参考文献", "文献名", "出版社");
					hasError = true;
					break;
				}
			}
		}

		List<SC_01_01_01_webSiteForm> webSiteList = form.getWebSiteList();
		for (SC_01_01_01_webSiteForm webSite : webSiteList) {
			if (StringUtils.isNotBlank(webSite.getOverview()) || StringUtils.isNotBlank(webSite.getUrl())) {
				if (StringUtils.isBlank(webSite.getOverview()) || StringUtils.isBlank(webSite.getUrl())) {
					// 参考サイトがセットで入力されていなければエラー
					resultMessages.add("e.hw.SC_01_01_01.0002", "参考サイト", "概要", "URL");
					hasError = true;
					break;
				}
			}
		}

		List<SC_01_01_01_documentForm> documentList = form.getDocumentList();
		for (SC_01_01_01_documentForm document : documentList) {
			if (StringUtils.isNotBlank(document.getOverview()) || FileUtils.isValid(document.getDocument())) {
				if (StringUtils.isBlank(document.getOverview()) || !FileUtils.isValid(document.getDocument())) {
					// 参考資料がセットで入力されていなければエラー
					resultMessages.add("e.hw.SC_01_01_01.0002", "参考資料", "概要", "ファイル");
					hasError = true;
					break;
				}
			}
		}

		if (hasError) {
			// 相関項目チェックを実施した結果1件でもエラーがある場合、業務例外処理を実施.
			throw new BusinessException(resultMessages);
		}

		// ■ サンプル管理番号の採番
		final String practiceMngNo = practiceDetailInputRepository.numberingPracticeMngNo();
		form.setPracticeMngNo(practiceMngNo);

		// モジュール登録フラグ
		boolean registModule = false;
		// 参考文献登録フラグ
		boolean registBibliography = false;
		// 参考サイト登録フラグ
		boolean registWebsite = false;
		// 参考資料登録フラグ
		boolean registDocument = false;

		// ■ サンプルモジュールを登録する
		int moduleIndex = 0;
		for (SC_01_01_01_moduleForm moduleForm : moduleList) {
			if (StringUtils.isNotBlank(moduleForm.getOverview())) {
				MultipartFile module = moduleForm.getModule();
				try {
					practiceDetailInputRepository.insertPracticeModule(form.getPracticeMngNo(), moduleIndex,
							moduleForm.getOverview(), module.getOriginalFilename(), module.getInputStream(), account);
				} catch (IOException e) {
					resultMessages.add("e.hw.SC_01_01_01.0002", module.getOriginalFilename());
				}
				registModule = true;
				moduleIndex++;
			}
		}

		// ■ 参考文献を登録する
		int bibliographyIndex = 0;
		for (SC_01_01_01_bibliographyForm bibliographyForm : bibliographyList) {
			if (StringUtils.isNotBlank(bibliographyForm.getName())) {
				practiceDetailInputRepository.insertPracticeBibliography(form.getPracticeMngNo(), bibliographyIndex,
						bibliographyForm, account);
				registBibliography = true;
				bibliographyIndex++;
			}
		}

		// ■ 参考サイトを登録する
		int webSiteIndex = 0;
		for (SC_01_01_01_webSiteForm webSiteForm : webSiteList) {
			if (StringUtils.isNotBlank(webSiteForm.getOverview())) {
				practiceDetailInputRepository.insertPracticeWebsite(form.getPracticeMngNo(), webSiteIndex, webSiteForm,
						account);
				registWebsite = true;
				webSiteIndex++;
			}
		}

		// ■ 参考資料を登録する
		int documentIndex = 0;
		for (SC_01_01_01_documentForm documentForm : documentList) {
			if (StringUtils.isNotBlank(documentForm.getOverview())) {
				MultipartFile document = documentForm.getDocument();
				try {
					practiceDetailInputRepository.insertPracticeDocment(form.getPracticeMngNo(), documentIndex,
							documentForm.getOverview(), document.getOriginalFilename(), document.getInputStream(),
							account);
				} catch (IOException e) {
					resultMessages.add("e.hw.SC_01_01_01.0002", document.getOriginalFilename());
				}
				registDocument = true;
				documentIndex++;
			}
		}

		// ■ サンプル管理を登録する
		practiceDetailInputRepository.insertPracticeMng(form, registModule, registBibliography, registWebsite,
				registDocument, account);

		// ■ 出力値設定
		SC_01_01_01_002_RegisterServiceOutput output = new SC_01_01_01_002_RegisterServiceOutput();
		output.setForm(form);
		return output;
	}
}
