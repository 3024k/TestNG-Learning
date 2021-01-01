package testngXML2;
import org.testng.annotations.Test;

public class testNgGroup {
	
	@Test(groups="Regression")
	public void testCaseOne() {
		System.out.println("In test case one - and in Regression group");
	}
	
	@Test(groups="Regression")
	public void testCaseTwo() {
		System.out.println("In test case two - and in Regression group");
	}
	
	public void testCaseThree() {
		System.out.println("In test case three - and not in Regression group");
	}
}
