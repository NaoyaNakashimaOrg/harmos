package com.nn.harmos.domain.model.common.fw.io;

import java.io.Serializable;

import org.terasoluna.gfw.common.message.ResultMessages;

/**
 * 
 * サービス出力基底クラス
 * 
 * @author nakashima
 *
 */
public abstract class ServiceOutput implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -458805352175023908L;

	/**
	 * メッセージ
	 */
	private ResultMessages resultMessages;

	/**
	 * メッセージを取得する
	 * 
	 * @return メッセージ
	 */
	public ResultMessages getResultMessages() {
		return resultMessages;
	}

	/**
	 * メッセージを設定する
	 * 
	 * @param resultMessages
	 *            メッセージ
	 */
	public void setResultMessages(ResultMessages resultMessages) {
		this.resultMessages = resultMessages;
	}
}
