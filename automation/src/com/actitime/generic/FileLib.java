package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

public void getPropertyData() throws IOException {
	FileInputStream fis=new FileInputStream("./data/CommonData.Property");
	Properties p=new Properties();
	p.load(fis);
	System.out.println(p.getProperty("Url"));
	
}
	

}
