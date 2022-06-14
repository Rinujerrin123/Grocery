package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import com.qa.base.Base;
import com.qa.utilities.PageUtility;

public class SearchListOrderPage extends Base
{
     
	public SearchListOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement  searchOrders;
	
	@FindBy(xpath="//h4[text()='List Orders(1)']")
	WebElement  searchOrderText;
	
	@FindBy(name="od") 
	WebElement orderId;
	
	@FindBy(name="Search") 
	WebElement search;
	
	@FindBy(name="Reset") 
	WebElement reset;
	
	public void searchListOrders() 
	{
		PageUtility.clickButton(driver,searchOrders);
	}
	
	public void searchOrders() 
	{
		PageUtility.sendInput(driver,orderId,"563");
		PageUtility.clickButton(driver, search);
	}
	
	public String searchOrderText()
	{
		 String searchOrder=PageUtility.getText(searchOrderText);
         return  searchOrder;
		
	}
	
	public void resetClick() 
	{
		PageUtility.clickButton(driver,reset);
	}
	
	 public void closeBrowser()
		{
			PageUtility.quit(driver);
		}
}


