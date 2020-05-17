package io.github.aperture.validation.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.aperture.validation.PatternValidator;

public class PatternValidatorTest {
	
	String validEmail;
	String invalidEmail;
	String validPhoneNumber;
	String invalidPhoneNumber;
	
	@Before
	public void setup() {
		@SuppressWarnings("unused")
		PatternValidator validator = new PatternValidator();
		validEmail = "valid@email.com";
		invalidEmail = "validemail.com";
		validPhoneNumber = "555-555-5555";
		invalidPhoneNumber = "5-555-555-5555";
	}

	@Test
	public void isEmail_ReturnsTrue() {
		Assert.assertTrue(PatternValidator.isEmail(validEmail));
	}

	@Test
	public void isEmail_ReturnsFalse() {
		Assert.assertFalse(PatternValidator.isEmail(invalidEmail));
	}

	@Test
	public void isEmail_Null_ReturnsFalse() {
		Assert.assertFalse(PatternValidator.isEmail(null));
	}

	@Test
	public void isPhoneNumber_ReturnsTrue() {
		Assert.assertTrue(PatternValidator.isPhoneNumber(validPhoneNumber));
	}

	@Test
	public void isPhoneNumber_ReturnsFalse() {
		Assert.assertFalse(PatternValidator.isPhoneNumber(invalidPhoneNumber));
	}

	@Test
	public void isPhoneNumber_Null_ReturnsFalse() {
		Assert.assertFalse(PatternValidator.isPhoneNumber(null));
	}
	
}
