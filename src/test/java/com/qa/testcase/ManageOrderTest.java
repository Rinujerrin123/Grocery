package com.qa.testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ManageOrderPage;

import junit.framework.Assert;

public class ManageOrderTest extends Base
{
	HomePage homeObj;
	LoginPage loginObj;
	ManageOrderPage  manageOrderObj;
	
	@BeforeMethod
	public void performlogin()
	{
		loginObj =new LoginPage(driver);
		homeObj = new HomePage(driver);
		loginObj.login("admin","admin");
		manageOrderObj=new ManageOrderPage(driver);
	}
	
	@Test(priority=9)
	public void  manageOrderTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		String txt=manageOrderObj.listOrderText();
		Assert.assertEquals(txt,"List Orders");
	}
	
	@Test(priority=10)
	public void viewActionTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		boolean viewAction=manageOrderObj.isViewButtonDisplayed();
		Assert.assertTrue(viewAction);
	}
	
	@Test(priority=11)
	public void deleteActionTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		boolean deleteAction=manageOrderObj.isDeleteButtonDisplayed();
		Assert.assertTrue(deleteAction);
	}
	
	@Test(priority=12)
	public void viewTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		manageOrderObj.viewActionPage();
		String txt=manageOrderObj.orderDetailsText();
		Assert.assertEquals(txt,"Order Details");
	}
	
	@Test(priority=13)
	public void homeButtonTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		manageOrderObj.viewActionPage();
		manageOrderObj.homePageClick();
		String txt=homeObj.txtDisplayed();
		Assert.assertEquals(txt, "7rmart supermarket");
	}
	
	/*@Test(priority=14)
	public void deleteOrderTest()
	{
		manageOrderObj.deletePopupDisplay();
		manageOrderObj.deleteOrder();
		String txt=manageOrderObj.orderDetailsText();
		Assert.assertEquals(txt,"Order Details");
	}*/
	
	@Test(priority=15)
	public void cancelOrderTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		manageOrderObj.deletePopupDisplay();
		manageOrderObj.cancelOrder();
		String txt=manageOrderObj.listOrderText();
		Assert.assertEquals(txt,"List Orders");
	}
	
	
	
	@Test(priority=17)
	public void searchButtonTest()
	{
		manageOrderObj.manageOrderMenuClicked();
		boolean searchButton=manageOrderObj.isSearchButtonDisplayed();
		Assert.assertTrue(searchButton);
	}
	
	/*
	public void closeTest()
	{
		manageOrderObj.closeBrowser();
	}*/
	}
