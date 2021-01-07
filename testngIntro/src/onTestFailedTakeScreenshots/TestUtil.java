package onTestFailedTakeScreenshots;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestUtil extends BaseClass{
	public static String screenshotpath;
	public static void captureScreenShot(String methodName) throws IOException{
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			screenshotpath = System.getProperty("user.dir")+"/screenshot/"
					+ methodName + "_" + year + "_" + date+ "_" + (month + 1) + "_" + day + "_" + min + "_" + sec + ".jpeg";
			FileHandler.copy(srcFile, new File(screenshotpath));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
