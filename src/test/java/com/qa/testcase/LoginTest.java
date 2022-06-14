package com.qa.testcase;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.ScreenShotUtility;


public class LoginTest extends Base
{
	LoginPage loginObj;
	HomePage homeObj;
    
	@BeforeMethod
	public void beforeMethod()
	{
		loginObj=new LoginPage(driver);
		homeObj=new HomePage(driver);
	}
	
	@Test(priority=1)
	public void userIdFieldIsDisplayed()
	{
		boolean userIdFieldDisplayed=loginObj.isUserIdFieldDisplayed();
		Assert.assertTrue(userIdFieldDisplayed);
	}
	
	@Test(priority=2)
	public void passwordFieldIsDisplayed()
	{
		boolean passwordDisplayed=loginObj.isPasswordFieldDisplayed();
		Assert.assertTrue(passwordDisplayed);
	}
	
	@Test(priority=3)
	public void loginTestWithWrongPassword()
	{
		loginObj.login("admin","adminadmin");	
		boolean userIdFieldDisplayed=loginObj.isUserIdFieldDisplayed();
		Assert.assertTrue(userIdFieldDisplayed);
	}
	
	@Test(priority=4)
	public void loginTest() 
	{
		loginObj.login("admin","admin");
		String txt=homeObj.txtDisplayed();
		Assert.assertEquals(txt, "7rmart supermarket");
		/*boolean homePageIconisDisplayed=homeObj.homePageIconDisplayed();
		Assert.assertTrue(homePageIconisDisplayed);*/
	
		

	}
	
	
	/*public void closeTest()
	{
		loginObj.closeBrowser();
	}*/
	
}
