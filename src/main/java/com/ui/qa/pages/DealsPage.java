package com.ui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.qa.base.TestBase;

public class DealsPage extends TestBase{
	
	@FindBy(xpath="//i[@class='money icon']")
	@CacheLookup
	WebElement DealsIcon;
	
	@FindBy(xpath="//*[contains(text(),'Title')]")
	@CacheLookup
	WebElement Title;
	
	@FindBy(xpath="//*[contains(text(),'Company')]")
	@CacheLookup
	WebElement Company;
	
	@FindBy(xpath="//*[contains(text(),'Amount')]")
	@CacheLookup
	WebElement Amount;
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String DealPageTitleCheck()
	{
		return driver.getTitle();
	}
	public String CompanyCheck() {
		String S=Company.getText();
		return S;
	}
	public String AmountLabelCheck() {
		String S1=Amount.getText();
		return S1;
	}

}

