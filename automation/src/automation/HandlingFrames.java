package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/APPLESDD/Desktop/page1.html");
 driver.switchTo().frame(0);
 driver.findElement(By.id("t2")).sendKeys("jsp");
 driver.switchTo().parentFrame();
 driver.findElement(By.id("t1")).sendKeys("Qsp");



	}

}
