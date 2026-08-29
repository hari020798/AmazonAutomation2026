package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	private void Method1() {
     System.out.println("Priority1");
     
	}
	
	@Test(priority = 2, enabled = false)
	private void Method2() {
	     System.out.println("Priority2");


	}
	@Test(priority = -1)
	private void Method3() {
	     System.out.println("Priority3");


	}
	@Test(priority = 2, invocationCount = 4)
	private void Method4() {
	     System.out.println("Invocation Priority");


	}

}
