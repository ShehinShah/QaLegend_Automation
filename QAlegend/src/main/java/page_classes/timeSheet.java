package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class timeSheet {
	
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()=' Timesheets']")
	WebElement TimeSheetTab;
	
	@FindBy(xpath="//a[@title='Log time']")
	WebElement logTime;
	
	@FindBy(xpath="//input[@name='start_date']")
	WebElement startDate;
	
	
	@FindBy(xpath="//input[@name='start_time']")
	WebElement startTime;
	
	@FindBy(xpath="//input[@name='end_date']")
	WebElement endDate;
	
	@FindBy(xpath="//input[@name='end_time']")  
	WebElement endTime;
	
	
	@FindBy(xpath="//textarea[@id='note']")
	WebElement notes;
	
	@FindBy(xpath="(//span[@class='select2-chosen'])[4]")   //span[text()='Task']
	WebElement Task;  
	
	@FindBy(xpath="//div[text()='- Task -']")
	WebElement Taskdrp;
	
	@FindBy(xpath="//button[text()=' Save']")
	WebElement Savebtn;
	
	@FindBy(xpath="(//a[text()=' Lekshmi Nair'])[2]")
	WebElement assertField;
	
	

	public timeSheet(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	public void TimeSheetTabs(){
		
		page_utility.clickOnElement(TimeSheetTab);
	}
	
	public void logTimeButton() {
		
		page_utility.clickOnElement(logTime);
	}
	
	public WebElement startDateField() {
		
		return startDate;
	}
	public void escapKeyPress() {
		
		page_utility.escpKeyPress(driver);
	}
	
	public WebElement StartTimeField() {
		
		return startTime;
	}
	
	public void enterStartTime(String Time) {
	
	page_utility.clearText(StartTimeField());	
	page_utility.enterText(StartTimeField(),Time );
	
	}
	
	public WebElement endDateField() {
		
		return endDate;
	}
	
	public void EnterendtimeField(String Time) {
		page_utility.clearText(endTime);
		page_utility.enterText(endTime,Time);
	}
	
	
	
	
	public WebElement noteField() {
		
		return notes;
	}
	
	public void clickOnTaskField()
	{
		
		page_utility.clickOnElement(Task);
	}	
	
	public void enterTextinTaskOpn() {
		
		page_utility.clickOnElement(Taskdrp);
	}
	
	public void Savebutton() {
		
		page_utility.clickOnElement(Savebtn);
	}
	
	public boolean assertFieldlocate()
	{
		
		boolean status =page_utility.isElementDisplayed(assertField);
		return status;
	}	
	
}
