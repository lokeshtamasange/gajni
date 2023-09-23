package HandlingPopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/APPLESDD/Desktop/resume.html");
		Thread.sleep(3000);
		File f = new File("C:\\Users\\APPLESDD\\Desktop\\resume.docx");
		String abspath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abspath);
       

	}

}
