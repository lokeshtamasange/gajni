package automation;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandDragAndDrop {

public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement src = driver.findElement(By.xpath("//h1[text()='Block 3']"));
	WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Actions a = new Actions(driver);
	a.dragAndDrop(src, target).perform();
	}
}
