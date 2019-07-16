package pack1;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel {

	public static void main(String[] args) throws Exception{
		//importing FileInputStream to identify location of excel 
		FileInputStream f=new FileInputStream("‪D:\\selenium\\WD\\DDT\\Jersey.xls");
		//opening identified workbook
		Workbook wb=Workbook.getWorkbook(f);
		//open sheet in opened workbook
		Sheet s=wb.getSheet("Sheet1");
		//identify cell in the sheet and read the data from the cell
		System.out.println(s.getCell(0, 0).getContents());
	
	}

}
