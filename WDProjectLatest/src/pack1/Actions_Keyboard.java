package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Keyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		/*System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.sendKeys(Keys.F5).build().perform();
		WebElement we=driver.findElement(By.xpath("//input[@id='email']"));
		a.contextClick(we).build().perform();
		for(int i=0;i<4;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
		//a.sendKeys(Keys.CONTROL+"t").build().perform();
		a.sendKeys(Keys.CONTROL+"n").build().perform();
	}

}
