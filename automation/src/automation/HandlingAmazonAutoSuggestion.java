package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAmazonAutoSuggestion {
		static{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			Thread.sleep(5000);
		


		}

}
		
