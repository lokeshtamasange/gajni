package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	@BeforeTest(groups={"SmokeTest","RegressionTest"})
	public void OpenBrowser() {
			Reporter.log("OpenBrowser",true);
			
	    }
		@BeforeMethod(groups={"SmokeTest","RegressionTest"})
		public void LogIn() {
			Reporter.log("LogIn",true);
			

		}
		@AfterMethod(groups={"SmokeTest","RegressionTest"})
		public void LogOut() {
			Reporter.log("LogOut",true);

		}

	@AfterTest(groups={"SmokeTest","RegressionTest"})
		public void CloseBrowser() {
		Reporter.log("CloseBrowser",true);

		}



}
