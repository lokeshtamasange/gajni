package loku;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

			public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://www.google.com/");
			 String Tittle = driver.getTitle();
			 System.out.println(Tittle);
			 driver.close();
			}
			 

}
