package io.github.aperture.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidatorBuilder {
	
	private static ValidatorBuilder INSTANCE;
	private boolean valid;
	private List<String> testsFailed;
	
	private ValidatorBuilder() {
		valid = true;
		testsFailed = new ArrayList<>();
	}
	
	public static ValidatorBuilder create() {
		INSTANCE = new ValidatorBuilder();
		return INSTANCE;
	}
	
	public static ValidatorBuilder getInstance() {
		return INSTANCE;
	}
	
	public ValidatorBuilder isNull(Object source) {
		if (!BasicValidator.isNull(source)) {
			valid = false;
			testsFailed.add("isNull");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isNotNull(Object source) {
		if (!BasicValidator.isNotNull(source)) {
			valid = false;
			testsFailed.add("isNotNull");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isType(Object source, Class<?> type) {
		if (!BasicValidator.isType(source, type)) {
			valid = false;
			testsFailed.add("isType");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isEqualToObject(Object source, Object reference) {
		if (!BasicValidator.isEqualTo(source, reference)) {
			valid = false;
			testsFailed.add("isEqualToObject");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isTrue(Boolean source) {
		if (!BasicValidator.isTrue(source)) {
			valid = false;
			testsFailed.add("isTrue");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isFalse(Boolean source) {
		if (!BasicValidator.isFalse(source)) {
			valid = false;
			testsFailed.add("isFalse");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isStringLength(String source, Integer length) {
		if (!BasicValidator.isStringLength(source, length)) {
			valid = false;
			testsFailed.add("isStringLength");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isStringLessThan(String source, Integer length) {
		if (!BasicValidator.isStringLessThan(source, length)) {
			valid = false;
			testsFailed.add("isStringLessThan");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isStringLongerThan(String source, Integer length) {
		if (!BasicValidator.isStringLongerThan(source, length)) {
			valid = false;
			testsFailed.add("isStringLongerThan");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isEqualToNumber(Number source, Number number) {
		if (!NumericValidator.isEqualTo(source, number)) {
			valid = false;
			testsFailed.add("isEqualToNumber");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isLessThan(Number source, Number number) {
		if (!NumericValidator.isLessThan(source, number)) {
			valid = false;
			testsFailed.add("isLessThan");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isGreaterThan(Number source, Number number) {
		if (!NumericValidator.isGreaterThan(source, number)) {
			valid = false;
			testsFailed.add("isGreaterThan");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isEmail(String source) {
		if (!PatternValidator.isEmail(source)) {
			valid = false;
			testsFailed.add("isEmail");
		}
		return INSTANCE;
	}
	
	public ValidatorBuilder isPhoneNumber(String source) {
		if (!PatternValidator.isPhoneNumber(source)) {
			valid = false;
			testsFailed.add("isPhoneNumber");
		}
		return INSTANCE;
	}
	
	public boolean isValid() {
		return INSTANCE.valid;
	}
	
	public List<String> getTestsFailed() {
		return INSTANCE.testsFailed;
	}

}
