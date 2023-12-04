package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegndHomePage {

	WebDriver driver;
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashBoardBtn;
	
	
	
	
	
	public qalegndHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public WebElement dashBoardButton()
	{
		
		return dashBoardBtn;
	}
	
	public boolean dashboardAssert() {
		
		boolean status=page_utility.isElementDisplayed(dashBoardBtn);
		return status;
		
	}
	
	
}
