package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegndLoginPage {

	WebDriver driver ;
	@FindBy(name="email")
	WebElement username_field;
	
	@FindBy(name="password")
	WebElement password_fileld;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement  Sign_in_btn;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	WebElement forgetPwd;
	
	@FindBy(xpath="//h2[text()='Forgot password?']")
	
	WebElement forgetPwdPage;
	
	@FindBy(xpath="//span[text()='Authentication failed!']")
	WebElement failed;
	
	
public qalegndLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}




public WebElement LoginUsernameField()	{
	
	return username_field;
}


public WebElement LoginPasswordField() {
	
	return password_fileld;
}
	
public void SigninButton() {
	
	page_utility.clickOnElement(Sign_in_btn); 
}

public void forgetPwdField() {
	
	page_utility.clickOnElement(forgetPwd);
	
}

public WebElement forgetPwdPageFileld() {
	
	return forgetPwdPage;
}

public boolean forgetPwdPageFileldAssert() {
	
	boolean status =page_utility.isElementDisplayed(forgetPwdPage);
	return status;
}

public boolean  faildMsg() {
	
	boolean status=page_utility.isElementDisplayed(failed);
	return status;
}

public void userLogin(String userName, String Password) {
	
	page_utility.enterText(username_field, userName);
	page_utility.enterText(password_fileld, Password);
	page_utility.clickOnElement(Sign_in_btn);
}
}
