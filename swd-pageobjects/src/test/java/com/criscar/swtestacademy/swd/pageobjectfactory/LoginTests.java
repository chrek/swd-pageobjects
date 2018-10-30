package com.criscar.swtestacademy.swd.pageobjectfactory;

import org.testng.annotations.Test;

import com.criscar.swtestacademy.swd.pageobject.pages.HomePage;
import com.criscar.swtestacademy.swd.pageobject.pages.LoginPage;

public class LoginTests extends BaseTest {

	@Test(priority = 0)
	public void invalidLoginTest_InvalidUserNameInvalidPassword() throws InterruptedException {

		// =========== Instantiation of Pages ===========
		HomePage homepg = new HomePage(driver, wait);
		LoginPage loginpg = new LoginPage(driver, wait);

		// =========== Use Page Methods ===========
		// Open N11 HomePage
		homepg.goToN11();

		// Open N11 LoginPage
		homepg.goToLoginPage();

		// Login to N11
		loginpg.loginToN11("onur@swtestacademy.com", "1234");

		// =========== Do Assertions ===========
		Thread.sleep(500);
		// loginpg.verifyLoginPassword("The entered value must be at least 6
		// characters.");
		loginpg.verifyLoginPassword("Girilen değer en az 6 karakter olmalıdır.");
	}

	@Test(priority = 1)
	public void invalidLoginTest_EmptyUserNameEmptyPassword() throws InterruptedException {

		// =========== Instantiation of Pages ===========
		HomePage homepg = new HomePage(driver, wait);
		LoginPage loginpg = new LoginPage(driver, wait);

		// =========== Use Page Methods ===========
		// Open N11 HomePage
		homepg.goToN11();

		// Open LoginPage
		homepg.goToLoginPage();

		// Login to N11
		loginpg.loginToN11("", "");

		// =========== Do Assertions ===========
		Thread.sleep(500);
		// loginpg.verifyLoginUserName("Please enter your email address.");
		// loginpg.verifyLoginPassword("This field is required.");
		loginpg.verifyLoginUserName("Lütfen e-posta adresinizi girin.");
		loginpg.verifyLoginPassword("Bu alanın doldurulması zorunludur.");
	}

}
