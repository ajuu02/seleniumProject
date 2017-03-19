package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Launch {
	WebDriver driver;
  @BeforeTest
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\NonBKU\\chromedriver.exe");
	  driver = new ChromeDriver();
	  //driver.get("http://www.google.com");
	  
	  driver.get("http://only-testing-blog.blogspot.in");
	  driver.manage().window().maximize();
  }
  @Test
  public void test1() {
	  String we = driver.findElement(By.className("title")).getText();
	  Assert.assertEquals("Only Testing", we);
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.quit();
  }
  
}
