import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelWrite {

	public static void main(String[] args) throws IOException, WriteException {
		// TODO Auto-generated method stub
		
		writeExcel();

	}
	
	public static void writeExcel() throws IOException, WriteException{
		FileOutputStream fs = 
				new FileOutputStream("/Users/ZhengfeiRui/Desktop/QADownloads/SQL/fillInData.xls");//create a xls file for the later on writing
		WritableWorkbook wb = Workbook.createWorkbook(fs);//Create 1 Writable Workbook
		
		wb.createSheet("S1",0);//sheetName+position#, first sheet
		WritableSheet wa = wb.createSheet("S2",1);//extend the sheet by WritableSheet
		WritableSheet ws = wb.createSheet("S3",2);
		
		
		wa.addCell(new Label(0,0,"Ecalix"));//colon,row
		wa.addCell(new Label(0,1,"Selenium"));
		wa.addCell(new Label(0,2,"Sql"));
		wa.addCell(new Label(1,0,"Ecalix1"));
		wa.addCell(new Label(1,1,"Selenium1"));
		wa.addCell(new Label(1,2,"Sql1"));
				
		ws.addCell(new Label(0,0,"UserName"));
		ws.addCell(new Label(1,0,"UserName1"));
		ws.addCell(new Label(0,1,"QTP"));
		ws.addCell(new Label(1,1,"QTP1"));
		ws.addCell(new Label(0,2,"Testing"));
		ws.addCell(new Label(1,2,"Testing1"));
		
		wb.write();
		wb.close();

		
		
	}
	
	

}
