package com.qa.testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ManageOrderPage;
import com.qa.pages.ManageProductPage;
import com.qa.utilities.ScreenShotUtility;

import junit.framework.Assert;



public class ManageProductTest extends Base
{
	HomePage homeObj;
	LoginPage loginObj;
	ManageOrderPage  manageOrderObj;
	ManageProductPage  manageProductObj;
	
	@BeforeMethod
	public void performlogin()
	{
		loginObj =new LoginPage(driver);
		homeObj = new HomePage(driver);
		loginObj.login("admin","admin");
		manageOrderObj=new ManageOrderPage(driver);
		manageProductObj=new ManageProductPage(driver);
	}
	
	@Test(priority=21)
	public void manageProductTest()
	{
		manageProductObj.manageProductMenuClicked();
		
		String txt=manageProductObj.listProductText();
		Assert.assertEquals(txt,"List Products");
		
		String methodname=new Object() {}
        .getClass()
        .getEnclosingMethod()
        .getName();

    	ScreenShotUtility.screenshot(driver,methodname);
	}
	
	@Test(priority=22)
	public void newButtonTest()
	{
		manageProductObj.manageProductMenuClicked();
		boolean newButton=manageProductObj.isNewButtonDisplayed();
		Assert.assertTrue(newButton);
	}
	
	@Test(priority=23)
	public void searchButtonTest()
	{
		manageProductObj.manageProductMenuClicked();
		boolean searchButton=manageProductObj.isSearchButtonDisplayed();
		Assert.assertTrue(searchButton);
	}
	
	
	
	@Test(priority=24)
	public void newButtonClickTest()
	{
	manageProductObj.manageProductMenuClicked();
	manageProductObj.newButtonClicked();	
	
	
	String txt=manageProductObj.addProductText();
	Assert.assertEquals(txt,"Add Product");
	
	}
	
	@Test(priority=25)
	public void viewActionTest()
	{
		manageProductObj.manageProductMenuClicked();
		boolean viewAction=manageProductObj.isViewButtonDisplayed();
		Assert.assertTrue(viewAction);
	}
	
	@Test(priority=26)
	public void deleteActionTest()
	{
		manageProductObj.manageProductMenuClicked();
		boolean deleteAction=manageProductObj.isDeleteButtonDisplayed();
		Assert.assertTrue(deleteAction);
	}
	
	@Test(priority=27)
	public void viewTest()
	{
		manageProductObj.manageProductMenuClicked();
		manageProductObj.viewActionPage();
		
		String txt=manageProductObj.editProductText();
		Assert.assertEquals(txt,"Edit Product");
	}
	
	@Test(priority=28)
	public void homeButtonTest()
	{
		manageProductObj.manageProductMenuClicked();
		manageProductObj.viewActionPage();
		manageProductObj.homeClick();
		manageProductObj.manageProductMenuClicked();
		
		String txt=homeObj.txtDisplayed();
		Assert.assertEquals(txt, "7rmart supermarket");
	}
	
	
	@Test(priority=30)
	public void cancelProductTest()
	{
		manageProductObj.manageProductMenuClicked();
		manageProductObj.deletePopupDisplay();
		manageProductObj.cancelProduct();
		
		String txt=manageProductObj.listProductText();
		Assert.assertEquals(txt,"List Products");
	}
	
	/*@Test(priority=11)
	public void deleteOrderTest()
	{
		manageProductObj.deletePopupDisplay();
		manageProductObj.deleteOrder();
	}*/
	
	
	
}
