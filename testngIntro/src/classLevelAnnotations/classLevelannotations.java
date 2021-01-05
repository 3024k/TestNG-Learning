package classLevelAnnotations;
import org.testng.annotations.Test;

@Test
public class classLevelannotations {
	public void methodOne() {
		System.out.println("In method one \n ..........\n");
	}
	public void methodTwo() {
		System.out.println("In method two; this method will be failed  \n ..........\n");
		int e = 1/0;
	}
	@Test(dependsOnMethods= {"methodTwo"})
	public void methodThree() {
		System.out.println("In method three, this method will be skipped  \n ..........\n");
	}
	
}
