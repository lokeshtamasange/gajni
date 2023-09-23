package loku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.ConnectionSpecSelector;

public class PrintFiretSelected {
	private static WebElement slvListbox;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/APPLESDD/Desktop/loku.html");
		WebElement slvListbox=driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		WebDriver slvListbox1=s.getFirstSelectedOption();
		

	}
}
