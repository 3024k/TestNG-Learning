package testngException;
import org.testng.annotations.Test;

public class exceptionTest {
	@Test(expectedExceptions = ArithmeticException.class)
	public void divideByZeroExample1() {
		int e = 1/0;
	}
	@Test
	public void divideByZeroExample2() {
		int e = 1/0;
	}
}
