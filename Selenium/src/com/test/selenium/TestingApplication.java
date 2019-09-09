package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/drive/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Go to Google Drive")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lokagangadkar1710@gmail.com");	
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nisargac@17");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='Next'])[1]")).click();
		

	}

}
