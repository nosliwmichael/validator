package io.github.aperture.validation;

import java.math.BigDecimal;

public class NumericValidator {
	
	public static boolean isEqualTo(Number source, Number number) {
		if (source instanceof Integer && number instanceof Integer) {
			return isEqualToInteger((int)source, (int)number);
		} else {
			return false;
		}
	}
	
	public static boolean isLessThan(Number source, Number number) {
		if (source instanceof Integer && number instanceof Integer) {
			return isLessThanInteger((int)source, (int)number);
		} else {
			return false;
		}
	}
	
	public static boolean isGreaterThan(Number source, Number number) {
		if (source instanceof Integer && number instanceof Integer) {
			return isGreaterThanInteger((int)source, (int)number);
		} else {
			return false;
		}
	}
	
	public static boolean isEqualToInteger(Integer source, Integer number) {
		if (BasicValidator.isNotNull(source)) {
			return source == number;
		} else {
			return false;
		}
	}

	public static boolean isLessThanInteger(Integer source, Integer number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source < number;
		} else {
			return false;
		}
	}

	public static boolean isGreaterThanInteger(Integer source, Integer number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source > number;
		} else {
			return false;
		}
	}
	
	public static boolean isEqualToLong(Long source, Long number) {
		if (BasicValidator.isNotNull(source)) {
			return source == number;
		} else {
			return false;
		}
	}

	public static boolean isLessThanLong(Long source, Long number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source < number;
		} else {
			return false;
		}
	}

	public static boolean isGreaterThanLong(Long source, Long number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source > number;
		} else {
			return false;
		}
	}
	
	public static boolean isEqualToDouble(Double source, Double number) {
		if (BasicValidator.isNotNull(source)) {
			return source == number;
		} else {
			return false;
		}
	}

	public static boolean isLessThanDouble(Double source, Double number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source < number;
		} else {
			return false;
		}
	}

	public static boolean isGreaterThanDouble(Double source, Double number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source > number;
		} else {
			return false;
		}
	}
	
	public static boolean isEqualToFloat(Float source, Float number) {
		if (BasicValidator.isNotNull(source)) {
			return source == number;
		} else {
			return false;
		}
	}

	public static boolean isLessThanFloat(Float source, Float number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source < number;
		} else {
			return false;
		}
	}

	public static boolean isGreaterThanFloat(Float source, Float number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source > number;
		} else {
			return false;
		}
	}
	
	public static boolean isEqualToBigDecimal(BigDecimal source, BigDecimal number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source.compareTo(number) == 0;
		} else {
			return false;
		}
	}

	public static boolean isLessThanBigDecimal(BigDecimal source, BigDecimal number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source.compareTo(number) < 0;
		} else {
			return false;
		}
	}

	public static boolean isGreaterThanBigDecimal(BigDecimal source, BigDecimal number) {
		if (BasicValidator.isNotNull(source) && BasicValidator.isNotNull(number)) {
			return source.compareTo(number) > 0;
		} else {
			return false;
		}
	}

}
