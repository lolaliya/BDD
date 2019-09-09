package com.caps.sms.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingDealer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.xpath("//a[.='Dealer_Register']")).click();
		driver.findElement(By.xpath("//input[@id='dealerName']")).sendKeys("Ajith");
		driver.findElement(By.xpath("//input[@id='dealerContactNo']")).sendKeys("9632587419");
		driver.findElement(By.xpath("//input[@id='dealerLocation']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='dealerPassword']")).sendKeys("RooT12345");
		WebElement element = driver.findElement(By.xpath("//input[@value='Register']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//a[.='Dealer_Login']")).click();
		driver.findElement(By.xpath("//input[@id='dealerId']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='dealerPassword']")).sendKeys("RooT1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);


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
		//		Actions action = new Actions(driver);
		//		action.moveToElement(elements).click(); //build().perform();
		//		Thread.sleep(3000);
	}
}
