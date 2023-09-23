package HandlingPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUp1 {
	static{

	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
    driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("1234567");
    driver.findElement(By.xpath("//input[@id='dob']")).click();
  WebElement month = driver.findElement(By.id("selectMonth"));
  Select s = new Select(month);
  Thread.sleep(3000);
}
}


//To be continued

