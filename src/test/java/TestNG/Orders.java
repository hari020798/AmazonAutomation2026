package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class Orders {
	
	@BeforeSuite
	private void Method1() {
     System.out.println("BeforeSuite");
     
	}
	
	@BeforeTest
	private void Method2() {
	     System.out.println("BeforeMethod");


	}
	
	@BeforeClass
	private void Method3() {
	     System.out.println("BeforeClass");


	}
	
	@BeforeMethod
	private void Method4() {
	     System.out.println("BeforeMethod");


	}
	
	@Test
	private void TestMethod() {
		
		System.out.println("TestMethod1");

	}
	
	
	@Test
	private void TestMethod2() {
	     System.out.println("TestMethod2");


	}
	
	@AfterMethod
	private void Method5() {
	     System.out.println("AfterMethod");


	}
	
	@AfterClass
	private void Method6() {
	     System.out.println("AfterClass");


	}
	
	@AfterTest
	private void Method7() {
	     System.out.println("AfterTest");


	}
	
	@AfterSuite
	private void Method8() {
	     System.out.println("AfterSuite");


	}
	
	
	
}
