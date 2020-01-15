package org;

import org.NumberGame;
import org.junit.Assert;
import org.junit.Test;

public class NumberGameTest {

	@Test
	public void testNormalNumber() {
		Assert.assertEquals("1", new NumberGame(1).toString());
		Assert.assertEquals("2", new NumberGame(2).toString());
	}

	@Test
	public void testFizzNumber() {
		Assert.assertEquals("fizz", new NumberGame(3).toString());
		Assert.assertEquals("fizz", new NumberGame(13).toString());
	}

	@Test
	public void testBuzzNumber() {
		Assert.assertEquals("buzz", new NumberGame(5).toString());
		Assert.assertEquals("buzz", new NumberGame(52).toString());
	}

	@Test
	public void testFizzBuzzNumber() {
		Assert.assertEquals("fizzbuzz", new NumberGame(15).toString());
		Assert.assertEquals("fizzbuzz", new NumberGame(51).toString());
		Assert.assertEquals("fizzbuzz", new NumberGame(35).toString());
	}
}
