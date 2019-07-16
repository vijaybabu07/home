package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='upload-form']/div/div[2]/div/div[1]/a/img[1]")).click();
		Runtime.getRuntime().exec("D:\\selenium\\WD\\upload.exe");
		
		

	}

}
