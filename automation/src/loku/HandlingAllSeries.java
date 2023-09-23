package loku;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.excelant.util.ExcelAntWorkbookUtilFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingAllSeries {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/bhure.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int count = wb.getSheet("A").getLastRowNum();
	for(int i=0;i<count;i++) {
		String un = wb.getSheet("A").getRow(i).getCell(0).getStringCellValue();
		String pw = wb.getSheet("A").getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+"    "+pw);
	}
}
}
