package com.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.AddProductPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ManageOrderPage;
import com.qa.pages.ManageProductPage;

import junit.framework.Assert;

public class AddProductTest extends Base

{
	HomePage homeObj;
	LoginPage loginObj;
	ManageOrderPage  manageOrderObj;
	ManageProductPage  manageProductObj;
	AddProductPage  addProductObj;
	
	@BeforeMethod
	public void performlogin()
	{
		loginObj =new LoginPage(driver);
		homeObj = new HomePage(driver);
		loginObj.login("admin","admin");
		manageOrderObj=new ManageOrderPage(driver);
		manageProductObj=new ManageProductPage(driver);
		addProductObj=new AddProductPage(driver);
	}
	
	@Test(priority=31)
	public void addProductTest()
	{
		manageProductObj.manageProductMenuClicked();
		manageProductObj.newButtonClicked();
		addProductObj.addProduct();
	}
	
	
}
