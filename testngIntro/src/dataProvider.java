//DataProvider in TestNG

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	@Test(dataProvider = "getData")
	public void setData(String userName, String password) {
		System.out.println("Provided user name is: "+userName);
		System.out.println("Provided password is: "+password);
	}
	
	@DataProvider
	
	public Object[][] getData(){
		Object data[][] = new Object[3][2];
		
		data[0][0] = "userName1";
		data[0][1] = "password1";
		
		data[1][0] = "userName2";
		data[1][1] = "password2";
		
		data[2][0] = "userName3";
		data[2][1] = "password3";
		
		return data;
		
	}
	
}
