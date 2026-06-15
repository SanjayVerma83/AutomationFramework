package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pages.HomePage;

public class HomePageTest extends TestBase {

	@Test
	public void verifySignupLoginClick() {

		HomePage hp = new HomePage(driver);

		hp.clickSignupLogin();
		Assert.assertTrue(
				driver.getCurrentUrl().contains("login"));
		
		System.out.println("Signup Login Clicked");
	}
}