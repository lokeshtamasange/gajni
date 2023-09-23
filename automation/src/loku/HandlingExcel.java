package loku;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/bhure.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("A").getRow(0).getCell(3).setCellValue("Sachin");
FileOutputStream fos=new FileOutputStream("./data/bhure.xlsx");
wb.write(fos);
wb.close();
	
}
}
