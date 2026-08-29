package TestNG;

import org.testng.annotations.Test;

public class groups {
	
	@Test(priority = 1 , groups = {"Smoke"})
	private void Method1() {
     System.out.println("SmokeGroup");
     
	}
	
	@Test(priority = 2,  groups = {"Regression"})
	private void Method2() {
	     System.out.println("Regression group");


	}
	@Test(priority = -1, groups = {"Smoke"})
	private void Method3() {
	     System.out.println("Smokegroup2");


	}
	@Test(priority = 2, groups = {"Sanity"})
	private void Method4() {
	     System.out.println("SanityGroup1");


	}
	
	@Test(priority = 2, groups = {"Sanity"})
	private void Method5() {
	     System.out.println("SanityGroup1");


	}
	

}
