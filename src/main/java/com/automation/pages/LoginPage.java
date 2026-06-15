package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// Locators

	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement emailTextBox;

	@FindBy(xpath = "//input[@data-qa='login-password']")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//button[@data-qa='login-button']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),' Logout')]")
	private WebElement logoutLink;

	@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
	private WebElement loginErrorMessage;

	// Actions

	public void enterEmail(String email) {

		emailTextBox.sendKeys(email);
	}

	public void enterPassword(String password) {

		passwordTextBox.sendKeys(password);
	}

	public void clickLoginButton() {

		loginButton.click();
	}

	// Reusable Method

	public void login(String email, String password) {

		enterEmail(email);

		enterPassword(password);

		clickLoginButton();
	}

	public boolean isLogoutDisplayed() {

		return logoutLink.isDisplayed();
	}

	public boolean isErrorMessageDisplayed() {

		return loginErrorMessage.isDisplayed();
	}
}