package loku;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getfacebooktitle {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

			public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
			 if(logo==true) {
				 String logoprint = driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
				 System.out.println(logoprint);
				 System.out.println("logo is displayed and passed");
				 
			 }else {
				 System.out.println("logo is not displayed and result is failed");
			 }
			 driver.close();
			 }

}
