package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	public void launchApp(String url)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void closeApp()
	{
		driver.close();
	}
	public void elementavailable(String k,boolean exp)
	{
		boolean actual=driver.findElement(By.id(k)).isDisplayed();
		if(actual==exp)
			System.out.println("Pass: Element is available");
		else
			System.out.println("Fail: Element is not available");
	}

	
}
