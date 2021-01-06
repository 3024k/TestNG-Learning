package parameterizationIntestNG;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class parameterizationTestNG {

	@Parameters({"browser"})
	@Test
	public void testCaseOne(String browser) {
		System.out.println("Browser passed as: "+ browser);
	}
	
	@Parameters({"username","password"})
	@Test
	public void testCaseTwo(String username, String password) {
		System.out.println("Username passed as: "+ username);
		System.out.println("Username passed as: "+ password);
		
	}
	
}
