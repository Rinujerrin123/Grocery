package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import com.qa.base.Base;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;

public class ManageProductPage extends Base
{

	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Manage Product']//parent::a")
	WebElement  manageProductMenu;
	
	@FindBy(xpath="//h1[text()='List Products']")
	WebElement  listProductText;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")
	WebElement  newButtonClick;
	
	@FindBy(xpath="//h1[text()='Add Product']")
	WebElement  addProductText;
	
	@FindBy(xpath="//h1[text()='Edit Product']")
	WebElement  editProductText;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")
	WebElement  newButton;
	
	@FindBy(xpath="//i[@class=' fa fa-search']//parent::a")
	WebElement  search;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/edit?edit=786&page_ad=1&un=&ct=&sb=&Search=sr']")
	WebElement  viewAction;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/delete?del=786&page_ad=1']")
	WebElement  deleteAction;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement  homeButton;
	
	public void manageProductMenuClicked()
	{
		WaitUtility.visibilityOfEleLocated(driver, manageProductMenu);
		PageUtility.clickButton(driver, manageProductMenu);
	}
	
	public String listProductText()
	{
		 String listProduct=PageUtility.getText(listProductText);
         return  listProduct;
		
	}
	
	public boolean isNewButtonDisplayed()
	{
		boolean newButtonDisplay =PageUtility.isElementDisplayed(newButtonClick);
		return newButtonDisplay;
	}
	
	
	
	 public boolean isSearchButtonDisplayed()
		{
			boolean searchButtonDisplay =PageUtility.isElementDisplayed(search);
			return searchButtonDisplay;
		}
	 
	 public void newButtonClicked()
		{
		    WaitUtility.visibilityOfEleLocated(driver, newButtonClick);
			PageUtility.actionClass(driver, newButtonClick);
		}
	 
	 public String addProductText()
		{
			 String addProduct=PageUtility.getText(addProductText);
	         return  addProduct;
			
		}
	 
	 public boolean isViewButtonDisplayed()
		{
			boolean viewActionDisplay =PageUtility.isElementDisplayed(viewAction);
			return viewActionDisplay;
		}
		
		public boolean isDeleteButtonDisplayed()
		{
			boolean deleteActionDisplay =PageUtility.isElementDisplayed(deleteAction);
			return deleteActionDisplay;
		}
		
		public void viewActionPage()
		{
			WaitUtility.visibilityOfEleLocated(driver, viewAction);
			PageUtility.clickButton(driver,viewAction);
	    }
		
		public String editProductText()
		{
			 String editProduct=PageUtility.getText(editProductText);
	         return  editProduct;
			
		}
		
		public void homeClick()
		{
			WaitUtility.visibilityOfEleLocated(driver, homeButton);
			PageUtility.clickButton(driver,homeButton);
	    }
		
		public void deletePopupDisplay() 
		{
			WaitUtility.visibilityOfEleLocated(driver, deleteAction);
			PageUtility.clickButton(driver,deleteAction);
			
		}
		
		public void cancelProduct() 
		{
			
			PageUtility.cancelAlertMessage(driver);
			
		}
		/*public void deleteProduct() 
		{
			PageUtility.deleteAlertMessage(driver);
			
		}*/
		
}
