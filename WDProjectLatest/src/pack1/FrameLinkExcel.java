package pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLinkExcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> link = driver.switchTo().frame("packageListFrame")
				.findElements(By.tagName("a"));
		System.out.println("No of Links:" + link.size());
		FileOutputStream fo = new FileOutputStream(
				"D:\\selenium\\WD\\Work\\WDProjectLatest\\src\\OP1.xls");
		WritableWorkbook wb = Workbook.createWorkbook(fo);
		WritableSheet ws = wb.createSheet("res", 1);
		int i, j, r;
		for (i = 0; i < link.size(); i++) {
			String lname = link.get(i).getText();
			if (lname.startsWith("a") == true || lname.startsWith("A") == true) {
				System.out.println(lname);
				Label l = new Label(0, i, lname);
				ws.addCell(l);
			}

		}
		wb.write();
		wb.close();

	}

}
