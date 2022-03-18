package id.ifundip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	@DisplayName("Test sayHello pola arrange-act-result.")
	public void testSayHello() {
		// Make a new instance
		// arrange
		Greeting greeting = new Greeting();
		// act
		String aktual = greeting.sayHello();
		// assert
		assertEquals("Hello", aktual);
	}
	
	@Test
	@DisplayName("Test sayHello sederhana")
	public void anotherTestSayHello() {
		assertEquals("Hello", new Greeting().sayHello());
	}

}
