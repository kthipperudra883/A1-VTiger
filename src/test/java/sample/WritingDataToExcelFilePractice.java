package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
import genericUtility.IPathUtility;

public class WritingDataToExcelFilePractice {
	public static void main(String[] args) throws Exception, IOException {
//	FileInputStream fis = new FileInputStream(""D:\RudraXL.xlsx"");
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet sh = wb.getSheet("AnimaL");
//	Row row= sh.createRow(3);
//	Cell c =row.createCell(3);
//	c.setCellValue("lotus");
//	FileOutputStream fos = new FileOutputStream(""D:\RudraXL.xlsx");
//	wb.write(fos);
	
		ExcelUtility eUtil=new ExcelUtility();
		eUtil.writeDataToExcelFile("Leads", 10, 1,"hello");

	}


}
