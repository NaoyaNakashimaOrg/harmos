package com.nn.harmos.domain.repository.common;

import com.nn.harmos.domain.model.common.UserAccount;

public interface AccountRepository {

	/**
	 * ユーザを1件取得する
	 * 
	 * @param userCd
	 *            ユーザコード
	 * @return
	 */
	UserAccount findOne(String userCd);
}
