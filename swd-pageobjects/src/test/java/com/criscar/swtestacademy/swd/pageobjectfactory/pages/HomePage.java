package com.criscar.swtestacademy.swd.pageobjectfactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	// Constructor
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// ================================
	// Page variables
	// ================================
	String baseURL = "http://www.n11.com/";	
	
	// ================================
	// Web Elements
	// ================================
	@FindBy(className = "btnSignIn")
	private WebElement submitButton;

	// ================================
	// Page methods
	// ================================
	// Go to HomePage
	public void goToN11() {
		driver.get(baseURL);
	}

	// Go to LoginPage
	public void goToLoginPage() {
		//click(By.className(signInButtonClass));
		click(submitButton);
	}

}
