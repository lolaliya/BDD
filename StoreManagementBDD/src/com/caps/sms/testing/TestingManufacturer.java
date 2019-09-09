package com.caps.sms.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingManufacturer {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:4200/");
	
	//Manufacturer Register

	driver.findElement(By.linkText("Home")).click();
	driver.findElement(By.xpath("//a[@routerlink='/manufacturerregister']")).click();
	driver.findElement(By.id("manufacturerName")).sendKeys("sindhu");
	driver.findElement(By.id("manufacturerContactNo")).sendKeys("1236547895");
	driver.findElement(By.id("manufacturerLocation")).sendKeys("udupi");
	driver.findElement(By.id("manufacturerPassword")).sendKeys("rOOt2");
	WebElement element = driver.findElement(By.xpath("//input[@value='Register']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
	Thread.sleep(3000);
	
	//Manufacturer Login
	
	driver.findElement(By.xpath("//a[.='Manufacturer_Login']")).click();
	driver.findElement(By.xpath("//input[@id='manufacturerId']")).sendKeys("4");
	driver.findElement(By.xpath("//input[@id='manufacturerPassword']")).sendKeys("RuuT1234");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	
	//Products

	driver.findElement(By.xpath("//a[.='Products']")).click();
	driver.findElement(By.xpath("//input[@id='manufacturerId']")).sendKeys("4");
	driver.findElement(By.xpath("//input[@id='productname']")).sendKeys("Soap");
	driver.findElement(By.xpath("//input[@id='productprice']")).sendKeys("356");
	driver.findElement(By.xpath("//input[@id='productstock']")).sendKeys("100");
	WebElement elements = driver.findElement(By.xpath("//input[@value='Add']"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(elements).click().build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Get All Products']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[.='Home']")).click();
	
}
}
