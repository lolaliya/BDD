package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	@FindBy(linkText="5 Learning Theories in Psychology")
	private WebElement theorey;

	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchPage() {
		theorey.click();
	}
}
