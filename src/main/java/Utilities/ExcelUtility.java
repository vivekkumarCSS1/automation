package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private  XSSFWorkbook workbook;
	private XSSFSheet sheet;
	public ExcelUtility(String filePath,String sheetName) throws IOException {
		FileInputStream file=new FileInputStream(filePath);
		workbook=new XSSFWorkbook(file);
		System.out.print(workbook.getSheetName(0));
		sheet=workbook.getSheet(sheetName);
		if(sheet==null) {
			file.close();
		}
		
		
	}
	
	public String getcellData(int row ,int column) {
		
		  DataFormatter formatter = new DataFormatter();

	        return formatter.formatCellValue(
	                sheet.getRow(row).getCell(column));
		
	}

}
