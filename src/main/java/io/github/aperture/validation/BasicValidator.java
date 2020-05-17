package io.github.aperture.validation;

public class BasicValidator {
	
	public static boolean isNull(Object source) {
		return source == null;
	}
	
	public static boolean isNotNull(Object source) {
		return source != null;
	}

	public static boolean isType(Object source, Class<?> type) {
		return source.getClass() == type;
	}
	
	public static boolean isEqualTo(Object source, Object reference) {
		return source.equals(reference);
	}
	
	public static boolean isTrue(Boolean source) {
		if (isNotNull(source)) {
			return (source) ? true : false;
		} else {
			return false;
		}
	}
	
	public static boolean isFalse(Boolean source) {
		if (isNotNull(source)) {
			return (!source) ? true : false;
		} else {
			return false;
		}
	}
	
	public static boolean isStringLength(String source, Integer length) {
		if (isNotNull(source) && isNotNull(length)) {
			return source.toString().length() == length;
		} else {
			return false;
		}
	}
	
	public static boolean isStringLessThan(String source, Integer length) {
		if (isNotNull(source) && isNotNull(length)) {
			return source.toString().length() < length;
		} else {
			return false;
		}
	}
	
	public static boolean isStringLongerThan(String source, Integer length) {
		if (isNotNull(source) && isNotNull(length)) {
			return source.toString().length() > length;
		} else {
			return false;
		}
	}
	
}
