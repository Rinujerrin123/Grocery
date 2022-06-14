package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import com.qa.base.Base;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;


public class HomePage extends Base 
{
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='brand-text font-weight-light']") 
	WebElement homePageIcon;
	
	@FindBy (xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']")
	WebElement menulist;
	
	@FindBy (xpath="//i[@class='fas fa-bars']//parent::a")
	WebElement pushMenu;
	
	@FindBy (xpath="//img[@alt='AdminLTE Logo']")
	WebElement logo;
	
	@FindBy (xpath="//footer[@class='main-footer text-sm']")
	WebElement footer;
	
	@FindBy (xpath="//a[text()='7rmart supermarket']")
	WebElement footerTxt;
	
	@FindBy (xpath="(//img[@alt='User Image'])[1]")
	WebElement admin;
	
	@FindBy (xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]")
	WebElement logout;
	
	@FindBy (xpath="//span[text()='7rmart supermarket']")
	WebElement txt;
	
	
	public String txtDisplayed()
    {
		 String textDisplayed=PageUtility.getText(txt);
         return  textDisplayed;
    }
	
	public boolean homePageIconDisplayed()
    {
		
    	 boolean homePageIconDisplayed=PageUtility.isElementDisplayed(homePageIcon);
         return  homePageIconDisplayed;
    }
	
	public boolean isMenuDisplayed()
	{
		
		boolean isMenuDisplay =PageUtility.isElementDisplayed(menulist);
		return isMenuDisplay;
	}
	
	public boolean logoDisplayed()
    {
		boolean logDisplayed=PageUtility.isElementDisplayed(logo);
        return  logDisplayed;
    }
	
	public void pushMenuClicked()
	{
		WaitUtility.visibilityOfEleLocated(driver, pushMenu);
		PageUtility.clickButton(driver,pushMenu);
	}
	
	public void footer()
	{
		WaitUtility.visibilityOfEleLocated(driver, footer);
		PageUtility.scroll(driver,footer);
	}
	
	public String footerDisplayed()
    {
		 String footerDisplayed=PageUtility.getText(footerTxt);
         return  footerDisplayed;
    }
	
	/*public void logout()
	{
		PageUtility.clickButton(driver, admin);
		PageUtility.clickButton(driver, logout);
	}*/
}
