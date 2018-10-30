package com.criscar.swtestacademy.swd.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;

	// Constructor
	// Inject the driver and wait variables declared in @BeforeClass setup()
	// method of BaseTest Class into the Constructor
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	// Click method
	public void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}

	// Write text method
	public void writeText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}

	// Read text method
	public String readText(By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}

}
