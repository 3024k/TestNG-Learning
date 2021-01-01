package testNgPriority;
import org.testng.annotations.Test;

public class testCasePriority {
	@Test
	public void Registration() {
		System.out.println("Restration first ");
	}
	@Test(priority=2)
	public void Email() {
		System.out.println("Then check email for credentials");
	}
	
	@Test(priority=3)
	public void Login() {
		System.out.println("Then login using credentials");
	}
	
}
