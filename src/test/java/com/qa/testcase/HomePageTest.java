package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest extends Base
{
	HomePage homeObj;
	LoginPage loginObj;
	
	@BeforeMethod
	public void performlogin() throws InterruptedException
	{
		loginObj =new LoginPage(driver);
		homeObj = new HomePage(driver);
		Thread.sleep(3000);
		loginObj.login("admin","admin");
		
	}
	
	
	@Test(priority=5)
	public void homeIconTest()
	{
		boolean homeIcon=homeObj.isMenuDisplayed();
		Assert.assertTrue(homeIcon);
	}
	
	@Test(priority=6)
	public void menuDisplayTest()
	{
		boolean menuDisplayed=homeObj.isMenuDisplayed();
		Assert.assertTrue(menuDisplayed);
	}
	
	@Test(priority=7)
	public void pushMenuTest()
	{
		homeObj.pushMenuClicked();
		boolean logoDisplayed=homeObj.logoDisplayed();
		Assert.assertTrue(logoDisplayed);
	}
	
	@Test(priority=8)
	public void footerTest()
	{
		homeObj.footer();
		String txt=homeObj.footerDisplayed();
		Assert.assertEquals(txt,"7rmart supermarket");
	}
	
	/*@AfterMethod
	public void logout()
	{
	  homeObj.logout();	
	}*/
	
}
