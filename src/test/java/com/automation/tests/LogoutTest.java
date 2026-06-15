package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.util.ExcelUtil;

public class LogoutTest extends TestBase {

	@Test
	public void verifyLogout() {

		HomePage home = new HomePage(driver);

		home.clickSignupLogin();

		LoginPage login = new LoginPage(driver);

		String email =
				ExcelUtil.getCellData("LoginData", 1, 0);

		String password =
				ExcelUtil.getCellData("LoginData", 1, 1);

		login.login(email, password);

		// Recreate HomePage after login
		home = new HomePage(driver);

		home.clickLogout();

		System.out.println("Logout successful");
	}
}