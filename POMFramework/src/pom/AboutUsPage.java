package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage {

	@FindBy(xpath="(//span[@class='menu-text'])[2]")
	private WebElement aboutUs;

	public AboutUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void aboutUs()
	{
		aboutUs.click();
	}

}
