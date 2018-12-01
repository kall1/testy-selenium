package pl.Lait.PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import pl.Lait.selenium1.Init;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Login2Test {
	WebDriver driver = null;

	@Before
	public void openPage() {
		System.out.println("wewnatrz openPage (before)");
		driver = Init.getDriver();
		System.out.println("wewnatrz openPage (koniec before);");
	}
	@Ignore
	@Test
	public void login() {
		System.out.println("wewnatrz testu-login");
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("adamdz", "qwe123");
		System.out.println("koniec testu login");
	}

	@Test
	public void reservation() {
		// 1 - otwieramy przegladarke i logujemy sie do aplikacji
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("adamdz", "qwe123");
		// 2-na pierwszym ekranie po zalogowaniu sie wypwlniam formularz rezerwacji
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.oneWayRadioClick();
		Init.sleep(1);
		reservationPage.roundTripRadioClick();
		Init.sleep(1);
		reservationPage.passengersCount("2");
		Init.sleep(1);
		reservationPage.passengersCount("3");
		reservationPage.fromPort("London");
		reservationPage.on("12", "1");	
		reservationPage.airline("Blue Skies Airlines");
		Init.sleep(4);
		reservationPage.continueBtnClick();
		Init.sleep(3);
		
		Reservation2Page r2p = new Reservation2Page();
		r2p.radio2Click();
		r2p.radio6Click();
		r2p.continueBtnClick();
		
		Init.sleep(6);
		r2p.pass0("aaa", "bbb","Hindu");
		
		
		r2p.creditCard("MasterCard");
		Init.sleep(4);
		r2p.securePurchaseClick();
		Init.sleep(9);
		
	}

	
	@After
	public void close() {
		Init.endTest();
	}
}