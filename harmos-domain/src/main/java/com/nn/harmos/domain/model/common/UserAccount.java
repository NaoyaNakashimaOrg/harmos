package com.nn.harmos.domain.model.common;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザアカウントの認証情報を保持するクラス <BR>
 * 
 * @author nakashima
 *
 */
public class UserAccount implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6264722011096287529L;

	/**
	 * ユーザコード
	 */
	private String userCd;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 権限コード
	 */
	private String authCd;

	/**
	 * 最終ログイン日時
	 */
	private Date lastLoginDate;

	/**
	 * ユーザ名漢字（姓）
	 */
	private String userNameKanjiSei;

	/**
	 * ユーザ名漢字（名）
	 */
	private String userNameKanjiMei;

	/**
	 * ユーザコードを取得する
	 * 
	 * @return ユーザコード
	 */
	public String getUserCd() {
		return userCd;
	}

	/**
	 * ユーザコードを設定する
	 * 
	 * @param userCd
	 *            ユーザコード
	 */
	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	/**
	 * パスワードを取得する
	 * 
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを設定する
	 * 
	 * @param password
	 *            パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 権限コードを取得する
	 * 
	 * @return 権限コード
	 */
	public String getAuthCd() {
		return authCd;
	}

	/**
	 * 権限コードを設定する
	 * 
	 * @param authCd
	 *            権限コード
	 */
	public void setAuthCd(String authCd) {
		this.authCd = authCd;
	}

	/**
	 * 最終ログイン日時を取得する
	 * 
	 * @return 最終ログイン日時
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	/**
	 * 最終ログイン日時を設定する
	 * 
	 * @param lastLoginDate
	 *            最終ログイン日時
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * ユーザ名漢字（姓）を取得する
	 * 
	 * @return ユーザ名漢字（姓）
	 */
	public String getUserNameKanjiSei() {
		return userNameKanjiSei;
	}

	/**
	 * ユーザ名漢字（姓）を設定する
	 * 
	 * @param userNameKanjiSei
	 *            ユーザ名漢字（姓）
	 */
	public void setUserNameKanjiSei(String userNameKanjiSei) {
		this.userNameKanjiSei = userNameKanjiSei;
	}

	/**
	 * ユーザ名漢字（名）を取得する
	 * 
	 * @return ユーザ名漢字（名）
	 */
	public String getUserNameKanjiMei() {
		return userNameKanjiMei;
	}

	/**
	 * ユーザ名漢字（名）を設定する
	 * 
	 * @param userNameKanjiMei
	 *            ユーザ名漢字（名）
	 */
	public void setUserNameKanjiMei(String userNameKanjiMei) {
		this.userNameKanjiMei = userNameKanjiMei;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new StringBuilder().append(userNameKanjiSei).append(userNameKanjiMei).toString();
	}
}
