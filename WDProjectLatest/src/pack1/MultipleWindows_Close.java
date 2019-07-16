package pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows_Close {

	public static void main(String[] args) throws Exception {
		/*System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("terms-link")).click();
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();
		ArrayList w=new ArrayList(driver.getWindowHandles());
		System.out.println("Number of Windows:"+w.size());
		int i;
		for(i=0;i<w.size();i++)
		{
			driver.switchTo().window((String)w.get(i)).close();
			Thread.sleep(2000);
		}
	}

}
