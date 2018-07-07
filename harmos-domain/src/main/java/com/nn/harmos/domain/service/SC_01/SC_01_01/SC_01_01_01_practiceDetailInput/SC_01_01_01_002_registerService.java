package com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.terasoluna.gfw.common.exception.BusinessException;

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
	public SC_01_01_01_002_RegisterServiceOutput doExecute(SC_01_01_01_002_RegisterServiceInput input)
			throws Exception {

		UserAccount account = input.getAccount();
		SC_01_01_01_practiceDetailInputForm form = input.getForm();

		// ■ 相関チェック
		List<SC_01_01_01_moduleForm> moduleList = form.getModuleList();
		for (SC_01_01_01_moduleForm module : moduleList) {
			if (StringUtils.isNotBlank(module.getOverview()) || FileUtils.isValid(module.getModule())) {
				if (StringUtils.isBlank(module.getOverview()) || !FileUtils.isValid(module.getModule())) {
					// モジュールがセットで入力されていなければエラー
					// TODO
					throw new BusinessException("");
				}
			}
		}

		List<SC_01_01_01_bibliographyForm> bibliographyList = form.getBibliographyList();
		for (SC_01_01_01_bibliographyForm bibliography : bibliographyList) {
			if (StringUtils.isNotBlank(bibliography.getName()) || StringUtils.isNotBlank(bibliography.getPublisher())) {
				if (StringUtils.isBlank(bibliography.getName()) || StringUtils.isBlank(bibliography.getPublisher())) {
					// 参考文献がセットで入力されていなければエラー
					// TODO
					throw new BusinessException("");
				}
			}
		}

		List<SC_01_01_01_webSiteForm> webSiteList = form.getWebSiteList();
		for (SC_01_01_01_webSiteForm webSite : webSiteList) {
			if (StringUtils.isNotBlank(webSite.getOverview()) || StringUtils.isNotBlank(webSite.getUrl())) {
				if (StringUtils.isBlank(webSite.getOverview()) || StringUtils.isBlank(webSite.getUrl())) {
					// 参考サイトがセットで入力されていなければエラー
					// TODO
					throw new BusinessException("");
				}
			}
		}

		List<SC_01_01_01_documentForm> documentList = form.getDocumentList();
		for (SC_01_01_01_documentForm document : documentList) {
			if (StringUtils.isNotBlank(document.getOverview()) || FileUtils.isValid(document.getDocument())) {
				if (StringUtils.isBlank(document.getOverview()) || !FileUtils.isValid(document.getDocument())) {
					// 参考資料がセットで入力されていなければエラー
					// TODO
					throw new BusinessException("");
				}
			}
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
				practiceDetailInputRepository.insertPracticeModule(form.getPracticeMngNo(), moduleIndex,
						moduleForm.getOverview(), module.getOriginalFilename(), module.getInputStream(), account);
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
				practiceDetailInputRepository.insertPracticeDocment(form.getPracticeMngNo(), documentIndex,
						documentForm.getOverview(), document.getOriginalFilename(), document.getInputStream(), account);
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
