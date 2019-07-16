package pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows_AlternateWinClose {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("terms-link")).click();
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();

		ArrayList w = new ArrayList(driver.getWindowHandles());
		System.out.println(w.size());
		int i;
		for (i = 0; i <= w.size(); i++) {
			String title = driver.switchTo().window((String) w.get(i))
					.getTitle();
			System.out.println("title at index " + i + " is " + title);
			
		driver.switchTo().window((String) w.get(i)).close();
		Thread.sleep(2000);
		}

	}

}
