package com.criscar.swtestacademy.swd.pageobjectfactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

	// Constructor
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// ================================
	// Page variables
	// ================================
	// String baseURL = "http://www.n11.com/";

	// ================================
	// Web Elements
	// ================================
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement psw;

	@FindBy(xpath = "//*[@id=\\\"loginForm\\\"]/div[1]/div/div")
	private WebElement errorMessageUsernameXpath;

	@FindBy(xpath = "//*[@id=\\\"loginForm\\\"]/div[2]/div/div")
	private WebElement errorMessagePasswordXpath;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	// ================================
	// Page methods
	// ================================
	// Method for login operation
	public void loginToN11(String username, String password) {
		// Write user name (email)
		writeText(email, username);

		// Write user password
		writeText(psw, password);

		// Click Login button
		click(loginButton);
	}

	// Check login message for user name as expected or not
	public void verifyLoginUserName(String expectedText) {
		Assert.assertEquals(readText(errorMessageUsernameXpath), expectedText);
	}

	// Check password message for password as expected or not
	public void verifyLoginPassword(String expectedText) {
		Assert.assertEquals(readText(errorMessagePasswordXpath), expectedText);
	}

}
