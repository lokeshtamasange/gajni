package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingProperty {


	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/CommonData.property");
         Properties p=new Properties();
         p.load(fis);
         String url = p.getProperty("Url");
         String un = p.getProperty("Username");
         String pw = p.getProperty("Password");
         System.out.println(url+"    "+un+"     "+pw);
		
	
		
        


	}

}
