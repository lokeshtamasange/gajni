package HandlingPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopUp {
	static{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}


	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
	driver.get("https://www.selenium.dev/");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_2);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
     
     
	

	

	


	
	

	
	



	

	
	
		
		

	}

}
