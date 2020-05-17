package io.github.aperture.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidatorBuilder {
	
	private static ValidatorBuilder SINGLETON;
	private boolean valid;
	private List<String> testsFailed;
	
	private ValidatorBuilder() {
		valid = true;
		testsFailed = new ArrayList<>();
	}
	
	public static ValidatorBuilder create() {
		SINGLETON = new ValidatorBuilder();
		return SINGLETON;
	}
	
	public static ValidatorBuilder getInstance() {
		return SINGLETON;
	}
	
	public ValidatorBuilder isNull(Object source) {
		if (!BasicValidator.isNull(source)) {
			valid = false;
			testsFailed.add("isNull");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isNotNull(Object source) {
		if (!BasicValidator.isNotNull(source)) {
			valid = false;
			testsFailed.add("isNotNull");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isType(Object source, Class<?> type) {
		if (!BasicValidator.isType(source, type)) {
			valid = false;
			testsFailed.add("isType");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isEqualToObject(Object source, Object reference) {
		if (!BasicValidator.isEqualTo(source, reference)) {
			valid = false;
			testsFailed.add("isEqualToObject");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isTrue(Boolean source) {
		if (!BasicValidator.isTrue(source)) {
			valid = false;
			testsFailed.add("isTrue");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isFalse(Boolean source) {
		if (!BasicValidator.isFalse(source)) {
			valid = false;
			testsFailed.add("isFalse");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isStringLength(String source, Integer length) {
		if (!BasicValidator.isStringLength(source, length)) {
			valid = false;
			testsFailed.add("isStringLength");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isStringLessThan(String source, Integer length) {
		if (!BasicValidator.isStringLessThan(source, length)) {
			valid = false;
			testsFailed.add("isStringLessThan");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isStringLongerThan(String source, Integer length) {
		if (!BasicValidator.isStringLongerThan(source, length)) {
			valid = false;
			testsFailed.add("isStringLongerThan");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isEqualToNumber(Number source, Number number) {
		if (!NumericValidator.isEqualTo(source, number)) {
			valid = false;
			testsFailed.add("isEqualToNumber");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isLessThan(Number source, Number number) {
		if (!NumericValidator.isLessThan(source, number)) {
			valid = false;
			testsFailed.add("isLessThan");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isGreaterThan(Number source, Number number) {
		if (!NumericValidator.isGreaterThan(source, number)) {
			valid = false;
			testsFailed.add("isGreaterThan");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isEmail(String source) {
		if (!PatternValidator.isEmail(source)) {
			valid = false;
			testsFailed.add("isEmail");
		}
		return SINGLETON;
	}
	
	public ValidatorBuilder isPhoneNumber(String source) {
		if (!PatternValidator.isPhoneNumber(source)) {
			valid = false;
			testsFailed.add("isPhoneNumber");
		}
		return SINGLETON;
	}
	
	public boolean isValid() {
		return SINGLETON.valid;
	}
	
	public List<String> getTestsFailed() {
		return SINGLETON.testsFailed;
	}

}
