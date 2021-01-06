package parallelExecutionOfTestMethods;
import org.testng.annotations.Test;


public class parallelWithTestNG {

	@Test
	public void testCaseOne() {
		System.out.println("Test case 1 with thread ID: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCaseTwo() {
		System.out.println("Test case 2 with thread ID: "+ Thread.currentThread().getId());
	}
}
