package com.ui.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.qa.base.TestBase;
import com.ui.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase
{
	SignUpPage signuppage;
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		signuppage=new SignUpPage();
	}
	@Test
	public void LoginPageTitleTest()
	{
		String str=signuppage.VerifyForgotyourpassword();
		Assert.assertEquals(str, "Forgot your password?");
		String str1=signuppage.VerifyNoAccounts();
		Assert.assertEquals(str1, "No Account? Registration takes only a few seconds Sign Up");
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
