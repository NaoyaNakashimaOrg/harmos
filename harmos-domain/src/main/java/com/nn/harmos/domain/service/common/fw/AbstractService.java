package com.nn.harmos.domain.service.common.fw;

import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.exception.SystemException;

import com.nn.harmos.domain.model.common.fw.io.ServiceInput;
import com.nn.harmos.domain.model.common.fw.io.ServiceOutput;

/**
 * 業務ロジック基底クラス
 *
 * @author
 */
@Service
@Transactional
public abstract class AbstractService<I extends ServiceInput, O extends ServiceOutput> {

	/**
	 * 業務ロジック実行を実行する
	 *
	 * <p>
	 * 本メソッドはコントローラから呼び出される
	 * </p>
	 *
	 * @param input
	 * @return
	 */
	public O execute(I input) {

		O output = null;

		try {
			output = doExecute(input);

		} catch (BusinessException be) {
			throw be;

		} catch (DuplicateKeyException dke) {
			throw dke;

		} catch (CannotAcquireLockException cale) {
			throw cale;

		} catch (Exception e) {
			throw new SystemException(e.getMessage(), e);
		}

		return output;
	}

	/**
	 * イベント固有の業務ロジックを実行する
	 *
	 * <p>
	 * 業務ロジックは本メソッドを実装する
	 * </p>
	 *
	 * @param input
	 * @return
	 * @throws Exception
	 */
	protected abstract O doExecute(I input) throws Exception;

	/**
	 * プログラムID取得
	 *
	 * @param program
	 *            プログラム
	 * @return プログラムID
	 */
	protected String getProgramId() {
		return StringUtils.left(this.getClass().getSimpleName(), 50);
	}
}