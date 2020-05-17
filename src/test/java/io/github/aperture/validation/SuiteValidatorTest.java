package io.github.aperture.validation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.github.aperture.validation.test.BasicValidatorTest;
import io.github.aperture.validation.test.NumericValidatorTest;
import io.github.aperture.validation.test.PatternValidatorTest;
import io.github.aperture.validation.test.ValidatorBuilderTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BasicValidatorTest.class,
	NumericValidatorTest.class,
	PatternValidatorTest.class,
	ValidatorBuilderTest.class
})
public class SuiteValidatorTest {

}
