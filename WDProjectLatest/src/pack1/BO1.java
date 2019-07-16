package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BO1 {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		/*System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form:signup")).click();
		driver.findElement(By.id("signup:fname")).sendKeys("vijay");
		driver.findElement(By.id("BirthDate")).sendKeys("20/06/2011");
		driver.findElement(By.id("signup:state")).sendKeys("Arizona");
		driver.findElement(By.id("signup:signup")).click();		
	}
}