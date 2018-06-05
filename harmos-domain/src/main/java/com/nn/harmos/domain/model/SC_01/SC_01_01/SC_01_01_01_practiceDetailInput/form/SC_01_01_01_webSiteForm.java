package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form;

import java.io.Serializable;

import javax.validation.constraints.Size;

public class SC_01_01_01_webSiteForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1526596546448241669L;

	/**
	 * 参考サイト概要
	 */
	@Size(min = 0, max = 100)
	private String overview;

	/**
	 * 参考サイトURL
	 */
	@Size(min = 0, max = 1000)
	private String url;

	/**
	 * 参考サイト概要を取得する
	 * @return 参考サイト概要
	 */
	public String getOverview() {
	    return overview;
	}

	/**
	 * 参考サイト概要を設定する
	 * @param overview 参考サイト概要
	 */
	public void setOverview(String overview) {
	    this.overview = overview;
	}

	/**
	 * 参考サイトURLを取得する
	 * @return 参考サイトURL
	 */
	public String getUrl() {
	    return url;
	}

	/**
	 * 参考サイトURLを設定する
	 * @param url 参考サイトURL
	 */
	public void setUrl(String url) {
	    this.url = url;
	}

}
