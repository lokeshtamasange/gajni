package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass1;

public class TaskModule extends BaseClass1 {
	@Test(groups="SmokeTest")
	public void CreateTask(){
		Reporter.log("CreateTask",true);	
	}
	@Test(groups="RegressionTest")
	public void DeleteTask(){
		Reporter.log("DeleteTask",true);	
	}
	@Test(groups="RegressionTest")
	public void ModifyTask(){
		Reporter.log("ModifyTask",true);	
	}
	

}
