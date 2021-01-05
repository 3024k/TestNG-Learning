package testNgLogging;
import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter{

	@Override
	public void onTestStart(ITestResult tr) {
		log("Test Started ...");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		log("Test '" + tr.getName() + "' PASSED");
		log(tr.getTestClass());
		log("Priority of this method: "+tr.getMethod().getPriority()+"...");
		
	}
	@Override
	public void onTestFailure(ITestResult tr) {
		log("Test '" + tr.getName() + "' FAILED");
		//System.out.println(tr.getTestClass());
		log("Priority of this method: "+tr.getMethod().getPriority()+"...");
	}
	@Override
	public void onTestSkipped(ITestResult tr) {
		log("Test" + tr.getName() + " SKIPPED");
	}	
	
	private void log(String methodName) {
		System.out.println(methodName);
	}
	public void log(IClass testClass) {
		System.out.println(testClass);
	}
	
}
