package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows_Links {

	public static void main(String[] args) throws Exception {
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
			String title=driver.switchTo().window((String)w.get(i)).getTitle();
			List<WebElement> links=driver.switchTo().window((String)w.get(i)).findElements(By.tagName("a"));
			System.out.println("Title:"+title+" and links count:"+links.size());
			driver.switchTo().window((String)w.get(i)).close();
			Thread.sleep(2000);
		}

	}

}
