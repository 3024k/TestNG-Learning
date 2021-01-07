package onTestFailedTakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//http://www.appliedselenium.com/2019/03/take-screenshot-of-failed-test-cases-using-selenium/

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","D:/45h1k/Learning/automation/TestNG-Learning/testngIntro/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
