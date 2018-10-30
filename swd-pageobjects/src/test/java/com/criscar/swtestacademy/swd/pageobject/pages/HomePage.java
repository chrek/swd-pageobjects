package com.criscar.swtestacademy.swd.pageobject.pages;

//import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	String signInButtonClass = "btnSignIn";

	// ================================
	// Page methods
	// ================================
	// Go to HomePage
	public void goToN11() {
		driver.get(baseURL);
	}

	// Go to LoginPage
	public void goToLoginPage() {
		click(By.className(signInButtonClass));
	}

}
