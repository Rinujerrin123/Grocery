package com.qa.testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ManageOrderPage;
import com.qa.pages.SearchListOrderPage;
import com.qa.utilities.ScreenShotUtility;

import junit.framework.Assert;

public class SearchListOrderTest extends Base
{
    
	HomePage homeObj;
	LoginPage loginObj;
	ManageOrderPage  manageOrderObj;
	SearchListOrderPage  searchOrderObj;
	
	@BeforeMethod
	public void performlogin()
	{
		loginObj =new LoginPage(driver);
		homeObj = new HomePage(driver);
		loginObj.login("admin","admin");
		manageOrderObj=new ManageOrderPage(driver);
		searchOrderObj=new SearchListOrderPage(driver);
	}
	
	@Test(priority=18)
	public void searchOrderTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		searchOrderObj.searchListOrders();
		String txt=manageOrderObj.listOrderText();
		Assert.assertEquals(txt,"List Orders");
	}
	
	@Test(priority=19)
	public void searchListOrderTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		searchOrderObj.searchListOrders();
		searchOrderObj.searchOrders();
		String txt=searchOrderObj.searchOrderText();
		Assert.assertEquals(txt,"List Orders(1)");
		
	}
	
	@Test(priority=20)
	public void resetTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		searchOrderObj.searchListOrders();
		searchOrderObj.searchOrders();
		searchOrderObj.resetClick();
		String txt=manageOrderObj.listOrderText();
		Assert.assertEquals(txt,"List Orders");
	}
}
