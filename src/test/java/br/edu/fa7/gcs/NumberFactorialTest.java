package br.edu.fa7.gcs;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberFactorialTest {

	@Test
	public void testaFatorialDe2() {
		assertEquals(0, NumberFactorial.factorial(2));
	}

	@Test
	public void testaFatorialDe1() {
		assertEquals(1, NumberFactorial.factorial(1));
	}
	
	@Test
	public void testaFatorialDe5() {
		assertEquals(120, NumberFactorial.factorial(5));
	}
}
