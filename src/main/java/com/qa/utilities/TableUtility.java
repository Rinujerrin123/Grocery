package com.qa.utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableUtility 
{
	
	public static void main(String[] args)   
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Obsqura\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");

		WebElement mytable = driver.findElement(By.id("dtBasicExample"));
	
		List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));

		int rows_count = rows_table.size();
        for (int row = 0; row < rows_count; row++)
        {
    	   List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    		
			int columns_count = Columns_row.size();
			System.out.println("Number of cells In Row " + row + " are " + columns_count);

			for (int column = 0; column < columns_count; column++) 
			{
		
				String celtext = Columns_row.get(column).getText();
				System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
		     }
			System.out.println("-------------------------------------------------- ");
		}
	}

}
