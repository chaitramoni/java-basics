package com.xworkz.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.entity.PersonalInfo;

public class ExcelToDatabase {
	
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] HEADERs = {"Id","FirstName","Lastname","Country","Telephone"};
	static String SHEET = "chaitra";
	
	public static boolean forExcelFormat(MultipartFile multi) {
		
		if(!TYPE.equals(multi.getContentType())) {
			return false;
			}
		return true;
		}
	
	
	public static List<PersonalInfo> excelToDatabase(InputStream stream) throws IOException{
		
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sh = book.getSheet(SHEET);
		
		Iterator<Row> ro = sh.iterator();
		
		List<PersonalInfo> pf = new ArrayList<PersonalInfo>();
		
		int rowNumber = 0;
		while(ro.hasNext()) {
			Row current = ro.next();
			
			
			if(rowNumber == 0) {
				rowNumber++;
				continue;
				
			}
			
			Iterator<Cell> cells = current.iterator();
			
			PersonalInfo personal = new PersonalInfo();
			
			int cellIdx = 0;
			while(cells.hasNext()) {
				Cell currentCell = cells.next();
				
				
				switch(cellIdx) {
				case 0:
					personal.setId((int) currentCell.getNumericCellValue());
					break;
					
					
				case 1:
					personal.setFirstName(currentCell.getStringCellValue());
					break;
					
				case 2:
					personal.setLastname(currentCell.getStringCellValue());
					break;
					
				case 3:
					personal.setCountry(currentCell.getStringCellValue());
					break;
				
				case 4:
					personal.setNumber((long)currentCell.getNumericCellValue());
					break;
					
					default:
					break;
					
					
				}
				
				cellIdx++;
				
				pf.add(personal);
				
			}
			
			book.close();	
			
		}
		return pf;	
		
	}
}


