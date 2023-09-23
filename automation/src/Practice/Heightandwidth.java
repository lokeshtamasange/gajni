package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heightandwidth {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   WebElement login = driver.findElement(By.name("login"));
		   int x = login.getSize().getHeight();
		   int y = login.getSize().getWidth();
		   System.out.println("Heght= "+x);
		   System.out.println("width= "+y);

	}

}
