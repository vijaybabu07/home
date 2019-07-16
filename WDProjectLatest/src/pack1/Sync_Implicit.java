package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sync_Implicit {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bharatmatrimony.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("REGISTERED_BY")).sendKeys("Son");
		WebElement reg=driver.findElement(By.id("REGISTERED_BY"));
		Thread.sleep(2500);
		Select s=new Select(reg);
		//s.selectByIndex(2);
		//s.selectByValue("Son");
		s.selectByVisibleText("Son");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("NAME")).sendKeys("vijay");
		

	}

}
