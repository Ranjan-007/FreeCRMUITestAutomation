package com.ui.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ui.qa.base.TestBase;
import com.ui.qa.pages.HomePage;
import com.ui.qa.pages.LoginPage;
import com.ui.qa.utilities.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
    HomePage homepage;
    TestUtil testutil;
    String sheetName="contacts";
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		testutil=new TestUtil();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Test(priority=1)
	public void HomePageValidation() throws InterruptedException {
		
		homepage.clickCallQueue();
		//testutil.switchToframe();
		String str=homepage.TestContactActivityStream();
		Assert.assertEquals(str, "Contacts activity stream");
		String str1=homepage.TestCallQueue();
		Assert.assertEquals(str1, "Call Queue");
		String str2=homepage.TestUpcomingCalls();
		Assert.assertEquals(str2, "Upcoming calls");
		homepage.ClickContacts();
		homepage.ClickCreateBtn();
	}
	@DataProvider
	public Object[][] getTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=2, dataProvider ="getTestData")
	public void ValidationCreateNewContact(String firstname,String lastname,String middlename,String company)
	{
		homepage.ClickContacts();
		homepage.ClickCreateBtn();
		homepage.createNewContact(firstname,lastname,middlename,company);
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
