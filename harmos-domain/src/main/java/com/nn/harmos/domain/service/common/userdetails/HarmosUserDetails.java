package com.nn.harmos.domain.service.common.userdetails;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.nn.harmos.domain.model.common.UserAccount;

/**
 * 
 * org.springframework.security.core.userdetails.UserDetailsインタフェースを実装する。<BR>
 * ここではUserDetailsを実装したorg.springframework.security.core.userdetails.Userクラスを継承し、<BR>
 * 本プロジェクト用のUserDetailsクラスを実装する。<BR>
 * 
 * @author nakashima
 *
 */
public class HarmosUserDetails extends User {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8569517915922070758L;

	// Springの認証ユーザークラスに、本プロジェクトのアカウント情報を保持させる。
	private final UserAccount userAccount;

	/**
	 * コンストラクタ
	 * 
	 * @param userAccount
	 */
	public HarmosUserDetails(UserAccount userAccount) {

		// Userクラスのコンストラクタを呼び出す。
		// 第1引数はユーザー名、第2引数はパスワード、第3引数は権限リストである。
		super(userAccount.getUserCd(), userAccount.getPassword(),
				AuthorityUtils.createAuthorityList(userAccount.getAuthCd()));
		this.userAccount = userAccount;
	}

	/**
	 * ユーザアカウントオブジェクトを取得する
	 * 
	 * @return
	 */
	public UserAccount getUserAccount() {

		// アカウント情報のgetterを用意する。これにより、ログインユーザーのAccountオブジェクトを取得することができる。
		return userAccount;
	}
}
