package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WD\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//Launch Yahoo app
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
	//Application title length should be greater than application URL Length
		String apptitle=driver.getTitle();
		System.out.println("Application Title:"+apptitle+" and length: "+apptitle.length());
		String appurl=driver.getCurrentUrl();
		System.out.println("Application url:"+appurl+" and length: "+appurl.length());
		if(apptitle.length()>appurl.length())
			System.out.println("Pass: Application title length is greater than application URL Length");
		else
			System.out.println("Fail: Application title length is not greater than application URL Length");
	//Enter Username
		driver.findElement(By.id("login-username")).sendKeys("vijay");
	//Next button should be available and and should be enabled
		boolean next_available=driver.findElement(By.id("login-signin")).isDisplayed();
		boolean next_enabled=driver.findElement(By.id("login-signin")).isEnabled();
		if(next_available==true && next_enabled==true)
			System.out.println("Pass: Next button is available and is enabled");
		else
			System.out.println("Fail: Next button is not available and is not enabled");
	//Click on Sign Up
		driver.findElement(By.id("createacc")).click();
	//Title of the registration page should contain "accounts"
		String regtitle=driver.getTitle();
		System.out.println("Registration Title: "+regtitle);
		if(regtitle.contains("account")==true)
			System.out.println("Pass: Title of the registration page contains \"accounts\"");
		else
			System.out.println("Fail: Title of the registration page does not contain \"accounts\"");		

	}

}
