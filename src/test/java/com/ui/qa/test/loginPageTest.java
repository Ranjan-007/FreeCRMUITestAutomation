package com.ui.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.qa.base.TestBase;
import com.ui.qa.pages.LoginPage;

public class loginPageTest extends TestBase{
	LoginPage loginpage;
	public loginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage=new LoginPage();
	}
	@Test(priority=1,retryAnalyzer=retryAnalyzer.RetryAnalyzer.class)
	public void LoginPageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	@Test(priority=2)
	public void loginTest()
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
