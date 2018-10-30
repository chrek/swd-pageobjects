package com.criscar.swtestacademy.swd.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		//All the test and page classes will use this driver
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		
		//Create a wait. All test and page classes use this wait.
        wait = new WebDriverWait(driver,15);

		driver.manage().window().maximize();
	}
	
	@AfterClass
    public void teardown () {
        driver.quit();
    }

}
