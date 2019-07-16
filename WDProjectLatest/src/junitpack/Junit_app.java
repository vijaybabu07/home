package junitpack;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_app {
	public static WebDriver driver;
	@BeforeClass
	public static void launch_app()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
		System.out.println("application launched");
	}
	@AfterClass
	public static void close_app()
	{
		driver.close();
		System.out.println("app closed");
	}
	@Test
	public void links()
	{
		List<WebElement> nl=driver.findElements(By.tagName("a"));
		System.out.println("no of links : "+nl.size());
		for(int i=0;i<nl.size();i++)
		{
			String lname=nl.get(i).getText();
			if(lname.contains("terms")==true)
			{
				nl.get(i).click();
				System.out.println("Test1: "+lname+" link is clicked");
			}
		}
	}
	@Test
	public void win_close()
	{
		ArrayList w=new ArrayList(driver.getWindowHandles());
		System.out.println("Test2: no of windows:"+w.size());
	}
	@Test
	public void validate_field()
	{
		boolean chk=driver.findElement(By.xpath("//*[starts-with(@name,'btnchkavail')]")).isDisplayed();
		Assert.assertEquals(true, chk);
		System.out.println("Test3");
	}
	
	
}
