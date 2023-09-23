package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class withoutget {
static {
  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	 Thread.sleep(5000);
	 driver.navigate().to("www.gmail.com");
	 Thread.sleep(5000);
	 driver.close();
	}

}
