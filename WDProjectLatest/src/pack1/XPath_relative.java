package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class XPath_relative {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		/*System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		driver.findElement(By.xpath("html/body/div/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("vijay");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("vj");
		driver.findElement(By.xpath("//input[@type='password' and starts-with(@name,'passwd')]")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@type='password' and starts-with(@name,'confirm_passwd')]")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).sendKeys("vj@xyz.com");
		driver.findElement(By.xpath("//*[@id='lbl_txt']")).click();
		List<WebElement> clist=driver.findElements(By.xpath("//*[@id='country_id']/ul//li"));
		for(int i=0;i<clist.size();i++)
		{
			String country=clist.get(i).getText();
			//System.out.println(country);
			if(country.equals("Iraq (+964)"))
			{
				clist.get(i).click();	
			}
		}
		/*for (WebElement c : clist) {
			if(c.getText().equals("Iraq (+964)"))
			{
				c.click();
			}
		}*/
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")).sendKeys("19");
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")).sendKeys("JUL");
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")).sendKeys("2009");
		driver.findElement(By.xpath("//*[@type='radio' and contains(@name,'gender') and @value='f']")).click();
		driver.findElement(By.xpath("//select[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//select[starts-with(@name,'city')]")).sendKeys("Agra");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id='Register']")).click();
	}
}
