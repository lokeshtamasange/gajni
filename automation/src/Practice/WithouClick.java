package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithouClick {

	public static void main(String[] args) {
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.id("email")).sendKeys("7829728105");
		   driver.findElement(By.id("pass")).sendKeys("Lokesh@123");
		   driver.findElement(By.name("login")).submit();

	}

}
