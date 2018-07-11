package com.nn.harmos.domain.service.SC_01.SC_01_02.SC_01_02_01_practiceSearch;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessages;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_searchResult;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_002_searchServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_002_searchServiceOutput;
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
	public SC_01_02_01_002_searchServiceOutput doExecute(SC_01_02_01_002_searchServiceInput input) {

		SC_01_02_01_practiceSearchForm form = input.getForm();
		Pageable pageable = input.getPageable();
		ResultMessages resultMessages = ResultMessages.error();
		SC_01_02_01_002_searchServiceOutput output = new SC_01_02_01_002_searchServiceOutput();

		// ■ 一覧件数取得
		long count = practiceSearchRepository.count(form.getSearchCondition());

		if (count == 0) {
			// 検索結果が0件の場合、処理を終了する.
			resultMessages.add("e.hw.common.0001");
			throw new BusinessException(resultMessages);
		}

		// ■ 一覧情報取得
		RowBounds rowBounds = new RowBounds(pageable.getOffset(), pageable.getPageSize());
		List<SC_01_02_01_searchResult> searchResultList = practiceSearchRepository.search(form.getSearchCondition(),
				rowBounds);

		output.setForm(form);
		output.setPage(new PageImpl<>(searchResultList, pageable, count));
		return output;
	}
}
