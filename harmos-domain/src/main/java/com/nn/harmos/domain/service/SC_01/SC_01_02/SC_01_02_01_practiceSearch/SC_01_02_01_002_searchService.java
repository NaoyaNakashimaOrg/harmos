package com.nn.harmos.domain.service.SC_01.SC_01_02.SC_01_02_01_practiceSearch;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_searchResult;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_002_searchServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_002_searchServiceOutput;
import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.repository.SC_01.SC_01_02.SC_01_02_01_practiceSearchRepository;
import com.nn.harmos.domain.service.common.fw.AbstractService;

@Service
@Transactional
public class SC_01_02_01_002_searchService
		extends AbstractService<SC_01_02_01_002_searchServiceInput, SC_01_02_01_002_searchServiceOutput> {

	/**
	 * サンプル検索のリポジトリ
	 */
	@Inject
	SC_01_02_01_practiceSearchRepository practiceSearchRepository;

	@Override
	public SC_01_02_01_002_searchServiceOutput doExecute(SC_01_02_01_002_searchServiceInput input) throws Exception {

		UserAccount account = input.getAccount();
		SC_01_02_01_practiceSearchForm form = input.getForm();

		List<SC_01_02_01_searchResult> searchResultList = practiceSearchRepository.search(form.getSearchCondition());
		form.setSearchResultList(searchResultList);

		SC_01_02_01_002_searchServiceOutput output = new SC_01_02_01_002_searchServiceOutput();
		output.setForm(form);
		return output;
	}
}
