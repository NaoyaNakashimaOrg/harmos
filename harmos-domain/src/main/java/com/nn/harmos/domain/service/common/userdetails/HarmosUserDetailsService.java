package com.nn.harmos.domain.service.common.userdetails;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

import com.nn.harmos.domain.model.common.UserAccount;
import com.nn.harmos.domain.service.common.account.AccountSharedService;

/**
 * org.springframework.security.core.userdetails.UserDetailsServiceインタフェースを実装する。
 * 
 * @author nakashima
 *
 */
@Service
public class HarmosUserDetailsService implements UserDetailsService {

	@Inject
	AccountSharedService accountSharedService;

	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String userCd) throws UsernameNotFoundException {

		try {

			// userCdからUserAccountオブジェクトを取得する処理をAccountSharedServiceに委譲する。
			UserAccount userAccount = accountSharedService.findOne(userCd);
			// 取得したAccountオブジェクトを使用して、本プロジェクト用のUserDetailsオブジェクトを作成し、
			// メソッドの返り値として返却する。
			return new HarmosUserDetails(userAccount);

		} catch (ResourceNotFoundException e) {
			// 対象のユーザーが見つからない場合は、UsernameNotFoundExceptionがスローする。
			throw new UsernameNotFoundException("該当のユーザが見つかりません（ ユーザコード：" + userCd + " ）", e);
		}
	}
}
