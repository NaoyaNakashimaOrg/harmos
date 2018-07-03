package com.nn.harmos.domain.service.SC_01.SC_01_02.SC_01_02_01_practiceSearch;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_001_searchServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_001_searchServiceOutput;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.repository.SC_01.SC_01_01.SC_01_01_01_practiceDetailInputRepository;
import com.nn.harmos.domain.service.common.fw.AbstractService;

@Service
@Transactional
public class SC_01_02_01_001_searchService
		extends AbstractService<SC_01_02_01_001_searchServiceInput, SC_01_02_01_001_searchServiceOutput> {

	/**
	 * サンプル詳細のリポジトリ
	 */
	@Inject
	SC_01_01_01_practiceDetailInputRepository practiceDetailInputRepository;

	@Override
	public SC_01_02_01_001_searchServiceOutput doExecute(SC_01_02_01_001_searchServiceInput input) throws Exception {

		UserAccount account = input.getAccount();
		SC_01_02_01_practiceSearchForm form = input.getForm();

		SC_01_02_01_001_searchServiceOutput output = null;
		return output;
	}
}
