package com.nn.harmos.domain.service.common.account;

import com.nn.harmos.domain.model.common.UserAccount;

public interface AccountSharedService {

	/**
	 * ユーザ情報を1件取得する
	 * 
	 * @param userCd
	 *            ユーザコード
	 * @return
	 */
	UserAccount findOne(String userCd);
}
