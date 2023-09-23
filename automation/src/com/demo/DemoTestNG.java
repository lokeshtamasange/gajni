package com.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void demo()
	{
	Reporter.log("Hi");//it will print on the report
    Reporter.log("hello",true);//it will print on the report and console
	Reporter.log("Bye",false);//it will print on the report	
	
	}

}
