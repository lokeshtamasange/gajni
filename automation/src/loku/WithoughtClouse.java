package loku;

import org.openqa.selenium.chrome.ChromeDriver;

public class WithoughtClouse {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

			public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.quit();
			 

}
}
