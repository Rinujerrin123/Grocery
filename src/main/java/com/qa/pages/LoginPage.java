package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;

public class LoginPage extends Base
{
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //using page factory
	}
	
	@FindBy(name="username") 
	WebElement userid;
	@FindBy(name="password") 
	WebElement pass;
	@FindBy(xpath="//button[@type='submit']") 
	WebElement loginbutton;
	
    
	public boolean isUserIdFieldDisplayed()
	{
		WaitUtility.visibilityOfEleLocated(driver, userid);

		boolean isDisplayed=PageUtility.isElementDisplayed(userid);
		return isDisplayed;
	}
	
	public boolean isPasswordFieldDisplayed()
	{
		WaitUtility.visibilityOfEleLocated(driver, pass);

		boolean isDisplayed=PageUtility.isElementDisplayed(pass);
		return isDisplayed;
	}
	
	public void login(String username,String password)
	{
		
		PageUtility.sendInput(driver,userid, username);
		PageUtility.sendInput(driver,pass, password);
		PageUtility.clickButton(driver,loginbutton);
		
	}
   
	public void closeBrowser()
	{
		PageUtility.quit(driver);
	}
}
