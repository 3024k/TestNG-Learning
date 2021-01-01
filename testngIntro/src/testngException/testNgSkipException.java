package testngException;
import org.testng.annotations.Test;
import org.testng.SkipException;

public class testNgSkipException {
	@Test(enabled=false)
	public void testCaseEnabling() {
		System.out.println("Not ready for execute");
	}
	@Test
	public void testCaseSkipException() {
		System.out.println("Inside test case skip exception");
		throw new SkipException("Skipping this exception");
	}
	@Test
	public void testCaseConditionalSkipException() {
		System.out.println("Im in Conditional Skip");
		if(1==2)
		throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}
}
