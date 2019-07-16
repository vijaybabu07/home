package pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Excel_columns {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> f=driver.findElements(By.tagName("frame"));
		System.out.println("No of Frames:"+f.size());
		
		FileOutputStream fo = new FileOutputStream(
				"D:\\selenium\\WD\\Work\\WDProjectLatest\\src\\OP3.xls");
		WritableWorkbook wb = Workbook.createWorkbook(fo);
		WritableSheet ws = wb.createSheet("Links", 1);
		
		int i,j,r,c;
		for(i=0;i<f.size();i++)
		{
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println("No of links in frame "+(i+1)+" : "+links.size());
			for(c=0;c<f.size();c++)
			{
			for(r=0;r<links.size();r++)
			{
				String lname=links.get(r).getText();
				System.out.println(lname);
				Label l=new Label(c, r, lname);
				ws.addCell(l);
			}
			}
			System.out.println("==============================================");
			driver.switchTo().parentFrame();
		}
		wb.write();
		wb.close();
		

	}

}
