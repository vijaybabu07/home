package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		driver.switchTo().frame("packageListFrame").findElement(By.xpath("//a[@href='java/awt/package-frame.html']"))
				.click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame").findElement(By.xpath("//*[@href='Composite.html']")).click();
	}
}
