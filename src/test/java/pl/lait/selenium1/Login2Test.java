package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.ReservationPage;
import pl.lait.pageObjects.ReservationPage2;

public class Login2Test {

	WebDriver driver;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	@Test
	public void loginWithPageObject() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("akl12345", "sloneczko26");
		
		ReservationPage reservPage = new ReservationPage();
		reservPage.fillTheReservationForm();
		
		ReservationPage2 reservPage2 = new ReservationPage2();
		reservPage2.chooseFlights();
	}
	
	@After
	public void tearDown() {
		Init.sleep(4);
		Init.endTest();
	}
}
