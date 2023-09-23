package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
		Set<String> allwh = driver.getWindowHandles();//To Handle all windows
          int count = allwh.size();//To get the size of Tabs
          System.out.println(count);//To Print How many Tabs are present
          for(String wh:allwh)
          {
        	  System.out.println(wh);
        	 // driver.close();To close all windows without using quit
        	 
          }
        //  driver.quit();To close all windows
          driver.close();//To close parent window
          
	}
}
