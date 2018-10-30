package com.criscar.swtestacademy.swd.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	String usernameId = "email";
	String passwordId = "password";
	String loginButtonId = "loginButton";
	String errorMessageUsernameXpath = "//*[@id=\"loginForm\"]/div[1]/div/div";
	String errorMessagePasswordXpath = "//*[@id=\"loginForm\"]/div[2]/div/div ";

	// ================================
	// Page methods
	// ================================
	// Method for login operation
	public void loginToN11(String username, String password) {
		// Write user name (email)
		writeText(By.id(usernameId), username);

		// Write user password
		writeText(By.id(passwordId), password);

		// Click Login button
		click(By.id(loginButtonId));
	}

	// Check login message for user name as expected or not
	public void verifyLoginUserName(String expectedText) {
		Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
	}

	// Check password message for password as expected or not
	public void verifyLoginPassword(String expectedText) {
		Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
	}

}
