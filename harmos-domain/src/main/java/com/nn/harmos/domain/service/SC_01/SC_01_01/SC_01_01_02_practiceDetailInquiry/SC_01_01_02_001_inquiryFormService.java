package com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeBibliography;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeDocument;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeMng;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeModule;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean.PracticeWebsite;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_bibliographyForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_documentForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_moduleForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_practiceDetailInquiryForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_webSiteForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.service.SC_01_01_02_001_inquiryFormServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.service.SC_01_01_02_001_inquiryFormServiceOutput;
import com.nn.harmos.domain.repository.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiryRepository;
import com.nn.harmos.domain.repository.common.CodeListRepository;
import com.nn.harmos.domain.service.common.fw.AbstractService;

@Service
@Transactional
public class SC_01_01_02_001_inquiryFormService
		extends AbstractService<SC_01_01_02_001_inquiryFormServiceInput, SC_01_01_02_001_inquiryFormServiceOutput> {

	/**
	 * コード関連のリポジトリ
	 */
	@Inject
	CodeListRepository codeListRepository;

	/**
	 * サンプル詳細のリポジトリ
	 */
	@Inject
	SC_01_01_02_practiceDetailInquiryRepository practiceDetailInquiryRepository;

	@Override
	public SC_01_01_02_001_inquiryFormServiceOutput doExecute(SC_01_01_02_001_inquiryFormServiceInput input)
			throws Exception {

		SC_01_01_02_practiceDetailInquiryForm form = input.getForm();

		// TH0101_サンプル管理を取得する
		PracticeMng practiceMng = practiceDetailInquiryRepository.getPracticeMng(input.getPracticeMngNo());
		form.setPracticeMngNo(practiceMng.getPracticeMngNo());
		form.setOverview(practiceMng.getOverview());
		form.setCategory(practiceMng.getCategory());
		form.setDetail(practiceMng.getDetail());
		form.setMemo(practiceMng.getMemo());

		// TH0102_サンプルモジュールを取得する
		List<PracticeModule> moduleList = practiceDetailInquiryRepository.getPracticeModule(input.getPracticeMngNo());
		List<SC_01_01_02_moduleForm> moduleFormList = new ArrayList<SC_01_01_02_moduleForm>();
		for (PracticeModule module : moduleList) {
			SC_01_01_02_moduleForm moduleForm = new SC_01_01_02_moduleForm();
			moduleForm.setModuleNo(module.getModuleNo());
			moduleForm.setOverview(module.getModuleOverview());
			moduleForm.setModuleName(module.getModuleName());
			moduleFormList.add(moduleForm);
		}
		form.setModuleList(moduleFormList);

		// TH0103_参考文献を取得する
		List<PracticeBibliography> bibliographyList = practiceDetailInquiryRepository
				.getPracticeBibliography(input.getPracticeMngNo());
		List<SC_01_01_02_bibliographyForm> bibliographyFormList = new ArrayList<SC_01_01_02_bibliographyForm>();
		for (PracticeBibliography bibliography : bibliographyList) {
			SC_01_01_02_bibliographyForm bibliographyForm = new SC_01_01_02_bibliographyForm();
			bibliographyForm.setName(bibliography.getBibliographyName());
			bibliographyForm.setPublisher(bibliography.getBibliographyName());
			bibliographyFormList.add(bibliographyForm);
		}
		form.setBibliographyList(bibliographyFormList);

		// TH0104_参考サイトを取得する
		List<PracticeWebsite> practiceWebsiteList = practiceDetailInquiryRepository
				.getPracticeWebsite(input.getPracticeMngNo());
		List<SC_01_01_02_webSiteForm> webSiteList = new ArrayList<SC_01_01_02_webSiteForm>();
		for (PracticeWebsite practiceWebsite : practiceWebsiteList) {
			SC_01_01_02_webSiteForm websiteForm = new SC_01_01_02_webSiteForm();
			websiteForm.setOverview(practiceWebsite.getWebsiteOverview());
			websiteForm.setUrl(practiceWebsite.getWebsiteUrl());
			webSiteList.add(websiteForm);
		}
		form.setWebSiteList(webSiteList);

		// TH0105_参考資料を取得する
		List<PracticeDocument> practiceDocumentList = practiceDetailInquiryRepository
				.getPracticeDocument(input.getPracticeMngNo());
		List<SC_01_01_02_documentForm> documentList = new ArrayList<SC_01_01_02_documentForm>();
		for (PracticeDocument practiceDocument : practiceDocumentList) {
			SC_01_01_02_documentForm documentForm = new SC_01_01_02_documentForm();
			documentForm.setDocumentNo(practiceDocument.getDocumentNo());
			documentForm.setOverview(practiceDocument.getDocumentOverview());
			documentForm.setDocumentName(practiceDocument.getDocumentName());
			documentList.add(documentForm);
		}
		form.setDocumentList(documentList);

		// 出力値設定
		SC_01_01_02_001_inquiryFormServiceOutput output = new SC_01_01_02_001_inquiryFormServiceOutput();
		output.setForm(form);
		return output;
	}
}
