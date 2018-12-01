package pl.Lait.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.Lait.selenium1.Init;

public class LoginPage {

	WebDriver driver;

	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;

	@FindBy(name = "userName")
	WebElement loginInput;

	@FindBy(name = "password")
	WebElement passInput;

	@FindBy(name = "login")
	WebElement LoginBtn;

	public LoginPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void goToLoginPage() {
		signOnLink.click();
	}

	/**
	 * loguje sie jako user z danymi przekazanymi w parametrach
	 * 
	 * @param login
	 * @param pass
	 */

	public void loginAs(String login, String pass) {
		loginInput.sendKeys(login);
		passInput.sendKeys(pass);
		LoginBtn.click();

	}
}