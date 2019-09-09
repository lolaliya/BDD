package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="(//input[@class='s'])[2]")
	private WebElement search;

	@FindBy(xpath="(//input[@class='searchsubmit'])[2]")
	private WebElement searchLink;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void homePage()
	{
		search.sendKeys("child and adolescent counciling");
		searchLink.click();
	}

}
