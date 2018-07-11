package com.nn.harmos.domain.service.common.validator;

import java.lang.reflect.Array;

public class SizeValidatorForArraysOfChar {

	public static boolean isValid(char[] array, int min, int max) {
		if (array == null) {
			return true;
		}
		int length = Array.getLength(array);
		return length >= min && length <= max;
	}
}
