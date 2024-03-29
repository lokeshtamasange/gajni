package loku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicityWaitwait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleIs("//div[@id='container_tt']"));
	String tittle=driver.getTitle();
	System.out.println(tittle);
	
	

}
