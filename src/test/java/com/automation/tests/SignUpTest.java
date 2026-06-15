package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.SignUpPage;
import com.automation.util.ExcelUtil;
import com.automation.util.TestUtil;

public class SignUpTest extends TestBase {

	@Test
	public void verifySignUp() {

		HomePage home = new HomePage(driver);

		home.clickSignupLogin();

		SignUpPage signUp = new SignUpPage(driver);

		String name =
				ExcelUtil.getCellData(
						"SignUpData", 1, 0);
		
		String email =
				TestUtil.generateEmail();

		signUp.signUp(name, email);

		System.out.println("Signup button clicked successfully");
	}
}