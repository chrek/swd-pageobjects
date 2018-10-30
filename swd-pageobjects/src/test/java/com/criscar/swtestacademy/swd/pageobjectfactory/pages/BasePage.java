package com.criscar.swtestacademy.swd.pageobjectfactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageObject {
	public WebDriver driver;
	public WebDriverWait wait;

	// Constructor
	// Inject the driver and wait variables declared in @BeforeClass setup()
	// method of BaseTest Class into the Constructor
	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver);
		this.driver = driver;
		this.wait = wait;
	}

	// Click method
	public void click(WebElement elem) {
		elem.click();
	}

	// Write text method
	public void writeText(WebElement elem, String text) {
		elem.sendKeys(text);
	}

	// Read text method
	public String readText(WebElement elem) {
		return elem.getText();
	}

}
