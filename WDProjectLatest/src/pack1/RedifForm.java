package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedifForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("name21ea43f1")).sendKeys("vijay");
		

	}

}
