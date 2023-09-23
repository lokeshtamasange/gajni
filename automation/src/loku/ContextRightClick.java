package loku;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextRightClick {



	public static void main(String[] args) throws AWTException, InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demo.actitime.com/login.do");
     WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
     Actions a=new Actions(driver);
     a.contextClick(target).perform();
     Thread.sleep(1000);
     Robot r=new Robot();
     Thread.sleep(4000);
     r.keyPress(KeyEvent.VK_W);
     Thread.sleep(4000);
    WebElement h = driver.findElement(By.xpath("//li[@class='header__li header__li--parent']//span[text()='Features']"));
    String z = driver.getWindowHandle();
    Set<String> handle = driver.getWindowHandles();
    
    for(String s:handle)
    {
    	driver.switchTo().window(z);
    	boolean f = driver.findElement(By.xpath("//li[@class='header__li header__li--parent']//span[text()='Features']")).isDisplayed();
    	if(f==true)
    	{
    		driver.findElement(By.xpath("//li[@class='header__li header__li--parent']//span[text()='Features']")).click();
    	}

    	
    }
	}
}
