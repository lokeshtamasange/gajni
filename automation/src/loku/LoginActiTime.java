package loku;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTime {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

			public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://demo.actitime.com/login.do");
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
			 driver.findElement(By.xpath("(//div[text()='Login ']")).submit();
			}

}
