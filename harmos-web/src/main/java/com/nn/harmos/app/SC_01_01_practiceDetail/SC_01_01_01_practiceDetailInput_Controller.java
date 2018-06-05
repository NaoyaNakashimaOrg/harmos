package com.nn.harmos.app.SC_01_01_practiceDetail;

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

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form.SC_01_01_01_practiceDetailInputForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service.SC_01_01_01_001_InitFormServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service.SC_01_01_01_001_InitFormServiceOutput;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.service.SC_01_01_01_002_RegisterServiceInput;
import com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.SC_01_01_01_001_initFormService;
import com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.SC_01_01_01_002_registerService;
import com.nn.harmos.domain.service.common.userdetails.HarmosUserDetails;

@Controller
@SessionAttributes(value = "SC_01_01_01_practiceDetailInputForm")
@RequestMapping("SC_01_01_01")
public class SC_01_01_01_practiceDetailInput_Controller {

	@Inject
	protected Mapper beanMapper;

	/**
	 * サンプル登録フォーム表示サービス
	 */
	@Inject
	SC_01_01_01_001_initFormService initFormService;

	/**
	 * サンプル登録サービス
	 */
	@Inject
	SC_01_01_01_002_registerService registerService;

	/**
	 * <B>SC_01_01_01_サンプル登録を表示する</B>
	 * <P>
	 * 以下のURLにアクセスすることで本メソッドが呼び出される<BR>
	 * ${pageContext.request.contextPath}/SC_01_01_01/practiceDetail?registerForm<BR>
	 * registerForm というHTTPパラメータの指定があるため、<BR>
	 * ControllerのregisterFormメソッドが呼び出されフォーム画面が表示される。<BR>
	 * 
	 * @return
	 */
	@RequestMapping(value = "practiceDetailInput", params = "registerForm")
	public String registerForm(SC_01_01_01_practiceDetailInputForm form,
			@AuthenticationPrincipal HarmosUserDetails userDetails, Model model) {

		// ---------------------------------------------------------------------
		// フォームの初期化
		// ---------------------------------------------------------------------
		form = setUpForm();

		// ---------------------------------------------------------------------
		// 業務ロジック実行
		// ---------------------------------------------------------------------
		SC_01_01_01_001_InitFormServiceInput input = new SC_01_01_01_001_InitFormServiceInput();
		input.setAccount(userDetails.getUserAccount());
		input.setForm(form);
		SC_01_01_01_001_InitFormServiceOutput output = null;

		try {
			output = initFormService.doExecute(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute(output.getForm());

		return "SC_01_01_practiceDetail/SC_01_01_01_practiceDetailInput";
	}

	/**
	 * <B>サンプル登録を実行し、サンプル詳細画面の表示メソッドへリダイレクトする</B>
	 * <P>
	 * 
	 * @param form
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "practiceDetailInput", method = RequestMethod.POST, params = "commit")
	public String commit(@Validated SC_01_01_01_practiceDetailInputForm form, BindingResult result,
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
		SC_01_01_01_002_RegisterServiceInput input = new SC_01_01_01_002_RegisterServiceInput();
		input.setAccount(userDetails.getUserAccount());
		input.setForm(form);

		try {
			registerService.doExecute(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ---------------------------------------------------------------------
		// フラッシュスコープへキー情報を追加
		// ---------------------------------------------------------------------
		attributes.addFlashAttribute("key", form.getPracticeMngNo());

		// ---------------------------------------------------------------------
		// セッションステータスの更新
		// ---------------------------------------------------------------------
		sessionStatus.setComplete();

		return "redirect:/SC_01_01_02/practiceDetailInquiry/?inquiryForm";
	}

	/**
	 * <B>SC_01_01_02_サンプル登録の表示メソッドを呼び出す</B>
	 * <P>
	 * 
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "practiceDetail", method = RequestMethod.POST, params = "redo")
	public String redo(SC_01_01_01_practiceDetailInputForm form, Model model) {

		return "SC_01_01_practiceDetail/SC_01_01_01_practiceDetailInput";
	}

	@ModelAttribute(value = "SC_01_01_01_practiceDetailInputForm")
	public SC_01_01_01_practiceDetailInputForm setUpForm() {
		return new SC_01_01_01_practiceDetailInputForm();
	}
}
