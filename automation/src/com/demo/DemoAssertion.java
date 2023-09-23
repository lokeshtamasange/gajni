package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
@Test
	public void VerifyTitle() {
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	String eTitle = "Soogle";
	String aTitle = driver.getTitle();
	if(aTitle.equals(eTitle))
	{
		Reporter.log("Title is Matching and Pass",true);
		}
		
		else
		{
			Reporter.log("Title is Matching and fail",true);
		}
		driver.close();
			
	}
}
//if the elements are not matching If block doesn't have a capacity to fail the test method
//in order to fail the test case we assert equals statement 