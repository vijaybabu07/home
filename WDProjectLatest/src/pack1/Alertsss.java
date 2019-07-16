package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Alertsss {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WD\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.ie.driver", "D:\\selenium\\WD\\jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='Register']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		

	}

}
