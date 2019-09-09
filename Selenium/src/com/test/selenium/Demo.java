package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/start/join?trk=guest_homepage-basic_nav-header-join");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("firstName")).sendKeys("qwerty");
		driver.findElement(By.id("join-email")).sendKeys("poiuyt");
		//	driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Sign in")).click();
		//	driver.close();
	}

}