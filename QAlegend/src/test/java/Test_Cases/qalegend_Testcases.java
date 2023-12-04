/**
 * 
 */
package Test_Cases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Automation_Core.Base_Class;
import page_classes.qalegendClientPage;
import page_classes.qalegendProjectPage;
import page_classes.qalegndHomePage;
import page_classes.qalegndLoginPage;
import page_classes.timeSheet;
import utilities.ExcelUtility;
import utilities.page_utility;

/**
 * 
 */
public class qalegend_Testcases extends Base_Class {
	public WebDriver driver;
	qalegndLoginPage login_page;
	qalegndHomePage homePage;
	qalegendProjectPage projectPage;
	qalegendClientPage clientPage;
	timeSheet timesheetpage;
	public static Properties prop;
	String excelFilePath="/src/main/resources/Test_Data/User_details.xlsx";
	FileInputStream fs;
	@BeforeMethod
	@Parameters  ({"browser"}) 
	public void intialization(String Browser_name) throws Exception

	{
	driver=browserInstialization(Browser_name);
	login_page= new qalegndLoginPage(driver);
	homePage= new qalegndHomePage(driver);
	clientPage=new qalegendClientPage(driver);
	projectPage=new  qalegendProjectPage(driver);
	timesheetpage=new timeSheet(driver);
	
		prop = new Properties();
		//fs =new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\QAlegend\\src\\main\\resources\\Test_Data\\TestData.properties");
		fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Test_Data\\TestData.properties");
		prop.load(fs);
		driver.get(prop.getProperty("URL"));
				
}
	
	
	
	
	@Test	
	public void tc01() throws IOException {
		
		login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"),ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
		login_page.SigninButton();
		boolean status=homePage.dashboardAssert();
		Assert.assertEquals(status, true);
		
	}
	
	@Test
	
	
	public void tc02() throws IOException {
		
		login_page.userLogin(ExcelUtility.getString(2, 0, excelFilePath, "Users"),ExcelUtility.getNumeric(2, 1, excelFilePath, "Users"));
		login_page.SigninButton();
		Boolean status=login_page.faildMsg();
		Assert.assertEquals(status, true);
		
	}
	
@Test
	
	public void tc03() {
		
	login_page.forgetPwdField();
	boolean status=login_page.forgetPwdPageFileldAssert();
	Assert.assertEquals(status, true);
	}


@Test

public void tc04() throws IOException {
	login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"), ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
	clientPage.clientTab();
	clientPage.addButtonTab();
	boolean status=clientPage.companyNameFileld();
	Assert.assertEquals(status, true);
	boolean status1=clientPage.addressField();
	Assert.assertEquals(status1, true);
	boolean status2=clientPage.cityField();
	Assert.assertEquals(status2, true);
	boolean status3=clientPage.stateField();
	Assert.assertEquals(status3, true);
	boolean status4=clientPage.zipField();
	Assert.assertEquals(status4, true);
	boolean status5=clientPage.countryField();
	Assert.assertEquals(status5, true);
	boolean status6=clientPage.phoneField();
	Assert.assertEquals(status6, true);
	boolean status7=clientPage.websiteField();
	Assert.assertEquals(status7, true);
	page_utility.clickOnElement(clientPage.modalField());
	//page_utility.ScrollBy(driver);
	clientPage.ScrollcheckBoxField();
	boolean status8=clientPage.vatField();
	Assert.assertEquals(status8, true);
	boolean status9=clientPage.clientField();
	Assert.assertEquals(status9, true);
	boolean status10=clientPage.currencyField();
	Assert.assertEquals(status10, true);
	boolean status11=clientPage.currencySymbolField();
	Assert.assertEquals(status11, true);
	boolean status12=clientPage.onlinePaymentField();
	Assert.assertEquals(status12, true);
	boolean status13=clientPage.checkBoxField();
	Assert.assertEquals(status13, true);
	
	
}
@Test
public void tc05() throws IOException {
	login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"), ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
	clientPage.clickOnClientTab();
	clientPage.clicOnAddButton();
	clientPage.EntercompanyNameFileld();
	clientPage.EnteraddressField();
	clientPage.EntercityField();
	clientPage.EnterstateField();
	clientPage.EnterzipField();
	clientPage.EntercountryField();
	clientPage.EnterphoneField();
	clientPage.EnterwebsiteField();
	page_utility.clickOnElement(clientPage.modalField());
	clientPage.ScrollcheckBoxField();
	clientPage.EntervatField1();
	clientPage.EnterclientField();
	clientPage.EntercurrencyField();
	clientPage.EnterCurropn();
	clientPage.EntercurrencySymbolField();
	clientPage.clickCheckBoxField();
	clientPage.clickSaveButton();
	
}

@Test
public void tc06() throws IOException {
	login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"), ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
	clientPage.clickOnClientTab();
	page_utility.enterText(clientPage.clientSearch(), ExcelUtility.getString(1, 0, excelFilePath, "Client_detail"));
	page_utility.clickOnElement(clientPage.clientNameSearch());
	page_utility.isElementDisplayed(clientPage.clientContactTab());
}

@Test

public void tc07() throws IOException {
	login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"), ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
	clientPage.clickOnClientTab();
	page_utility.enterText(clientPage.clientSearch(), ExcelUtility.getString(1, 0, excelFilePath, "Client_detail"));
	page_utility.clickOnElement(clientPage.clientNameSearch());
	page_utility.clickOnElement(clientPage.projectTab());
	page_utility.clickOnElement(clientPage.addProjectTab());
	page_utility.enterText(clientPage.titleField(), ExcelUtility.getString(1, 0, excelFilePath, "Project_details"));
	page_utility.enterText(clientPage.descriptionField(), ExcelUtility.getString(1, 1, excelFilePath, "Project_details"));
	page_utility.enterText(clientPage.startDateField(), prop.getProperty("Start_Date"));
	page_utility.enterText(clientPage.deadLineField(), prop.getProperty("End_Date"));
	page_utility.enterText(clientPage.priceField(), ExcelUtility.getNumeric(1, 2, excelFilePath, "Project_details"));
	page_utility.enterText(clientPage.labelField(), ExcelUtility.getString(1, 3, excelFilePath, "Project_details"));
	clientPage.labelOptionField();  
	clientPage.clickSaveButton();
	
}

@Test

public void tc08() throws IOException {
	login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"), ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
	page_utility.clickOnElement(projectPage.projectModuleTab());
	page_utility.clickOnElement(projectPage.AllprojectModuleTab());
	boolean status14=projectPage.projectEntrycheck();
	Assert.assertEquals(status14, true);
}

@Test

public void tc09() throws IOException
{
	
	login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"), ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
	page_utility.clickOnElement(projectPage.projectModuleTab());
	page_utility.clickOnElement(projectPage.AllprojectModuleTab());
	page_utility.scrollToFindElement(driver,projectPage.projectEntry() );
	page_utility.clickOnElement(projectPage.projectEntry());
	projectPage.TaskListTab();
	projectPage.addTaskTab();
	projectPage.titleField();
	projectPage.descriptionField();
	projectPage.pointField();
	projectPage.pointdrop(); 
	projectPage.collaberatorField();
	projectPage.collaboratedOpn();
	projectPage.clickProjectmodal();  
	page_utility.scrollToFindElement(driver,projectPage.deadLineField());
	page_utility.enterText(projectPage.StartDateField(), prop.getProperty("Start_Date")); // not scrolling so element not locating
	projectPage.escapKeyPress();
	page_utility.enterText(projectPage.deadLineField(), prop.getProperty("End_Date"));
	projectPage.escapKeyPress();
	projectPage.clickOnSaveButtons();
	
}

@Test

public void tc10() throws IOException
{
	
	login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"), ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
	page_utility.clickOnElement(projectPage.projectModuleTab());
	page_utility.clickOnElement(projectPage.AllprojectModuleTab());
	page_utility.scrollToFindElement(driver,projectPage.projectEntry() );
	page_utility.clickOnElement(projectPage.projectEntry());
	timesheetpage.TimeSheetTabs();
	timesheetpage.logTimeButton();
	page_utility.enterText(timesheetpage.startDateField(), prop.getProperty("Start_Date"));
	timesheetpage.escapKeyPress();
	page_utility.enterText(timesheetpage.endDateField(), prop.getProperty("End_Date"));
	timesheetpage.escapKeyPress();
	timesheetpage.enterStartTime(prop.getProperty("Start_time"));
	timesheetpage.escapKeyPress();	
	timesheetpage.EnterendtimeField( prop.getProperty("End_time"));  //not able to locate
	timesheetpage.escapKeyPress();
	timesheetpage.bodyclck();
	page_utility.enterText(timesheetpage.noteField(), ExcelUtility.getString(1, 3, excelFilePath, "Project_details"));
	timesheetpage.clickOnTaskField();
	timesheetpage.enterTextinTaskOpn();
	timesheetpage.Savebutton();


}

}
