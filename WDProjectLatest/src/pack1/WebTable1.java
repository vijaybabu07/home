package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://money.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='energy']")).click();
		// to fetch the value from a table
		String val=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[3]/td[3]")).getText();
		System.out.println(val);  
		
		//to count the no of rows in a table
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
	}

}
