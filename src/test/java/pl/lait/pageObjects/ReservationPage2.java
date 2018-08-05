package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium1.Init;

public class ReservationPage2 {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
			+ "table[1]/tbody/tr[5]/td[1]/input")
	WebElement departRadio2;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
			+ "table[2]/tbody/tr[5]/td[1]/input")
	WebElement returnRadio2;
	
	@FindBy(name = "reserveFlights")
	WebElement reserveFlightsBtn;
	
	public ReservationPage2() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	 /**
	  * ta metoda zawsze klika drugi radiobutton. Do każdej kombinacji guzików należy stworzyć nową metodę
	  */
	
	public void chooseFlights() {
		departRadio2.click();
		returnRadio2.click();
		Init.sleep(2);
		reserveFlightsBtn.click();
		Init.sleep(3);
	}
}
