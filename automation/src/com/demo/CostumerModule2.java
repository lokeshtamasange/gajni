package com.demo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CostumerModule2 {
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("CloseBrowser",true);
	}

	@BeforeMethod
	public void Login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
		public void Logout() {
			Reporter.log("Logout",true);
		}
		@Test(priority=1,invocationCount=2)
		public void EditCostumer() {
			Reporter.log("EditCostumer",true);
		}
		@Test
		public void RegisterCostumer() {
			Reporter.log("RegisterCostumer",true);
		}
		@Test
		public void DeleteCostumer() {
			Reporter.log("DeleteCostumer",true);
		}
}
