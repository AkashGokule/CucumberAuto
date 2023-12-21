package qa.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {

static  String path ="C:\\Users\\agsat\\git\\test-automation\\src\\main\\java\\qa\\TestData\\testdata (1).xlsx";
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		for (int i=0;i<=4;i++) {
			for (int j=0;j<=1;j++) {
		String data1 = getExcelData("Sheet1",i,j);
		System.out.print(data1+ "   " );
			}
			System.out.println("");	
		}
	}
	
	
	
	public static String getExcelData(String sheetName, int rowNum, int colNum){
	    String retVal = null;
	    String path="C:\\Users\\agsat\\git\\test-automation\\src\\main\\java\\qa\\TestData\\testdata (1).xlsx";
	    try {
	        FileInputStream fis = new FileInputStream(path);
	        Workbook wb = WorkbookFactory.create(fis);
	        Sheet s = wb.getSheet(sheetName);
	        Row r = s.getRow(rowNum);
	        Cell c = r.getCell(colNum);
	        retVal=c.getStringCellValue();
	        
	    }
	    catch (FileNotFoundException e) {
	       
	        e.printStackTrace();
	    } 
	    catch (IOException e) {
	       
	        e.printStackTrace();
	    }
	    return retVal;
	}
	public void writeToExcel(String sheetName,int rowNum,int cellNum,String desc){
	    try {
	        FileInputStream fis = new FileInputStream(path);
	        Workbook wb = WorkbookFactory.create(fis);
	        Sheet s = wb.getSheet(sheetName);
	        Row r = s.getRow(rowNum);
	        Cell c = r.createCell(cellNum);
	        c.setCellValue(desc);
	        FileOutputStream fos = new FileOutputStream(path);
	        wb.write(fos);
	        fos.close();
	    } catch (FileNotFoundException e) {
	       
	        e.printStackTrace();
	    }  
	    catch (IOException e) {
	        
	        e.printStackTrace();
	    }
	}
}
