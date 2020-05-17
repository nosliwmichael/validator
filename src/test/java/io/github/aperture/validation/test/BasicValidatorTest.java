package io.github.aperture.validation.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.aperture.validation.BasicValidator;

public class BasicValidatorTest {
	
	String source;
	
	@Before
	public void setup() {
		@SuppressWarnings("unused")
		BasicValidator validator = new BasicValidator();
		source = "Source string";
	}
	
	@Test
	public void isNull_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isNull(null));
	}
	
	@Test
	public void isNull_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isNull(source));
	}
	
	@Test
	public void isNotNull_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isNotNull(source));
	}
	
	@Test
	public void isNotNull_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isNotNull(null));
	}
	
	@Test
	public void isType_String_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isType(source, String.class));
	}
	
	@Test
	public void isType_Integer_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isType(source, Integer.class));
	}
	
	@Test
	public void isEqualTo_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isEqualTo(source, source));
	}
	
	@Test
	public void isEqualTo_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isEqualTo(source, null));
	}
	
	@Test
	public void isTrue_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isTrue(true));
	}
	
	@Test
	public void isTrue_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isTrue(false));
	}
	
	@Test
	public void isTrue_Null_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isTrue(null));
	}
	
	@Test
	public void isFalse_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isFalse(false));
	}
	
	@Test
	public void isFalse_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isFalse(true));
	}
	
	@Test
	public void isFalse_Null_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isFalse(null));
	}
	
	@Test
	public void isStringLength_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isStringLength(source, source.length()));
	}
	
	@Test
	public void isStringLength_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isStringLength(source, source.length() + 1));
	}
	
	@Test
	public void isStringLength_Null_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isStringLength(null, 1));
		Assert.assertFalse(BasicValidator.isStringLength(source, null));
	}
	
	@Test
	public void isStringLessThan_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isStringLessThan(source, source.length() + 1));
	}
	
	@Test
	public void isStringLessThan_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isStringLessThan(source, source.length() - 1));
	}
	
	@Test
	public void isStringLessThan_Null_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isStringLessThan(null, 1));
		Assert.assertFalse(BasicValidator.isStringLessThan(source, null));
	}
	
	@Test
	public void isStringLongerThan_ReturnsTrue() {
		Assert.assertTrue(BasicValidator.isStringLongerThan(source, source.length() - 1));
	}
	
	@Test
	public void isStringLongerThan_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isStringLongerThan(source, source.length() + 1));
	}
	
	@Test
	public void isStringLongerThan_Null_ReturnsFalse() {
		Assert.assertFalse(BasicValidator.isStringLongerThan(null, 1));
		Assert.assertFalse(BasicValidator.isStringLongerThan(source, null));
	}
	
}
