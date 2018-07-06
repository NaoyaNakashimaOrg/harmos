package com.nn.harmos.app.SC_01_01_practiceDetail;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenType;

import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.form.SC_01_01_02_practiceDetailInquiryForm;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.service.SC_01_01_02_001_inquiryFormServiceInput;
import com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.service.SC_01_01_02_001_inquiryFormServiceOutput;
import com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.SC_01_01_01_001_initFormService;
import com.nn.harmos.domain.service.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.SC_01_01_02_001_inquiryFormService;
import com.nn.harmos.domain.service.common.userdetails.HarmosUserDetails;

@Controller
@SessionAttributes(value = "SC_01_01_02_practiceDetailInquiryForm")
@RequestMapping("SC_01_01_02")
public class SC_01_01_02_practiceDetailInquiry_Controller {

	@Inject
	protected Mapper beanMapper;

	/**
	 * サンプル登録フォーム表示サービス
	 */
	@Inject
	SC_01_01_01_001_initFormService initFormService;

	/**
	 * サンプル詳細照会サービス
	 */
	@Inject
	SC_01_01_02_001_inquiryFormService inquiryFormService;
	
	/**
	 * 
	 * <B>SC_01_01_02_サンプル詳細を表示する.</B>
	 * <P>
	 * 以下のURLにアクセスすることで本メソッドが呼び出される.<BR>
	 * ${pageContext.request.contextPath}/SC_01_01_02/practiceDetailInquiry?inquiryForm<BR>
	 * 
	 * @param key 
	 * @param form 
	 * @param userDetails 
	 * @param model 
	 * @return
	 */
	@RequestMapping(value = "practiceDetailInquiry", params = "inquiryForm")
	public String inquiryForm(@ModelAttribute("key") String key, SC_01_01_02_practiceDetailInquiryForm form,
			@AuthenticationPrincipal HarmosUserDetails userDetails, Model model) {

		// ---------------------------------------------------------------------
		// フォームの初期化
		// ---------------------------------------------------------------------
		form = setUpForm();

		// ---------------------------------------------------------------------
		// 業務ロジック実行
		// ---------------------------------------------------------------------
		SC_01_01_02_001_inquiryFormServiceInput input = new SC_01_01_02_001_inquiryFormServiceInput();
		input.setPracticeMngNo(key);
		input.setForm(form);
		SC_01_01_02_001_inquiryFormServiceOutput output = null;

		try {
			output = inquiryFormService.doExecute(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ---------------------------------------------------------------------
		// モデルへフォームを追加
		// ---------------------------------------------------------------------
		model.addAttribute(output.getForm());

		return "SC_01_01_practiceDetail/SC_01_01_02_practiceDetailInquiry";
	}

	/**
	 * 
	 * <B>フォームのセットアップを行う.</B>
	 * 
	 * @return
	 */
	@ModelAttribute(value = "SC_01_01_02_practiceDetailInquiryForm")
	public SC_01_01_02_practiceDetailInquiryForm setUpForm() {
		return new SC_01_01_02_practiceDetailInquiryForm();
	}
}
