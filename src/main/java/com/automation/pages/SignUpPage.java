package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;

	// Constructor
	public SignUpPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// Locators

	@FindBy(name = "name")
	private WebElement txtName;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//button[@data-qa='signup-button']")
	private WebElement btnSignUp;

	// Actions

	public void enterName(String name) {

		txtName.sendKeys(name);
	}

	public void enterEmail(String email) {

		txtEmail.sendKeys(email);
	}

	public void clickSignUpButton() {

		btnSignUp.click();
	}

	// Reusable Method

	public void signUp(String name, String email) {

		enterName(name);

		enterEmail(email);

		clickSignUpButton();
	}
}