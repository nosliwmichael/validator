package io.github.aperture.validation;

import java.util.regex.Pattern;

public class PatternValidator {
	
	public static boolean isEmail(String source) {
		if (BasicValidator.isNotNull(source)) {
			return Pattern
					.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
					.matcher(source)
					.find();
		} else {
			return false;
		}
	}

	public static boolean isPhoneNumber(String source) {
		if (BasicValidator.isNotNull(source)) {
			return Pattern
					.compile("^(\\+[0-9]{1,3}-)?\\(?[0-9]{3}\\)?\\-?\\(?[0-9]{3}\\)?\\-?\\(?[0-9]{4}\\)?$")
					.matcher(source)
					.find();
		} else {
			return false;
		}
	}

}
