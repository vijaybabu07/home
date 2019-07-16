package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReusableMethod1 {
	public WebDriver driver;
	public void launchapp(String url)
	{
		/*System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		driver=new FirefoxDriver();*/
		System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void elementEnabled(String e,boolean exp)
	{
		boolean actual=driver.findElement(By.id(e)).isEnabled();
		if(actual==exp)
			System.out.println("Pass : Element "+e+" is enabled");
		else
			System.out.println("Fail : Element "+e+" is not enabled");
	}
	public void no_of_links(int exp)
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int nol=links.size();
		System.out.println("Actual Number of links :"+nol);
		System.out.println("Expected Number of links :"+exp);
		if(nol==exp)
			System.out.println("Pass: Actual Number of links is equal to expected no of links");
		else
			System.out.println("Fail: Actual Number of links is not equal to expected no of links");
	}
	public void title(int exp)
	{
		String t=driver.getTitle();
		int tl=t.length();
		System.out.println("Actual title length :"+tl);
		System.out.println("Expected title length :"+exp);
		if(tl==exp)
			System.out.println("Pass: Actual title length is equal to expected title length");
		else
			System.out.println("Fail: Actual title length is not equal to expected title length");
	}
	public void url(String exp)
	{
		String u=driver.getCurrentUrl();
		System.out.println("URL: "+u);
		if(u.contains(exp))
			System.out.println("Pass: contains "+exp+" in url "+u);
		else
			System.out.println("Fail:does not contains "+exp+" in url "+u);
			
	}
	public void title_startswith(String exp)
	{
		String t=driver.getTitle();
		System.out.println("Title :"+t);
		if(t.startsWith(exp)==true)
			System.out.println("Pass: Title starts with "+exp);
		else
			System.out.println("Fail: Title does not starts with "+exp);
	}
}
