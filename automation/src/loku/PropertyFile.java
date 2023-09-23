package loku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class PropertyFile {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fs=new FileInputStream("‪./data/commondata.property");
		Properties p=new Properties();
String url = p.getProperty("url");
String un = p.getProperty("username");
String pw = p.getProperty("password");
System.out.println(url);
System.out.println(un);
System.out.println(pw);



	
		
	}

}
