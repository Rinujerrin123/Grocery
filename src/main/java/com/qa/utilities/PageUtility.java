package com.qa.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
  
	public static boolean isElementDisplayed(WebElement ele)
	{
		boolean eledisplayed=ele.isDisplayed();
		return eledisplayed;
	}
	
	public static String getText(WebElement ele)
	{
	    String text=ele.getText();
	    return text;
	}
	
	public static  void sendInput(WebDriver driver,WebElement ele,String text)
    {
    	WaitUtility.visibilityOfEleLocated(driver,ele);
    	ele.clear();
    	ele.sendKeys(text);
    }
    
    public static void clickButton(WebDriver driver,WebElement ele)
    {
    	WaitUtility.visibilityOfEleLocated(driver,ele);
    	ele.click();
    }
    
    public static void dropDown(WebDriver driver,WebElement ele,String text)
    {
    	
	    WaitUtility.visibilityOfEleLocated(driver,ele);
	    Select select=new Select(ele);
	    select.selectByVisibleText(text);
    
    }
    
    public static void cancelAlertMessage(WebDriver driver)
    {
    	Alert alert=driver.switchTo().alert();
	    alert.dismiss();
    }
    
    public static void deleteAlertMessage(WebDriver driver)
    {
    	Alert alert=driver.switchTo().alert();
	    alert.accept();
    }
    
    public static void actionClass(WebDriver driver,WebElement ele)
    {
    	Actions action = new Actions(driver);
    	action.doubleClick(ele).perform();
    }  
  
    public static void scroll(WebDriver driver,WebElement ele)
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");  
    } 
    public static void quit(WebDriver driver)
    {
    	driver.quit();
    } 
    
    public static  void click(WebDriver driver,WebElement ele)
    {
    	WaitUtility.visibilityOfEleLocated(driver,ele);
    	ele.click();
    }
}
