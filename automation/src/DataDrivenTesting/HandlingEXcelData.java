package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingEXcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
String data = wb.getSheet("01").getRow(2).getCell(2).getStringCellValue();
System.out.println(data);
	}

}
