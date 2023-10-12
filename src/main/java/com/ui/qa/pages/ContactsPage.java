package com.ui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.qa.base.TestBase;

public class ContactsPage extends TestBase
{
	@FindBy(xpath="//span[text()='Contacts']")
	@CacheLookup
	WebElement ContactsIcon;
	
	@FindBy(xpath="//*[text()='Name']")
	@CacheLookup
	WebElement Name;
	
	@FindBy(xpath="//*[text()='Category']")
	@CacheLookup
	WebElement Category;
	
	@FindBy(xpath="//*[text()='Status']")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath="//*[text()='Phone']")
	@CacheLookup
	WebElement Phone;
	
	@FindBy(xpath="//*[text()='Phone']")
	@CacheLookup
	WebElement Email;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyContactsIcon()
	{
		String str=ContactsIcon.getText();
		return str;
	}
	public ContactsPage HoverOnContacts()
	{
		ContactsIcon.click();
		return new ContactsPage();
	}
	public String VerifyName()
	{
		String str=Name.getText();
		return str;
	}
	public String VerifyCategory()
	{
		String str=Category.getText();
		return str;
	}
	public String VerifyStatus()
	{
		String str=Status.getText();
		return str;
	}
	public String VerifyPhone()
	{
		String str=Phone.getText();
		return str;
	}
	public String VerifyEmail()
	{
		String str=Email.getText();
		return str;
	}
	
	

}
