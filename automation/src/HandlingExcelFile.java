import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./data/bhure.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("A").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		wb.close();
	}

}
