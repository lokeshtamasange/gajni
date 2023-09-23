package loku;

import org.openqa.selenium.chrome.ChromeDriver;

public class urlNavigation {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

			public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://www.selenium.dev/");
			String url=driver.getCurrentUrl();
			if(url.equals("https://www.selenium.dev/")) {
				System.out.println("url navigate successfully and pass");}
			else	{
				System.out.println("url navigate is not successfully and fail");
			}

}
}
