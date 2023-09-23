package com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@BeforeMethod
	public void Login() {
		Reporter.log("Login",true);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void CloseBroser() {
		Reporter.log("CloseBroser",true);
		driver.close();
	}
	@Test
	public void Demo() {
		
	}

}
//incomplete
