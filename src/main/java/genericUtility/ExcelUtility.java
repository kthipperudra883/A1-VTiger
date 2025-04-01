package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic method to fetch a cell data from excel file
 * @param sheetName
 * @param startRowIndex
 * @param startCellIndex
 * @return
 */
public class ExcelUtility {
	public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathUtility.exelPath);
	    Workbook wb= WorkbookFactory.create(fis);
	    Sheet sh=wb.getSheet(sheetName);
	    Row r=sh.getRow(rowIndex);
	    Cell c=r.getCell(cellIndex);
	    DataFormatter df=new DataFormatter();
	    String value=df.formatCellValue(c);
	    return value;
	}

/**
 * This is a generic method to fetch multiple data from excel file
 * @param sheetName
 * @param startRowIndex
 * @param startCellIndex
 * @return
 * @throws Exception 
 * @throws Exception
 */
public List<String> getMultipleDataFromExcelFile(String sheetName, int startRowIndex, int startCellIndex) throws Exception
{
	FileInputStream fis=new FileInputStream("D:\\RudraXL.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	DataFormatter df=new DataFormatter();
	List<String> a1=new ArrayList<String>();
	for(int i= startRowIndex; i<=sh.getLastRowNum();i++);
	{
		Row r = sh.getRow(startRowIndex);
		for(int j=startCellIndex;j<r.getLastCellNum();j++);
		{
			Cell c = r.getCell(startCellIndex);
			String value = df.formatCellValue(c);
			a1.add(value);
		}
		
	}
	return a1;
}
/**
 * This is generic method to write data to excel file from the script
 * @param sheetName
 * @param rowIndex
 * @param cellIndex
 * @param value
 * @throws IOException 
 * @throws EncryptedDocumentException 
 */
public void writeDataToExcelFile(String sheetName, int rowIndex,  int cellIndex, String value) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(IPathUtility.exelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row= sh.createRow(rowIndex);
	Cell c =row.createCell(cellIndex);
	c.setCellValue("lotus");
	FileOutputStream fos = new FileOutputStream(IPathUtility.exelPath);
	wb.write(fos);
	
}
}
	





