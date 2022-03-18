package id.ifundip.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CalculatorTest {

	private Calculator calculator;
	
	/* Membuat instance untuk setiap test */
	
	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	void testAddNumber() {
		int actual = calculator.addNumber(5, 7);
		int expected = 12;
		assertEquals(expected, actual);
	}

	@Test
	void testSubtractNumber() {
		assertEquals(-12, calculator.subtractNumber(10, 22));
	}
	
	@Test
	void testDivideNumber() {
		assertThrows(ArithmeticException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				calculator.divideNumber(10, 0);
			}
		});
	}
	
	@Test
	/* sama dengan sebelumnya tapi menggunakam lambda expression */
	void testDivideNumberNewVersion() {
		assertThrows(ArithmeticException.class, ()->{
			calculator.divideNumber(10, 0);
		});
	}

}
