package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.get("file:///C:/Users/APPLESDD/Desktop/page1.html");
  /* driver.findElement(By.id("t1")).sendKeys("a");
   Thread.sleep(2000);
   driver.switchTo().frame(0);
   driver.findElement(By.id("t2")).sendKeys("b");
   Thread.sleep(2000);
   driver.switchTo().parentFrame();
   driver.findElement(By.id("t1")).sendKeys("c");
   Thread.sleep(2000);
   driver.switchTo().frame(0);
   driver.findElement(By.id("t2")).sendKeys("d"); */
   // Taking string as a parameter
    driver.findElement(By.id("t1")).sendKeys("a");
    Thread.sleep(2000);
    driver.switchTo().frame(0);
    driver.findElement(By.id("t2")).sendKeys("b");
    Thread.sleep(2000);
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t1")).sendKeys("c");
    Thread.sleep(2000);
   //driver.close(); NosuchExpetion
    

    WebElement f = driver.findElement(By.xpath("//iframe"));
    driver.switchTo().frame(f);
    driver.findElement(By.id("t2")).sendKeys("d");



	}

}
