package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;

public class AddProductPage extends Base
{

	
	public AddProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="title")
	WebElement  title;
	
	@FindBy(xpath="//input[@value='Nonveg']")
	WebElement  productType;
	
	@FindBy(name="tag")
	WebElement  tag;
	
	@FindBy(name="cat_id")
	WebElement  category;
	
	@FindBy(name="sub_id")
	WebElement  subCategory;
	
	@FindBy(name="grp_id")
	WebElement  groupId;
	
	@FindBy(xpath="//input[@value='piece']")
	WebElement  priceType;
	
	@FindBy(name="m_weight")
	WebElement  weightValue;
	
	@FindBy(name="w_unit")
	WebElement  weightUnit;
	
	@FindBy(name="max_weight")
	WebElement  maxQuantity;
	
	@FindBy(name="w_price")
	WebElement  price;
	
	@FindBy(name="w_mrp")
	WebElement  mrp;
	
	@FindBy(name="w_stock")
	WebElement  stockAvailability;
	
	@FindBy(name="w_pp")
	WebElement  purchase;
	
	@FindBy(name="unlimitw[]")
	WebElement  unlimitedStock;
	
	@FindBy(xpath="//div[@class='note-editable card-block']")
	WebElement  description;
	
	@FindBy(name="stock")
	WebElement  stock;
	
	@FindBy(name="main_img")
	WebElement  image;
	
	@FindBy(name="subfile[]")
	WebElement  subImage;
	
	@FindBy(name="featured")
	WebElement  featured;
	
	@FindBy(name="combo")
	WebElement  comboPack;
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement  saveButton;
	
	public void addProduct() 
	{
		WaitUtility.visibilityOfEleLocated(driver, title);
		PageUtility.sendInput(driver,title,"book");
		
		WaitUtility.visibilityOfEleLocated(driver, productType);
		PageUtility.click(driver, productType);
		
		
		WaitUtility.visibilityOfEleLocated(driver, tag);
		PageUtility.sendInput(driver,tag,"abcd");
		
		WaitUtility.visibilityOfEleLocated(driver, category);
		PageUtility.dropDown(driver, category, "Fruits & Vegetables");
		
		WaitUtility.visibilityOfEleLocated(driver, subCategory);
		PageUtility.dropDown(driver, subCategory, "Fruits");
		
		WaitUtility.visibilityOfEleLocated(driver, groupId);
		PageUtility.dropDown(driver, groupId, "Munnar Special");
		
		WaitUtility.visibilityOfEleLocated(driver, priceType);
		PageUtility.click(driver, priceType);
		
		WaitUtility.visibilityOfEleLocated(driver, weightValue);
		PageUtility.sendInput(driver,weightValue,"123");
		
		WaitUtility.visibilityOfEleLocated(driver, weightUnit);
		PageUtility.dropDown(driver, weightUnit, "g");
		
		WaitUtility.visibilityOfEleLocated(driver, maxQuantity);
		PageUtility.sendInput(driver,maxQuantity,"2");
		
		WaitUtility.visibilityOfEleLocated(driver, price);
		PageUtility.sendInput(driver,price,"200");
		
		WaitUtility.visibilityOfEleLocated(driver, mrp);
		PageUtility.sendInput(driver,mrp,"100");
		
		WaitUtility.visibilityOfEleLocated(driver, stockAvailability);
		PageUtility.sendInput(driver,stockAvailability,"2");
		
		WaitUtility.visibilityOfEleLocated(driver, purchase);
		PageUtility.sendInput(driver,purchase,"200");
		
		WaitUtility.visibilityOfEleLocated(driver, description);
		PageUtility.sendInput(driver,description,"avbbn");
		
		WaitUtility.visibilityOfEleLocated(driver, stock);
		PageUtility.click(driver, stock);
		
		WaitUtility.visibilityOfEleLocated(driver, featured);
		PageUtility.click(driver, featured);
		
		WaitUtility.visibilityOfEleLocated(driver, comboPack);
		PageUtility.click(driver, comboPack);
		
		WaitUtility.visibilityOfEleLocated(driver, saveButton);
		PageUtility.clickButton(driver, saveButton);
	}
}
