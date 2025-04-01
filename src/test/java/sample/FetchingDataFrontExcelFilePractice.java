package sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFrontExcelFilePractice {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\kthip\\OneDrive\\Desktop\\RudraXL.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Animal");
	Row r=sh.getRow(3);
	Cell c=r.getCell(3);
//	String value=c.getStringCellValue();
	DataFormatter df=new DataFormatter();
	String value=df.formatCellValue(c);
	System.out.println(value);

	}

	}
    

