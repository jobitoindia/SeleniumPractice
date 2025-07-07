package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	
	public void writeToExcel(String sheetName) throws IOException {
		File fl=new File("E:\\AdminUSers.xlsx");
		
		FileInputStream fis=new FileInputStream(fl); // this is wrokbook
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet(sheetName);
		
		int rowCount=sh.getLastRowNum();
		Row rw=sh.getRow(0);
		Cell cll=rw.createCell(2);
		cll.setCellValue("instituteName");
		
		for(int i=1;i<=rowCount;i++) { 
			Row rww=sh.getRow(i);    // accessing individual rows
			Cell cl=rww.createCell(2);
			cl.setCellValue("jobitoindia");
		}
		
		FileOutputStream fos=new FileOutputStream(fl);
		wb.write(fos);
		wb.close();
	}
	
	
	public void readExcel(String sheetName) throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\AdminUSers.xlsx"); // this is wrokbook
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sh=wb.getSheet(sheetName);    // this is specific sheet we are poinitn
		
		int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();	  // count of number of rows in sheet
		
		for(int i=1;i<=rowCount;i++) { 
			
			Row rw=sh.getRow(i);    // accessing individual rows
			
			for(int j=0;j<rw.getLastCellNum();j++) {     
				System.out.print(rw.getCell(j).getStringCellValue()+ " "); // accessing the ind columns
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDemo ed=new ExcelDemo();
//		ed.readExcel("Sheet1");
		
		ed.writeToExcel("Sheet1");
	}

}
