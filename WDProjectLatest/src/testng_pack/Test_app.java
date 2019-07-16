package testng_pack;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test_app {
WebDriver driver;
  @AfterMethod
  public void afterMethod() {
	  driver.close();
		System.out.println("app closed");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
		System.out.println("application launched");
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
		Assert.assertEquals(chk, true);
		
				System.out.println("Test3");
	}
}
