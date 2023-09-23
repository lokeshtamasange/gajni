package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet("01").getLastRowNum();
		for(int i=1;i<count;i++)
		{
 String un = wb.getSheet("01").getRow(i).getCell(1).getStringCellValue();
 String pw = wb.getSheet("01").getRow(i).getCell(2).getStringCellValue();
 System.out.println(un+" "+pw);
		}
 
	}

}

