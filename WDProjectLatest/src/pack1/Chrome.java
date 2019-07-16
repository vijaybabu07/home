package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.close();
	}

}
