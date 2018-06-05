package com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_bibliographyForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_documentForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_moduleForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_practiceDetailInputForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_webSiteForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service.SC_01_01_01_001_InitFormServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service.SC_01_01_01_001_InitFormServiceOutput;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.repository.SC_01.SC_01_01.SC_01_01_01_practiceDetailInputRepository;
import com.nn.harmos.domain.repository.common.CodeListRepository;
import com.nn.harmos.domain.service.common.fw.AbstractService;

@Service
@Transactional
public class SC_01_01_01_001_initFormService
		extends AbstractService<SC_01_01_01_001_InitFormServiceInput, SC_01_01_01_001_InitFormServiceOutput> {

	/**
	 * コード関連のリポジトリ
	 */
	@Inject
	CodeListRepository codeListRepository;

	/**
	 * サンプル詳細のリポジトリ
	 */
	@Inject
	SC_01_01_01_practiceDetailInputRepository practiceDetailInputRepository;

	@Override
	public SC_01_01_01_001_InitFormServiceOutput doExecute(SC_01_01_01_001_InitFormServiceInput input)
			throws Exception {

		UserAccount account = input.getAccount();
		SC_01_01_01_practiceDetailInputForm form = input.getForm();

		// カテゴリリストボックスを設定
		form.setCategoryList(codeListRepository.getKbnCodeList("B0001"));

		// モジュールを初期化
		List<SC_01_01_01_moduleForm> moduleList = new ArrayList<SC_01_01_01_moduleForm>();
		moduleList.add(new SC_01_01_01_moduleForm());
		form.setModuleList(moduleList);

		// 参考文献を初期化
		List<SC_01_01_01_bibliographyForm> bibliographyList = new ArrayList<SC_01_01_01_bibliographyForm>();
		bibliographyList.add(new SC_01_01_01_bibliographyForm());
		form.setBibliographyList(bibliographyList);

		// WEBサイトを初期化
		List<SC_01_01_01_webSiteForm> webSiteList = new ArrayList<SC_01_01_01_webSiteForm>();
		webSiteList.add(new SC_01_01_01_webSiteForm());
		form.setWebSiteList(webSiteList);

		// 参考資料を初期化
		List<SC_01_01_01_documentForm> documentList = new ArrayList<SC_01_01_01_documentForm>();
		documentList.add(new SC_01_01_01_documentForm());
		form.setDocumentList(documentList);

		// 出力値設定
		SC_01_01_01_001_InitFormServiceOutput output = new SC_01_01_01_001_InitFormServiceOutput();
		output.setForm(form);
		return output;
	}
}
