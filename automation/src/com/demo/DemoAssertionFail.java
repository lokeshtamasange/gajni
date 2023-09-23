package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class DemoAssertionFail {
	public void VerifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Google";
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
	}	
}
//AssertEquals is a static variable present in Assert class
//if the comparison fails it will not execute the next statement.in order to execute the next student we go for a soft assert class