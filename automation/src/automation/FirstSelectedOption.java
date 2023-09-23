package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/APPLESDD/Desktop/hotel.html");
	WebElement slvlistbox = driver.findElement(By.id("slv"));
	Select s = new Select(slvlistbox);
	Thread.sleep(2000);
	WebElement fsoption = s.getFirstSelectedOption();
		  // 	 System.out.println(fsoption);
		  String text = fsoption.getText();
		  System.out.println(text);
		 driver.close();
	}

}



