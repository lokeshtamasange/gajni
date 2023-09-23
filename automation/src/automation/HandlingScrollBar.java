package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//n3[text()='Roadstar'][1]/../div/span[1]/span[1]/span[1]"));

	}

}
