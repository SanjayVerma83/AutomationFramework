package com.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.util.ExcelUtil;
import com.automation.util.ScreenshotUtil;

public class LoginPageTest extends TestBase {

	private static final Logger logger =
			LogManager.getLogger(LoginPageTest.class);

	@Test
	public void verifyValidLogin() {

		logger.info("Starting Login Test");

		HomePage home = new HomePage(driver);

		home.clickSignupLogin();

		logger.info("Clicked Signup/Login");

		LoginPage login = new LoginPage(driver);

		String email =
				ExcelUtil.getCellData("LoginData", 1, 0);

		String password =
				ExcelUtil.getCellData("LoginData", 1, 1);

		logger.info("Login data fetched from Excel");

		login.login(email, password);

		logger.info("Login performed successfully");

		ScreenshotUtil.captureScreenshot(
				driver,
				"LoginPageTest");

		logger.info("Screenshot captured");
		
	}
}