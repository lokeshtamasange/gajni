package loku;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingProperty {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

 }


	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/CommonData.property");
		Properties p=new Properties();
		p.load(fis);
	
		
		String url = p.getProperty("Url");
		String un = p.getProperty("Username");
		String pw = p.getProperty("Password");
		System.out.println(url);
		System.out.println(pw);
		System.out.println(un);
	}
}
