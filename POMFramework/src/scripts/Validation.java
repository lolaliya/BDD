package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AboutUsPage;
import pom.HomePage;
import pom.MainPage;
import pom.SearchPage;

public class Validation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online-psychology-degrees.org/top-10-introductory-psychology-books-for-students/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(("//span[.='About Us'])[1])")));	
		//driver.findElement(By.xpath(("//input[@class='searchsubmit'])[2]"));
		
		//driver.findElement(By.linkText("5 Learning Theories in Psychology"));
	
	///	driver.findElement(By.xpath("(//span[@class='menu-text'])[2]"));		//About Us
		
	//	driver.findElement(By.xpath("(//span[@class='menu-text'])[1]"));		//Home


		AboutUsPage about = new AboutUsPage(driver);
		HomePage homePage = new HomePage(driver);
		MainPage mainPage = new MainPage(driver);
		SearchPage searchPage = new SearchPage(driver);
		
		homePage.homePage();
		searchPage.searchPage();
		about.aboutUs();
		mainPage.mainPage();
		
	}

}
