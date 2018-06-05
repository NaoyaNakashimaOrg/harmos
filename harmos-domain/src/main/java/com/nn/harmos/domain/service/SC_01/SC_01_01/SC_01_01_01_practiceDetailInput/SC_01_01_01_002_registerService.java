package com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

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

		// サンプル管理番号の採番
		final String practiceMngNo = practiceDetailInputRepository.numberingPracticeMngNo();
		form.setPracticeMngNo(practiceMngNo);

		// TH0101_サンプル管理を登録する
		practiceDetailInputRepository.insertPracticeMng(form, account);

		// TH0102_サンプルモジュールを登録する
		List<SC_01_01_01_moduleForm> moduleList = form.getModuleList();
		for (int mi = 0; mi < moduleList.size(); mi++) {
			SC_01_01_01_moduleForm moduleForm = moduleList.get(mi);
			MultipartFile module = moduleForm.getModule();
			practiceDetailInputRepository.insertPracticeModule(form.getPracticeMngNo(), mi, moduleForm.getOverview(),
					module.getOriginalFilename(), module.getInputStream(), account);
		}

		// TH0103_参考文献を登録する
		List<SC_01_01_01_bibliographyForm> bibliographyList = form.getBibliographyList();
		for (int bi = 0; bi < bibliographyList.size(); bi++) {
			practiceDetailInputRepository.insertPracticeBibliography(form.getPracticeMngNo(), bi,
					bibliographyList.get(bi), account);
		}

		// TH0104_参考サイトを登録する
		List<SC_01_01_01_webSiteForm> webSiteList = form.getWebSiteList();
		for (int wi = 0; wi < webSiteList.size(); wi++) {
			practiceDetailInputRepository.insertPracticeWebsite(form.getPracticeMngNo(), wi, webSiteList.get(wi),
					account);
		}

		// TH0105_参考資料を登録する
		List<SC_01_01_01_documentForm> documentList = form.getDocumentList();
		for (int di = 0; di < documentList.size(); di++) {
			SC_01_01_01_documentForm documentForm = documentList.get(di);
			MultipartFile document = documentForm.getDocument();
			practiceDetailInputRepository.insertPracticeDocment(form.getPracticeMngNo(), di, documentForm.getOverview(),
					document.getOriginalFilename(), document.getInputStream(), account);
		}

		// 出力値設定
		SC_01_01_01_002_RegisterServiceOutput output = new SC_01_01_01_002_RegisterServiceOutput();
		output.setForm(form);
		return output;
	}
}
