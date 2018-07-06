package com.nn.harmos.domain.service.SC_01.SC_01_02.SC_01_02_01_practiceSearch;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_001_searchFormServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_001_searchFormServiceOutput;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.repository.common.CodeListRepository;
import com.nn.harmos.domain.service.common.fw.AbstractService;

@Service
@Transactional
public class SC_01_02_01_001_searchFormService
		extends AbstractService<SC_01_02_01_001_searchFormServiceInput, SC_01_02_01_001_searchFormServiceOutput> {

	/**
	 * コードリスト取得用リポジトリ
	 */
	@Inject
	CodeListRepository codeListRepository;

	@Override
	public SC_01_02_01_001_searchFormServiceOutput doExecute(SC_01_02_01_001_searchFormServiceInput input)
			throws Exception {

		UserAccount account = input.getAccount();
		SC_01_02_01_practiceSearchForm form = input.getForm();

		// コードリスト取得（B0001：一致区分）
		form.setIcchiKbnList(codeListRepository.getKbnCodeList("B0002"));

		SC_01_02_01_001_searchFormServiceOutput output = new SC_01_02_01_001_searchFormServiceOutput();
		output.setForm(form);
		return output;
	}
}
