package com.nn.harmos.domain.model.SC_01.SC_01_01.SC_01_01_02_practiceDetailInquiry.bean;

import java.io.Serializable;

public class PracticeBibliography implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9175219630890386377L;

	/**
	 * 参考文献番号
	 */
	private int bibliographyNo;

	/**
	 * 文献名
	 */
	private String bibliographyName;

	/**
	 * 出版社
	 */
	private String publisher;

	/**
	 * 参考文献番号を取得する
	 * 
	 * @return 参考文献番号
	 */
	public int getBibliographyNo() {
		return bibliographyNo;
	}

	/**
	 * 参考文献番号を設定する
	 * 
	 * @param bibliographyNo
	 *            参考文献番号
	 */
	public void setBibliographyNo(int bibliographyNo) {
		this.bibliographyNo = bibliographyNo;
	}

	/**
	 * 文献名を取得する
	 * 
	 * @return 文献名
	 */
	public String getBibliographyName() {
		return bibliographyName;
	}

	/**
	 * 文献名を設定する
	 * 
	 * @param bibliographyName
	 *            文献名
	 */
	public void setBibliographyName(String bibliographyName) {
		this.bibliographyName = bibliographyName;
	}

	/**
	 * 出版社を取得する
	 * 
	 * @return 出版社
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * 出版社を設定する
	 * 
	 * @param publisher
	 *            出版社
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
