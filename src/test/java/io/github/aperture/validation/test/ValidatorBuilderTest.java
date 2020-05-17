package io.github.aperture.validation.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.aperture.validation.ValidatorBuilder;

public class ValidatorBuilderTest {
	
	String sourceString;
	Integer sourceInteger;
	
	String validEmail;
	String invalidEmail;
	
	String validPhoneNumber;
	String invalidPhoneNumber;
	
	
	@Before
	public void setup() {
		sourceString = "Source string";
		sourceInteger = new Integer(sourceString.length());
		
		validEmail = "valid@email.com";
		invalidEmail = "validemail.com";
		
		validPhoneNumber = "555-555-5555";
		invalidPhoneNumber = "5-555-555-5555";
	}
	
	@Test
	public void validatorBuilder_ReturnsTrue() {
		boolean valid = ValidatorBuilder.create()
				.isNull(null)
				.isNotNull(sourceString)
				.isType(sourceString, String.class)
				.isEqualToObject(sourceString, sourceString)
				.isTrue(true)
				.isFalse(false)
				.isStringLength(sourceString, sourceInteger)
				.isStringLessThan(sourceString, sourceInteger + 1)
				.isStringLongerThan(sourceString, sourceInteger - 1)
				.isEqualToNumber(sourceInteger, sourceInteger)
				.isLessThan(sourceInteger, sourceInteger + 1)
				.isGreaterThan(sourceInteger, sourceInteger - 1)
				.isEmail(validEmail)
				.isPhoneNumber(validPhoneNumber)
				.isValid();
		Assert.assertTrue(valid);
		Assert.assertEquals(0, ValidatorBuilder.getInstance().getTestsFailed().size());
	}
	
	@Test
	public void validatorBuilder_ReturnsFalse() {
		boolean valid = ValidatorBuilder.create()
				.isNull(sourceString)
				.isNotNull(null)
				.isType(sourceInteger, String.class)
				.isEqualToObject(sourceString, sourceInteger)
				.isTrue(false)
				.isFalse(true)
				.isStringLength(sourceString, sourceInteger + 1)
				.isStringLessThan(sourceString, sourceInteger)
				.isStringLongerThan(sourceString, sourceInteger)
				.isEqualToNumber(sourceInteger, sourceInteger + 1)
				.isLessThan(sourceInteger, sourceInteger)
				.isGreaterThan(sourceInteger, sourceInteger)
				.isEmail(invalidEmail)
				.isPhoneNumber(invalidPhoneNumber)
				.isValid();
		Assert.assertFalse(valid);
		Assert.assertEquals(14, ValidatorBuilder.getInstance().getTestsFailed().size());
	}

}
