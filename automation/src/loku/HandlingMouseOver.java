package loku;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseOver {
	 {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.vtiger.com/");
			WebElement target = driver.findElement(By.partialLinkText("Resources"));
			Actions a=new Actions(driver);
			a.moveToElement(target).perform();
			driver.findElement(By.partialLinkText("Contact Us")).click();
			WebElement data = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]"));
		String text = data.getText();
		System.out.println(text);
		
			driver.quit();

			
		}
}
