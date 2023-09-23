package loku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.get(By.partialLinkText("//a[contains(text(),'Resources')]"));
	}

}
