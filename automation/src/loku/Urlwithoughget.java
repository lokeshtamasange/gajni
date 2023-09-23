package loku;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import lokesh.UrlNavigater;

public class Urlwithoughget {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

			public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("https://www.google.com/");
			 Thread.sleep(2000);
			 driver.navigate().to("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&ifkv=AeDOFXj2p2aG5WdGQShOl7IJT3_imQMnTDRPJKO9IDidB18yDrpt7ST63bOHsvXZ__fMheBKe3zgeA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			 Thread.sleep(2000);
			 driver.navigate().back();
			 Thread.sleep(2000);
			 driver.navigate().forward();
			 Thread.sleep(2000);
			 driver.navigate().refresh();
			 Thread.sleep(2000);
			 driver.close();

			}
}
