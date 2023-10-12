package com.ui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//*[contains(text(),'Contacts activity stream')]")
	@CacheLookup //it means it will store the particular element xpath in the chache memory, the speed of execution will increase.
	WebElement ContactsActivityStream;

	@FindBy(xpath = "//*[contains(text(),'Deals')]")
	@CacheLookup
	WebElement DealsText;

	@FindBy(xpath = "//*[contains(text(),'Call Queue')]")
	@CacheLookup
	WebElement CallQueue;

	@FindBy(xpath = "//*[contains(text(),'Upcoming calls')]")
	@CacheLookup
	WebElement UpcomingCalls;
	
	@FindBy(xpath="//span[text()='Contacts']")
	@CacheLookup
	WebElement ContactsIcon;
	
	@FindBy(xpath="//*[text()='Create']")
	@CacheLookup
	WebElement createBtn;
	
	@FindBy(name="first_name")
	@CacheLookup
	WebElement first_name;
	
	@FindBy(name="last_name")
	@CacheLookup
	WebElement last_name;
	
	@FindBy(name="middle_name")
	@CacheLookup
	WebElement middle_name;
	
	@FindBy(xpath="//*[@name='company']/input")
	@CacheLookup
	WebElement company_name;
	
	public void createNewContact(String firstname,String lastname,String middlename,String company)
	{
		first_name.sendKeys(firstname);
		last_name.sendKeys(lastname);
		middle_name.sendKeys(middlename);
		company_name.sendKeys(company);
	}

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String VerifyHomePageTitle() {
		return driver.getTitle();
	}

	public String TestContactActivityStream() {
		return ContactsActivityStream.getText();
	}

	public String TestCallQueue() {
		return CallQueue.getText();

	}

	public String TestUpcomingCalls() {
		return UpcomingCalls.getText();

	}

	public HomePage clickCallQueue() {
		CallQueue.click();
		return new HomePage();
	}
	public void ClickContacts()
	{
		Actions act=new Actions(driver);
		act.moveToElement(ContactsIcon).click().build().perform();
	}
	public void ClickCreateBtn()
	{
		createBtn.click();
		
	}

}
