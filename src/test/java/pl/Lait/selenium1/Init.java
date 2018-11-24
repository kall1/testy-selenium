package pl.Lait.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {
	static WebDriver driver;
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\SOBOTA\\chromedriver.exe");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
		//driver.manage().timeouts().implicityWait(60,TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void endTest() {
		driver.quit();
	}
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds); } 
		catch (InterruptedException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
