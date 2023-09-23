package loku;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingFileExcelWritten {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/ambrish.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("ambri").getRow(1).getCell(2).setCellValue("Lokesh.Parshane");
	FileOutputStream fos=new FileOutputStream("./data/ambrish.xlsx");
	
	wb.write(fos);
	
		
		
	}

}
