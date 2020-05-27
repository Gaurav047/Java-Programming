package com.gaurav.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.jupiter.api.Test;
class GreetingimplTest {

	@Before
	public void setup() {
		Greeting greeting = new Greetingimpl();
	}
	
	@Test
	void greetShouldreturnAValidOutput() {
		Greeting greeting = new Greetingimpl();
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsNull() {
		Greeting greeting = new Greetingimpl();
		greeting.greet(null);
	}

}
