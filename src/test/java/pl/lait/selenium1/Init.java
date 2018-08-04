package pl.lait.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver" , "C:\\Geckodriver\\geckodriver.exe");
        
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        
        driver = new FirefoxDriver(cap);
        driver.get("http://newtours.demoaut.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //maxymalny czas oczekiwania
        driver.manage().window().maximize();//otwiera pełne okno
        return driver;
	}

	public static void endTest() {
		driver.quit();
	}
	
	public static void sleep(int seconds) {
    	try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
