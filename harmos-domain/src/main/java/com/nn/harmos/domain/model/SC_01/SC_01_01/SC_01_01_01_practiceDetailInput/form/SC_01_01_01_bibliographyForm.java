package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_01_practiceDetailInput.form;

import java.io.Serializable;

public class SC_01_01_01_bibliographyForm implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7031051294705717025L;

	/**
	 * 参考文献名称
	 */
	private String name;

	/**
	 * 参考文献出版社
	 */
	private String publisher;

	/**
	 * 参考文献名称を取得する
	 * 
	 * @return 参考文献名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 参考文献名称を設定する
	 * 
	 * @param name
	 *            参考文献名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 参考文献出版社を取得する
	 * 
	 * @return 参考文献出版社
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * 参考文献出版社を設定する
	 * 
	 * @param publisher
	 *            参考文献出版社
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
