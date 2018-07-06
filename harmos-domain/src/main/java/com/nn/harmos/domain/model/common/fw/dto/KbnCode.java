package com.nn.harmos.domain.model.common.fw.dto;

import java.io.Serializable;

public class KbnCode implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2095877305769247697L;

	/**
	 * 区分コード
	 */
	private String kubunCd;

	/**
	 * 区分名
	 */
	private String kubunName;

	/**
	 * 区分別名１
	 */
	private String kubunBetsuName1;

	/**
	 * 区分別名２
	 */
	private String kubunBetsuName2;

	/**
	 * 区分別名３
	 */
	private String kubunBetsuName3;

	/**
	 * 親コード
	 */
	private String parentCd;

	/**
	 * 区分コードを取得する
	 * 
	 * @return 区分コード
	 */
	public String getKubunCd() {
		return kubunCd;
	}

	/**
	 * 区分コードを設定する
	 * 
	 * @param kubunCd
	 *            区分コード
	 */
	public void setKubunCd(String kubunCd) {
		this.kubunCd = kubunCd;
	}

	/**
	 * 区分名を取得する
	 * 
	 * @return 区分名
	 */
	public String getKubunName() {
		return kubunName;
	}

	/**
	 * 区分名を設定する
	 * 
	 * @param kubunName
	 *            区分名
	 */
	public void setKubunName(String kubunName) {
		this.kubunName = kubunName;
	}

	/**
	 * 区分別名１を取得する
	 * 
	 * @return 区分別名１
	 */
	public String getKubunBetsuName1() {
		return kubunBetsuName1;
	}

	/**
	 * 区分別名１を設定する
	 * 
	 * @param kubunBetsuName1
	 *            区分別名１
	 */
	public void setKubunBetsuName1(String kubunBetsuName1) {
		this.kubunBetsuName1 = kubunBetsuName1;
	}

	/**
	 * 区分別名２を取得する
	 * 
	 * @return 区分別名２
	 */
	public String getKubunBetsuName2() {
		return kubunBetsuName2;
	}

	/**
	 * 区分別名２を設定する
	 * 
	 * @param kubunBetsuName2
	 *            区分別名２
	 */
	public void setKubunBetsuName2(String kubunBetsuName2) {
		this.kubunBetsuName2 = kubunBetsuName2;
	}

	/**
	 * 区分別名３を取得する
	 * 
	 * @return 区分別名３
	 */
	public String getKubunBetsuName3() {
		return kubunBetsuName3;
	}

	/**
	 * 区分別名３を設定する
	 * 
	 * @param kubunBetsuName3
	 *            区分別名３
	 */
	public void setKubunBetsuName3(String kubunBetsuName3) {
		this.kubunBetsuName3 = kubunBetsuName3;
	}

	/**
	 * 親コードを取得する
	 * 
	 * @return 親コード
	 */
	public String getParentCd() {
		return parentCd;
	}

	/**
	 * 親コードを設定する
	 * 
	 * @param parentCd
	 *            親コード
	 */
	public void setParentCd(String parentCd) {
		this.parentCd = parentCd;
	}
}
