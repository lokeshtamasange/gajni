package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PracticeDisable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/APPLESDD/Desktop/DisabledElement.html");
		Thread.sleep(3000);
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver d=(RemoteWebDriver) driver;
		Thread.sleep(3000);
		d.executeScript("document.getElementById('d2').value='manaager'");
	}

}
