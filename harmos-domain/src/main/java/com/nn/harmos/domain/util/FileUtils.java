package com.nn.harmos.domain.util;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {

	/**
	 * 
	 * アップロードファイルが選択済かどうかをチェックする.
	 * 
	 * @param multipartFile
	 * @return
	 */
	public static boolean isValid(MultipartFile multipartFile) {
		return multipartFile != null && StringUtils.hasLength(multipartFile.getOriginalFilename());
	}
}
