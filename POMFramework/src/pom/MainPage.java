package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(xpath="(//span[@class='menu-text'])[1]")
	private WebElement aboutUs;

	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void mainPage() {
		aboutUs.click();
	}
}
