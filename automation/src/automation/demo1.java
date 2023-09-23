package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
String tittle=driver.getTitle();
System.out.println(tittle);
Thread.sleep(5000);
driver.close();


	}
	

}
