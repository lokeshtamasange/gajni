package com.demo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CostumerModule1 {
	@BeforeMethod
	public void Login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
	}
@Test
	public void CreateCostumer() {
		Reporter.log("CreateCostumer",true);
	}
	@Test
	public void DeleteCosumer() {
		Reporter.log("DeleteCosumer",true);
	}

}
