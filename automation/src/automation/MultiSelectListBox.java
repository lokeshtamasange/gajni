package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
  static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/APPLESDD/Desktop/hotel.html");
		WebElement MultiListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(MultiListBox);
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("v");
		Thread.sleep(2000);
		s.selectByVisibleText("dosa");
		Thread.sleep(2000);
		//s.deselectByIndex(1);
		//Thread.sleep(2000);                           
		//s.deselectByValue("i");
		//Thread.sleep(2000);
    	//s.deselectByVisibleText("vada");
		//Thread.sleep(2000);
    	//System.out.println(s.isMultiple());
			
		
	}

}
