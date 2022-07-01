package sagesserag._crm_web;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testAddProduct {

	@Test
	public void test() {

        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver=new ChromeDriver(options);
        
        driver.get("http://localhost:7070/");
        
        driver.findElement(By.xpath("//a[contains(@href, '/products')]")).click();
        driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Eine Beschreibung");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		/* List<WebElement> result = driver.findElements(By.xpath("//span"));
		Assert.assertEquals("Firstname: Cheyenne", result.get(0).getText()); */
		 
		boolean id = driver.getPageSource().contains("Id 0");
		boolean beschreibung = driver.getPageSource().contains("Description: Eine Beschreibung");

		Assert.assertTrue(id);
		Assert.assertTrue(beschreibung);

		driver.close(); //close driver window
	}

}
