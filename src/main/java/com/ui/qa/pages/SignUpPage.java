package com.ui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.qa.base.TestBase;

public class SignUpPage extends TestBase
{
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement Forgotyourpassword;
	
	@FindBy(xpath="//*[contains(text(),'No Account? Registration takes only a few seconds')]")
	@CacheLookup
	WebElement NoAccounts;
	
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyForgotyourpassword()
	{
		String str=Forgotyourpassword.getText();
		return str;
	}
	public String VerifyNoAccounts()
	{
		String str=NoAccounts.getText();
		return str;
	}

}
