package com.nn.harmos.app.SC_01_02_practiceSearch;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.form.SC_01_02_01_practiceSearchForm;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_001_searchFormServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_001_searchFormServiceOutput;
import com.nn.harmos.domain.model.SC_01.SC_01_02.SC_01_02_01_practiceSearch.service.SC_01_02_01_002_searchServiceInput;
import com.nn.harmos.domain.service.SC_01.SC_01_02.SC_01_02_01_practiceSearch.SC_01_02_01_001_searchFormService;
import com.nn.harmos.domain.service.SC_01.SC_01_02.SC_01_02_01_practiceSearch.SC_01_02_01_002_searchService;
import com.nn.harmos.domain.service.common.userdetails.HarmosUserDetails;

@Controller
@SessionAttributes(value = "SC_01_02_01_practiceSearchForm")
@RequestMapping("SC_01_02_01")
public class SC_01_02_01_practiceSearch_Controller {

	@Inject
	protected Mapper beanMapper;

	@Inject
	SC_01_02_01_002_searchService searchServive;

	@Inject
	SC_01_02_01_001_searchFormService searchFormService;

	/**
	 * 
	 * <B>SC_01_02_01_サンプル検索を表示する.</B>
	 * <P>
	 * 以下のURLにアクセスすることで本メソッドが呼び出される.<BR>
	 * ${pageContext.request.contextPath}/SC_01_02_01/practiceSearch?searchForm<BR>
	 * 
	 * @param form
	 * @param userDetails
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "practiceSearch", params = "searchForm")
	public String searchForm(SC_01_02_01_practiceSearchForm form,
			@AuthenticationPrincipal HarmosUserDetails userDetails, Model model) {

		// ---------------------------------------------------------------------
		// フォームの初期化
		// ---------------------------------------------------------------------
		form = setUpForm();

		// ---------------------------------------------------------------------
		// 業務ロジック実行
		// ---------------------------------------------------------------------
		SC_01_02_01_001_searchFormServiceInput input = new SC_01_02_01_001_searchFormServiceInput();
		input.setAccount(userDetails.getUserAccount());
		input.setForm(form);
		SC_01_02_01_001_searchFormServiceOutput output = null;

		try {
			output = searchFormService.doExecute(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ---------------------------------------------------------------------
		// モデルへフォームを追加
		// ---------------------------------------------------------------------
		model.addAttribute(output.getForm());

		return "SC_01_02_practiceSearch/SC_01_02_01_practiceSearch";
	}

	/**
	 * 
	 * <B>SC_01_02_01_サンプル検索を行う.</B>
	 * <P>
	 * 以下のURLにアクセスすることで本メソッドが呼び出される.<BR>
	 * ${pageContext.request.contextPath}/SC_01_02_01/practiceSearch?search<BR>
	 * 
	 * @param form
	 * @param result
	 * @param userDetails
	 * @param model
	 * @param sessionStatus
	 * @param attributes
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "practiceSearch", params = "search")
	public String search(@Validated SC_01_02_01_practiceSearchForm form, BindingResult result,
			@AuthenticationPrincipal HarmosUserDetails userDetails, Model model, SessionStatus sessionStatus,
			RedirectAttributes attributes) {

		// ---------------------------------------------------------------------
		// 入力チェック
		// ---------------------------------------------------------------------
		if (result.hasErrors()) {
			// 入力チェックエラーの場合、入力フォームへ戻る
			return redo(form, model);
		}

		// ---------------------------------------------------------------------
		// 業務ロジック実行
		// ---------------------------------------------------------------------
		SC_01_02_01_002_searchServiceInput input = new SC_01_02_01_002_searchServiceInput();
		input.setAccount(userDetails.getUserAccount());
		input.setForm(form);

		try {
			searchServive.doExecute(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SC_01_02_practiceSearch/SC_01_02_01_practiceSearch";
	}

	/**
	 * <B>SC_01_02_01_サンプル検索の表示メソッドを呼び出す.</B>
	 * <P>
	 * 
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "practiceSearch", method = RequestMethod.POST, params = "redo")
	public String redo(SC_01_02_01_practiceSearchForm form, Model model) {

		return "SC_01_01_practiceDetail/SC_01_01_01_practiceDetailInput";
	}

	@ModelAttribute(value = "SC_01_02_01_practiceSearchForm")
	public SC_01_02_01_practiceSearchForm setUpForm() {
		return new SC_01_02_01_practiceSearchForm();
	}
}
