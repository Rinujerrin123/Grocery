package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base 
{
	public WebDriver driver;
	
	public static Properties properties ;

 public Base()
 {
	properties = new Properties();
    File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");

    try {
        FileInputStream inputStream = new FileInputStream(file);

        properties.load(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
    } catch (FileNotFoundException fie) {
        fie.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

	@BeforeMethod
	public void setUp()
	{
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get(properties.getProperty("url")); 
	      driver.manage().window().maximize();
	     
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
}
