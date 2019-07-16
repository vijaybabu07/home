package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		a.moveToElement(we).build().perform();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();
		

	}

}
