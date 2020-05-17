package io.github.aperture.validation.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.aperture.validation.NumericValidator;

public class NumericValidatorTest {

	private Number low;
	private Integer lowInteger;
	private Long lowLong;
	private Double lowDouble;
	private Float lowFloat;
	private BigDecimal lowBigDecimal;
	
	private Number source;
	private Integer sourceInteger;
	private Long sourceLong;
	private Double sourceDouble;
	private Float sourceFloat;
	private BigDecimal sourceBigDecimal;
	
	private Number high;
	private Integer highInteger;
	private Long highLong;
	private Double highDouble;
	private Float highFloat;
	private BigDecimal highBigDecimal;

	@Before
	public void setup() {
		@SuppressWarnings("unused")
		NumericValidator validator = new NumericValidator();

		low = 1;
		lowInteger = new Integer(1);
		lowLong = new Long(1);
		lowDouble = new Double(1);
		lowFloat = new Float(1);
		lowBigDecimal = new BigDecimal(1);

		source = 2;
		sourceInteger = new Integer(2);
		sourceLong = new Long(2);
		sourceDouble = new Double(2);
		sourceFloat = new Float(2);
		sourceBigDecimal = new BigDecimal(2);

		high = 3;
		highInteger = new Integer(3);
		highLong = new Long(3);
		highDouble = new Double(3);
		highFloat = new Float(3);
		highBigDecimal = new BigDecimal(3);
	}

	@Test
	public void isEqualTo_ReturnsTrue() {
		Assert.assertTrue(NumericValidator.isEqualTo(source, source));
		Assert.assertTrue(NumericValidator.isEqualToInteger(sourceInteger, sourceInteger));
		Assert.assertTrue(NumericValidator.isEqualToLong(sourceLong, sourceLong));
		Assert.assertTrue(NumericValidator.isEqualToDouble(sourceDouble, sourceDouble));
		Assert.assertTrue(NumericValidator.isEqualToFloat(sourceFloat, sourceFloat));
		Assert.assertTrue(NumericValidator.isEqualToBigDecimal(sourceBigDecimal, sourceBigDecimal));
	}

	@Test
	public void isEqualTo_ReturnsFalse() {
		Assert.assertFalse(NumericValidator.isEqualTo(source, low));
		Assert.assertFalse(NumericValidator.isEqualToInteger(sourceInteger, lowInteger));
		Assert.assertFalse(NumericValidator.isEqualToLong(sourceLong, lowLong));
		Assert.assertFalse(NumericValidator.isEqualToDouble(sourceDouble, lowDouble));
		Assert.assertFalse(NumericValidator.isEqualToFloat(sourceFloat, lowFloat));
		Assert.assertFalse(NumericValidator.isEqualToBigDecimal(sourceBigDecimal, lowBigDecimal));
	}

	@Test
	public void isEqualTo_Null_ReturnsFalse() {
		Assert.assertFalse(NumericValidator.isEqualTo(null, low));
		Assert.assertFalse(NumericValidator.isEqualTo(source, null));
		
		Assert.assertFalse(NumericValidator.isEqualToInteger(null, lowInteger));
		Assert.assertFalse(NumericValidator.isEqualToInteger(sourceInteger, null));
		
		Assert.assertFalse(NumericValidator.isEqualToLong(null, lowLong));
		Assert.assertFalse(NumericValidator.isEqualToLong(sourceLong, null));
		
		Assert.assertFalse(NumericValidator.isEqualToDouble(null, lowDouble));
		Assert.assertFalse(NumericValidator.isEqualToDouble(sourceDouble, null));
		
		Assert.assertFalse(NumericValidator.isEqualToFloat(null, lowFloat));
		Assert.assertFalse(NumericValidator.isEqualToFloat(sourceFloat, null));
		
		Assert.assertFalse(NumericValidator.isEqualToBigDecimal(null, lowBigDecimal));
		Assert.assertFalse(NumericValidator.isEqualToBigDecimal(sourceBigDecimal, null));
	}

	@Test
	public void isLessThan_ReturnsTrue() {
		Assert.assertTrue(NumericValidator.isLessThan(source, high));
		Assert.assertTrue(NumericValidator.isLessThanInteger(sourceInteger, highInteger));
		Assert.assertTrue(NumericValidator.isLessThanLong(sourceLong, highLong));
		Assert.assertTrue(NumericValidator.isLessThanDouble(sourceDouble, highDouble));
		Assert.assertTrue(NumericValidator.isLessThanFloat(sourceFloat, highFloat));
		Assert.assertTrue(NumericValidator.isLessThanBigDecimal(sourceBigDecimal, highBigDecimal));
	}

	@Test
	public void isLessThan_ReturnsFalse() {
		Assert.assertFalse(NumericValidator.isLessThan(source, low));
		Assert.assertFalse(NumericValidator.isLessThanInteger(sourceInteger, lowInteger));
		Assert.assertFalse(NumericValidator.isLessThanLong(sourceLong, lowLong));
		Assert.assertFalse(NumericValidator.isLessThanDouble(sourceDouble, lowDouble));
		Assert.assertFalse(NumericValidator.isLessThanFloat(sourceFloat, lowFloat));
		Assert.assertFalse(NumericValidator.isLessThanBigDecimal(sourceBigDecimal, lowBigDecimal));
	}

	@Test
	public void isLessThan_Null_ReturnsFalse() {
		Assert.assertFalse(NumericValidator.isLessThan(null, low));
		Assert.assertFalse(NumericValidator.isLessThan(source, null));
		
		Assert.assertFalse(NumericValidator.isLessThanInteger(null, lowInteger));
		Assert.assertFalse(NumericValidator.isLessThanInteger(sourceInteger, null));
		
		Assert.assertFalse(NumericValidator.isLessThanLong(null, lowLong));
		Assert.assertFalse(NumericValidator.isLessThanLong(sourceLong, null));
		
		Assert.assertFalse(NumericValidator.isLessThanDouble(null, lowDouble));
		Assert.assertFalse(NumericValidator.isLessThanDouble(sourceDouble, null));
		
		Assert.assertFalse(NumericValidator.isLessThanFloat(null, lowFloat));
		Assert.assertFalse(NumericValidator.isLessThanFloat(sourceFloat, null));
		
		Assert.assertFalse(NumericValidator.isLessThanBigDecimal(null, lowBigDecimal));
		Assert.assertFalse(NumericValidator.isLessThanBigDecimal(sourceBigDecimal, null));
	}

	@Test
	public void isGreaterThan_ReturnsTrue() {
		Assert.assertTrue(NumericValidator.isGreaterThan(source, low));
		Assert.assertTrue(NumericValidator.isGreaterThanInteger(sourceInteger, lowInteger));
		Assert.assertTrue(NumericValidator.isGreaterThanLong(sourceLong, lowLong));
		Assert.assertTrue(NumericValidator.isGreaterThanDouble(sourceDouble, lowDouble));
		Assert.assertTrue(NumericValidator.isGreaterThanFloat(sourceFloat, lowFloat));
		Assert.assertTrue(NumericValidator.isGreaterThanBigDecimal(sourceBigDecimal, lowBigDecimal));
	}

	@Test
	public void isGreaterThan_ReturnsFalse() {
		Assert.assertFalse(NumericValidator.isGreaterThan(source, high));
		Assert.assertFalse(NumericValidator.isGreaterThanInteger(sourceInteger, highInteger));
		Assert.assertFalse(NumericValidator.isGreaterThanLong(sourceLong, highLong));
		Assert.assertFalse(NumericValidator.isGreaterThanDouble(sourceDouble, highDouble));
		Assert.assertFalse(NumericValidator.isGreaterThanFloat(sourceFloat, highFloat));
		Assert.assertFalse(NumericValidator.isGreaterThanBigDecimal(sourceBigDecimal, highBigDecimal));
	}

	@Test
	public void isGreaterThan_Null_ReturnsFalse() {
		Assert.assertFalse(NumericValidator.isGreaterThan(null, high));
		Assert.assertFalse(NumericValidator.isGreaterThan(source, null));
		
		Assert.assertFalse(NumericValidator.isGreaterThanInteger(null, highInteger));
		Assert.assertFalse(NumericValidator.isGreaterThanInteger(sourceInteger, null));
		
		Assert.assertFalse(NumericValidator.isGreaterThanLong(null, highLong));
		Assert.assertFalse(NumericValidator.isGreaterThanLong(sourceLong, null));
		
		Assert.assertFalse(NumericValidator.isGreaterThanDouble(null, highDouble));
		Assert.assertFalse(NumericValidator.isGreaterThanDouble(sourceDouble, null));
		
		Assert.assertFalse(NumericValidator.isGreaterThanFloat(null, highFloat));
		Assert.assertFalse(NumericValidator.isGreaterThanFloat(sourceFloat, null));
		
		Assert.assertFalse(NumericValidator.isGreaterThanBigDecimal(null, highBigDecimal));
		Assert.assertFalse(NumericValidator.isGreaterThanBigDecimal(sourceBigDecimal, null));
	}
	
}
