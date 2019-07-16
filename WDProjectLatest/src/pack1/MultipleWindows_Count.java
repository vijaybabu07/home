package pack1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows_Count {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("terms-link")).click();
		driver.findElement(By.id("privacy-link")).click();
		//System.out.println(driver.getWindowHandles());
		Set<String> s=driver.getWindowHandles();
		//ArrayList<String> w=new ArrayList<String>(s);
		ArrayList w=new ArrayList(s);
		//ArrayList w=new ArrayList(driver.getWindowHandles());
		System.out.println(w.size());

	}

}
