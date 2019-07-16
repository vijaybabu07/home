package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync_WebdriverWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bharatmatrimony.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='close']/center/div[2]/div[3]/div/div/ul/li[11]/a")).click();
		WebDriverWait ww=new WebDriverWait(driver, 60);
		ww.until(ExpectedConditions.titleContains("Telugu"));
		driver.findElement(By.id("NAME")).sendKeys("vijay");

	}

}
