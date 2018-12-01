package pl.Lait.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {
	static WebDriver driver;

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\SOBOTA\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		System.out.println("new ChromeDriver");

		if (driver == null) {
			driver = new ChromeDriver();
			System.out.println("get http...");
			driver.get("http://newtours.demoaut.com");
			return driver;
		} else {
			return driver;
		}

		// driver.manage().timeouts().implicityWait(60,TimeUnit.SECONDS);

	}

	public static void endTest() {
		System.out.println("wewnatrz endTest");
		driver.quit();
		driver = null;
		System.out.println("po endTest");
		
	}

	public static void sleep(int seconds) {
				
			try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
}
