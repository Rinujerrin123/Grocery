package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.qa.base.Base;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;


public class ManageOrderPage extends Base
{
	public ManageOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Manage Orders']//parent::a")
	WebElement  manageOrderMenu;
	
	@FindBy(xpath="//h1[text()='List Orders']")
	WebElement  listOrderText;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Order/details?details=574&page_ad=1']")
	WebElement  viewAction;
	
	@FindBy(xpath="//h1[text()='Order Details']")
	WebElement  orderDetailsText;
	
	@FindBy(xpath="//i[@class='fas fa-arrow-left']//parent::a")
	WebElement  homeButton;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Order/delete?del=574&page_ad=1']")
	WebElement  deleteAction;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") 
	WebElement search;
	
	public void manageOrderMenuClicked()
	{
		WaitUtility.visibilityOfEleLocated(driver, manageOrderMenu);
		PageUtility.clickButton(driver, manageOrderMenu);
		
	}
	
	public String listOrderText()
	{
		 String manageOrder=PageUtility.getText(listOrderText);
         return  manageOrder;
		
	}
	
	public boolean isViewButtonDisplayed()
	{
		WaitUtility.visibilityOfEleLocated(driver, viewAction);
		boolean viewActionDisplay =PageUtility.isElementDisplayed(viewAction);
		return viewActionDisplay;
	}
	
	public boolean isDeleteButtonDisplayed()
	{
		WaitUtility.visibilityOfEleLocated(driver, deleteAction);
		boolean deleteActionDisplay =PageUtility.isElementDisplayed(deleteAction);
		return deleteActionDisplay;
	}
	
	public void viewActionPage()
	{
		WaitUtility.visibilityOfEleLocated(driver, viewAction);
		PageUtility.clickButton(driver,viewAction);
    }
	
	public String orderDetailsText()
	{
		 String orderDetails=PageUtility.getText(orderDetailsText);
         return  orderDetails;
		
	}
	
	
	public void homePageClick()
	{
		WaitUtility.visibilityOfEleLocated(driver, homeButton);
		PageUtility.clickButton(driver,homeButton);
    }
	
	public void deletePopupDisplay() 
	{
		WaitUtility.visibilityOfEleLocated(driver, deleteAction);
		PageUtility.clickButton(driver,deleteAction);
	
		
	}
	
	public void cancelOrder() 
	{
		
		PageUtility.cancelAlertMessage(driver);
		
	}
	
   /*public void deleteOrder() 
	{
		PageUtility.deleteAlertMessage(driver);
		
	}*/
   
   public boolean isSearchButtonDisplayed()
	{
	   WaitUtility.visibilityOfEleLocated(driver, search);
		boolean searchButtonDisplay =PageUtility.isElementDisplayed(search);
		return searchButtonDisplay;
	}
   
   /*public void closeBrowser()
	{
		PageUtility.quit(driver);
	}*/
   }
