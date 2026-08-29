package com.AmazonAutomation2026;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	
	    public static void main(String[] args) throws InterruptedException {
	    	
	    	
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://example.com");
	    	String windowHandle = driver.getWindowHandle();
	    	
	    	driver.switchTo().newWindow(WindowType.TAB);
	    	driver.get("https://flipkart.com");
	    	driver.switchTo().newWindow(WindowType.TAB);
	    	driver.get("https://Amazon.com");

	    	
	    	Set<String> windows = driver.getWindowHandles();
	    	
	    	for(String window : windows) {
	    		driver.switchTo().window(window);
	    		
	    		if(driver.getCurrentUrl().contains("flipkart")) {
	    		System.out.println("Chrome window found" + " " +  driver.getCurrentUrl());
	    		break;
	    		
	    	}

	    	

//	        WebDriver driver = new ChromeDriver();
//	        
//
//	        driver.get("https://example.com");
//
//	        // Current window handle
//	        String parentWindow = driver.getWindowHandle();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//            Thread.sleep(5000);
//	        // Open new tab/window
//	        driver.switchTo().newWindow(WindowType.TAB);
//	        driver.get("https://google.com");
//
//	        // Get all window handles
//	        Set<String> allWindows = driver.getWindowHandles();
//
//	        // Switch between windows
//	        for (String window : allWindows) {
//	            driver.switchTo().window(window);
//
//	            System.out.println("Title: " + driver.getTitle());
//
//	            if (driver.getTitle().contains("Google")) {
//	                System.out.println("Google window found");
//	            }
//	        }
//
//	        // Switch back to parent window
//	        driver.switchTo().window(parentWindow);
//
//	        System.out.println("Back to: " + driver.getTitle());
//
//	        driver.quit();
	    }
	    	driver.quit();

	}
}

