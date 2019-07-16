package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Call_POM_FindBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		POM_FindBy p=PageFactory.initElements(driver, POM_FindBy.class);
		p.uid.sendKeys("vijay");
		p.pwd.sendKeys("abcde");
	}

}
