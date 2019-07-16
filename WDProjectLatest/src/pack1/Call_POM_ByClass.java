package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call_POM_ByClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		POM_ByClass p=new POM_ByClass();
		driver.findElement(p.uid).sendKeys("vijay");
		driver.findElement(p.pwd).sendKeys("abcde");
	}

}
