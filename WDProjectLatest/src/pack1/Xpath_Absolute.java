package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Xpath_Absolute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		/*driver.get("http://rediff.com");
		driver.findElement(By.xpath("html/body/div/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("vijay");
		driver.findElement(By.xpath("html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("abcdef");*/
		
		
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("html/body/div/div[3]/div/div[2]/div/div/form/select")).sendKeys("Agent Lookup");
		driver.findElement(By.xpath("//select[@id='quick-link:jump-menu']")).sendKeys("Auto Quote");
		//driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div/input")).sendKeys("02135");
		driver.findElement(By.xpath("html/body/div/div[4]/form/fieldset/div[2]/input")).sendKeys("vijay@xyz.com");
		//driver.findElement(By.xpath("//*[@id='autoquote:e-mail']")).sendKeys("vijay@xyz.com");
		
		
		
		
	}

}
