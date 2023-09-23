package lokesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlNavigater {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Boolean sel= driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).isSelected();
		
				if(sel==true)
				{
					System.out.println("check box is present in actitime is ");
				}
				else
				{
					System.out.println("check box is not presnent in actitime is");
				}
	}
				
		
	}

}
