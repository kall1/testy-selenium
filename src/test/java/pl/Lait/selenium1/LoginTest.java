package pl.Lait.selenium1;

import javax.print.DocFlavor.STRING;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {
	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();

	}

	@Ignore
	@Test
	public void clickOnMenuItems() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
	}
	
	@Ignore	
	@Test
	public void Login() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("adamdz");
		driver.findElement(By.name("password")).sendKeys("qwe123");
		driver.findElement(By.name("login")).click();
	
		String round_Trip ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
		String one_Way ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		
		driver.findElement(By.xpath(round_Trip)).click();
		driver.findElement(By.xpath(one_Way)).click();	
 
		Select pass_count = new Select(driver.findElement(By.name("passCount")));
		pass_count.selectByValue("2");
		
		Init.sleep(6);
	}
 
	@After
	public void close() {
		Init.endTest();
	}
}
