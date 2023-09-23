package com.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CostumerModule  {
	@Test(priority=3)
	public void CreateCostmer() {
		Reporter.log("CreateCostemer",true);
		
	}
	@Test
	public void ResgisterCostumer() {
		Reporter.log("ResgisterCostumer",true);
	}
	
	@Test
	public void ModifyCostmer() {
		Reporter.log("ModifyCostmer",true);
	}
	@Test(priority=1)
	public void DeleteCostemer() {
		Reporter.log("DeleteCostemer",true);
	
	}
	

}
//Result
//if we not give the priority it will execute in alphabetical order
//default value of priority is zero
//in order to execute method method multiple time we use invocation count
//in order to not execute the method we use invocation count=0 or enabled=false 
