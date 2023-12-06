package page_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;
import utilities.page_utility;

public class qalegendProjectPage {
	
	public WebDriver driver;
	String excelFilePath="/src/main/resources/Test_Data/User_details.xlsx";

	@FindBy(xpath="//span[text()='Projects']")  
	WebElement projectModule;
	
	
	@FindBy(xpath="//span[text()='All Projects']")  
	WebElement AllprojectModule;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement projectSearch;
	
	@FindBy(xpath="//a[text()='Automation']")
	WebElement projectEntyy;
	
	@FindBy(xpath="//a[text()='Tasks List']")
	WebElement TaskList;
	
	@FindBy(xpath="(//div[@id='project-tasks-kanban-section']//preceding::a)[96]")
	WebElement addTask;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//span[text()='1 Point']")
	WebElement point;
	
	@FindBy(xpath="//a[text()='amazon']")
	WebElement save;
	
	@FindBy(xpath="//div[@id='select2-result-label-16']")
	WebElement poindrp;
	
	@FindBy(xpath="//span[@class='select2-chosen']")
	WebElement milestone;
	
	@FindBy(xpath="//div[@class='select2-result-label']")
	WebElement milestonedrp;
	
	@FindBy(xpath="//input[@name='start_date']")
	WebElement StartDate;
	
	@FindBy(xpath="//input[@name='deadline']")
	WebElement deadLine;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Savebtn;
	
	@FindBy(xpath="//input[@id='s2id_autogen12']")
	WebElement collaberator;
	
	@FindBy(xpath="//div[text()='Lekshmi Nair']")
	WebElement collaboratedrp;
	
	@FindBy(xpath="//input[@id='s2id_autogen10_search']")
	WebElement status;
	
	@FindBy(xpath="//div[text()='Done']")
	WebElement statusDrp;
	
	@FindBy(xpath="//div[@class='modal-body clearfix ps ps--active-y']")
	WebElement Projectmodal;
	
	@FindBy(xpath="//span[@class='select2-chosen']")
	WebElement assignField;
	
	@FindBy(xpath="//div[text()='Lekshmi Nair']")
	WebElement assignOpn;
	
	@FindBy(xpath="//a[text()='Testing']")
	WebElement assertField;


	
	
	
	
	
	public qalegendProjectPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement projectModuleTab() {
		
		return projectModule;		
	}
	
	public WebElement AllprojectModuleTab() {
		
		return AllprojectModule;
	}
	
	public WebElement projectSearchTab() {
		
		return projectSearch;
	}
	
	public boolean  projectEntrycheck() {
		
		boolean status=page_utility.isElementDisplayed(projectEntyy);
		return status;
	}
	
	public WebElement projectEntry() {
		
		return projectEntyy;
	}
	
	public void TaskListTab() {
		
		 page_utility.clickOnElement(TaskList);
		 
		
		
		
	}
	
	public void addTaskTab() {
		
		page_utility.clickOnElement(addTask);
	}
	
	public void titleField() throws IOException {
		
		
		page_utility.enterText(title,ExcelUtility.getString(0, 0, excelFilePath, "TaskTest"));
	}
	
	public void descriptionField() throws IOException {
		
		page_utility.enterText(description, ExcelUtility.getString(0, 1, excelFilePath, "TaskTest"));
	}
	
	public void pointField()
	{
		
		page_utility.clickOnElement(point);
	}
	
	public WebElement saveButton() {
		
		return save;
	}
	
	public void pointdrop() {
		
		page_utility.clickOnElement(poindrp);
	}
	
	public void milestoneField() {
		
		page_utility.clickOnElement(milestone);
	}
	
	public void milestoneSelect() {
		
		page_utility.clickOnElement(milestonedrp);
	}
	
	public WebElement StartDateField() {
		
		return StartDate;
	}
	
	public WebElement deadLineField() {
		
		return deadLine;
	}
	
	public WebElement SaveButtons() {
		
		return Savebtn;
	}
	public void clickOnSaveButtons() {
	page_utility.clickOnElement(Savebtn);
	}
	
	public void collaberatorField() {
		
		page_utility.clickOnElement(collaberator);
	}
	
	public void collaboratedOpn() {
		
		page_utility.clickOnElement(collaboratedrp);
	}
	
	public void statusField() {
		
		page_utility.clickOnElement(status);
	}
	
	public void statusOpn() {
		
		page_utility.clickOnElement(statusDrp);
	}
	
	public void clickProjectmodal() {
		
		page_utility.clickOnElement(Projectmodal);
	}
	
	public void clickassignField() {
		
		page_utility.clickOnElement(assignField);
	}
	
	public void clickAssignOpn() {
		
		page_utility.clickOnElement(assignOpn);
	}
	
	public void escapKeyPress() {
		
		page_utility.escpKeyPress(driver);
	}
	public boolean locateAssert() {
		
		boolean status=page_utility.isElementDisplayed(assertField);
		return status;
		
	}
}
