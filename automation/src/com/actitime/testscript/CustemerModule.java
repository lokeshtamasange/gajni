package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.generic.BAseClass;
import com.actitime.generic.BaseClass1;

public class CustemerModule extends BaseClass1 {
	
	@Test(groups="SmokeTest")
	public void CreateCustemer(){
		Reporter.log("CreateCustemer",true);	
	}
	@Test(groups="RegressionTest")
	public void DeleteCustemer(){
		Reporter.log("DeleteCustemer",true);	
	}
	@Test(groups="RegressionTest")
	public void ModifyCustemer(){
		Reporter.log("ModifyCustemer",true);	
	}
	

}
