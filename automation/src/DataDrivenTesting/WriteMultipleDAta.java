package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleDAta {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		ArrayList<String> list=new ArrayList<>();
		list.add("Lokesh");
		list.add("Tamasange");
		list.add("pooja");
		list.add("gouda");
		int count=list.size();
		int j=1;
        for(int i=0;i<count;i++)
         {
			
	
		wb.getSheet("01").getRow(0).getCell(i).setCellValue(list.get(i));
		FileOutputStream fos=new FileOutputStream("./data/TestScript.xlsx");
		wb.write(fos);

		}


		
	}
}

