package com.framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class anatation {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("(//a[@class='d-flex'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("phone_number")).sendKeys("9493450243");
		driver.findElement(By.id("password")).sendKeys(";lkjhgh");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/div[4]/button")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://halalfull.com/");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
		driver.quit();
  }

}
