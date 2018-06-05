package com.nn.harmos.domain.service.common.account;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.repository.common.AccountRepository;

/**
 * AccountSharedServiceの実装クラス <BR>
 * 
 * @author nakashima
 *
 */
@Service
public class AccountSharedServiceImpl implements AccountSharedService {

	@Inject
	AccountRepository accountRepository;

	@Transactional(readOnly = true)
	@Override
	public UserAccount findOne(String userCd) {

		// ユーザコードに一致するUserAccountオブジェクトを1件取得する
		UserAccount userAccount = accountRepository.findOne(userCd);

		// ユーザコードに一致するUserAccountが存在しない場合、共通ライブラリから提供しているResourceNotFoudExceptionをスローする
		if (userAccount == null) {
			throw new ResourceNotFoundException("該当のユーザが見つかりません（ ユーザコード：" + userCd + " ）");
		}

		return userAccount;
	}
}
