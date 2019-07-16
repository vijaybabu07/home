package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a")); //to collect all the links
		int nol=links.size(); // number of links
		System.out.println("Number of links: "+nol);
		String lname;
		String url;
		for(int i=0;i<nol;i++)
		{
			lname=links.get(i).getText();
			url=links.get(i).getAttribute("href");
			if(lname.startsWith("M")==true) //to print link names starting with 'M'
				System.out.println(lname+"   -  "+url);
		}
		List<WebElement> images=driver.findElements(By.tagName("img")); //to collect all the images
		int noi=images.size(); //no of images
		System.out.println("Number of images: "+noi);
		if(nol>noi)			//to check if Number of links greater than number of images");
			System.out.println("Number of links are greater than number of images");
		else	
			System.out.println("Number of links are not greater than number of images");
		
	}

}
