package TestNG;

import org.testng.annotations.Test;

public class Priority2 {
	
	@Test(priority = 1)
	private void Method1() {
     System.out.println("Priority1");
     
	}
	
	@Test(priority = 2)
	private void Method2() {
	     System.out.println("Priority2");


	}
	@Test(priority = -1)
	private void Method3() {
	     System.out.println("Priority3");


	}
	@Test(priority = 2)
	private void Method4() {
	     System.out.println("Priority4");


	}

}
