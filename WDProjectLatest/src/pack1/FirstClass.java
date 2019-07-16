package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.manage().window().maximize();
		driver.close();

	}

}
