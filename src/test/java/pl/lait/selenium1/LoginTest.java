package pl.lait.selenium1;

import org.junit.Before;
import org.junit.runners.MethodSorters;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginTest {
	
	WebDriver driver = null;
	
	@Before //nie trzeba tego pisać przed każdym testem
	public void openPage() {
		driver = Init.getDriver();
	}
	@Ignore
	@Test
	public void clickOnMenuItems() {
		Init.sleep(1);
        driver.findElement(By.linkText("SIGN-ON")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("REGISTER")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("SUPPORT")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("CONTACT")).click();
        Init.sleep(1);
        driver.findElement(By.linkText("SIGN-ON")).click();
        Init.sleep(1);
        driver.findElement(By.name("userName")).sendKeys("akl12345");
        driver.findElement(By.name("password")).sendKeys("sloneczko26");
        Init.sleep(1);
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("SIGN-OFF")).click();
        Init.sleep(1);
	}
	
	@Test
	public void reservation() {
		driver.findElement(By.linkText("SIGN-ON")).click();
        driver.findElement(By.name("userName")).sendKeys("akl12345");
        driver.findElement(By.name("password")).sendKeys("sloneczko26");
        driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/"
				+ "tr/td[2]/table/tbody/tr[4]/td/table/"
				+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
				+ "table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		Select passCount = new Select(driver.findElement(By.name("passCount")));
		passCount.selectByValue("2");
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByValue("Frankfurt");
		Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByValue("3");
		Select fromDay = new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByValue("23");
		Select toPort = new Select(driver.findElement(By.name("toPort")));
		toPort.selectByValue("Paris");
		Select toMonth = new Select(driver.findElement(By.name("toMonth")));
		toMonth.selectByValue("5");
		Select toDay = new Select(driver.findElement(By.name("toDay")));
		toDay.selectByValue("18");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/"
				+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
				+ "table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		Select airline = new Select(driver.findElement(By.name("airline")));
		airline.selectByVisibleText("Pangea Airlines");
		driver.findElement(By.name("findFlights")).click();
	}
	
	@After
	public void tearDown() {
		Init.sleep(2);
		Init.endTest();
	}
}
