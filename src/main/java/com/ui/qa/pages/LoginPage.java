package com.ui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "email")
	@CacheLookup
	WebElement username;

	@FindBy(name = "password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//div[contains(text(),'Login')]")
	@CacheLookup
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement ForgotPassword;

	public LoginPage() {
		// initialize elements with driver ,this means all the element will initialized
		// with driver
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
