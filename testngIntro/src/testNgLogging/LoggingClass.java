package testNgLogging;
import org.testng.annotations.Test;

public class LoggingClass {
	@Test(priority=0)
	public void methodAddingNumbers() {
		System.out.println("In adding numbers method");
	}
	@Test(priority=1)
	public void divideByZero() {
		System.out.println("In divide by zero method");
		int e = 1/0;
	}
	@Test(dependsOnMethods = {"divideByZero"})
	public void methodSkip() {
		System.out.println("In skip method...");
	}
}
