package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFiles {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./driver/CommonData.property");
	Properties p=new Properties();
	p.load(fis);
	String Url = p.getProperty("Url");
	String Un = p.getProperty("Username");
	String pw = p.getProperty("Password");
	System.out.println(Url);
	System.out.println(Un);
	System.out.println(pw);
	
	
		
	}

}

