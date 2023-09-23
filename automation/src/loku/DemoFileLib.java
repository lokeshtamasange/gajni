package loku;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

public class DemoFileLib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String data = FileLib.getExceldata("ambri",1,1);
		System.out.println(data);
		String pdata = FileLib.getPropertydata("Url");
		System.out.println(pdata);
	}

}
