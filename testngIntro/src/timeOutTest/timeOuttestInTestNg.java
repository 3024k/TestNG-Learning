package timeOutTest;
import org.testng.annotations.Test;

public class timeOuttestInTestNg {
	@Test
	public void sampleTestCase() {
		System.out.println("Ready to exeute");
	}
	@Test(timeOut=1000)
	public void executetimeOut() throws InterruptedException{
		Thread.sleep(3000);
	}
}
