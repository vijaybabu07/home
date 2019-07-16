package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameslinks_LinkSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.switchTo().frame("packageListFrame").findElements(By.tagName("a"));
		int i,j;
		for(i=0;i<links.size();i++)
		{
			String lname=links.get(i).getText();
			System.out.println(lname);
			links.get(i).click();
			
			
			driver.switchTo().parentFrame();
			List<WebElement> l1=driver.switchTo().frame("packageFrame").findElements(By.tagName("a"));
			System.out.println(l1.size());
			driver.switchTo().parentFrame();
		}
	}

}
