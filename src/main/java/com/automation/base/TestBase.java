package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.factory.DriverFactory;
import com.automation.util.ConfigReader;

public class TestBase {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = DriverFactory.initDriver();

		ConfigReader config = new ConfigReader();

		driver.get(config.getUrl());
	}

	@AfterMethod
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}

	public WebDriver getDriver() {

		return driver;
	}
}