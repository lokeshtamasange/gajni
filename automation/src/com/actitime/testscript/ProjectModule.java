package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass1;

public class ProjectModule extends BaseClass1{
	@Test(groups="SmokeTest")
	public void CreateProject(){
		Reporter.log("CreateProject",true);	
	}
	@Test(groups="RegressionTest")
	public void DeleteProject(){
		Reporter.log("DeleteProject",true);	
	}
	@Test(groups="RegressionTest")
	public void ModifyProject(){
		Reporter.log("ModifyProject",true);	
	}
	

}
