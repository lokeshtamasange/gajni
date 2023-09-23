package loku;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.remote.server.handler.GetElementText;

public class DemoCssSelector {
	

	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

			public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			text= driver.findElement(By.("//a[text()='Forgotten password?']"))
			 driver.navigate().back();
			 driver.findElement(By.cssSelector("//a[name='n1']")).click();
			 driver.navigate().back();
			 driver.findElement(By.cssSelector("//a[@href='https://www.jspiders.com']")).click();
			 
			}

}
