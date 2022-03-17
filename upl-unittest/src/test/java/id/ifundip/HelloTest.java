package id.ifundip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void test() {
		// Make a new instance
		Hello hello = new Hello();
		String aktual = hello.sayHello();
		assertEquals("Hello", aktual);
	}

}
