package com.nn.harmos.app.SC_01_02_practiceSearch;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.service.common.userdetails.HarmosUserDetails;

@Controller
@SessionAttributes(value = "SC_01_02_01_practiceSearchForm")
@RequestMapping("SC_01_02_01")
public class SC_01_02_01_practiceSearch_Controller {

	@Inject
	protected Mapper beanMapper;

	@RequestMapping(value = "practiceSearch", params = "searchForm")
	public String searchForm(SC_01_02_01_practiceSearchForm form,
			@AuthenticationPrincipal HarmosUserDetails userDetails, Model model) {

		// ---------------------------------------------------------------------
		// フォームの初期化
		// ---------------------------------------------------------------------
		form = setUpForm();

		return "SC_01_02_practiceSearch/SC_01_02_01_practiceSearch";
	}

	@ModelAttribute(value = "SC_01_02_01_practiceSearchForm")
	public SC_01_02_01_practiceSearchForm setUpForm() {
		return new SC_01_02_01_practiceSearchForm();
	}
}
