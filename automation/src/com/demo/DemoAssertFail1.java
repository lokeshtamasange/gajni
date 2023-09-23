package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class DemoAssertFail1 {
	@Test
	public void VerifyTitle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "hoogle";//if test title is failed but result given that pass
		String aTitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		 s.assertEquals(eTitle, aTitle);
		 driver.get("https://demo.actitime.com/");
		 Thread.sleep(3000);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(3000);
		driver.close();
		s.assertAll();
	}	
}
