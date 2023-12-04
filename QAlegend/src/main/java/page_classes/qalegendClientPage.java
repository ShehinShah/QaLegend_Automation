package page_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelUtility;
import utilities.page_utility;

public class qalegendClientPage {
	
	public WebDriver driver;
	String excelFilePath="/src/main/resources/Test_Data/User_details.xlsx";
	@FindBy(xpath="//span[text()='Clients']")
	WebElement clientTb;
	
	@FindBy(xpath="//a[text()=' Add client']")
	WebElement addBtn;
	
	@FindBy(xpath="//div[@class='form-group']//input")
	WebElement CompanyName;
	
	@FindBy(xpath="//div[@class='form-group'][2]//textarea")
	WebElement addresss;
	
	@FindBy(xpath="//div[@class='form-group'][3]//input")
	WebElement  city;
	
	@FindBy(xpath="//div[@class='form-group'][4]//input")
	WebElement  state;
	
	@FindBy(xpath="//div[@class='form-group'][5]//input")
	WebElement zip;
	
	@FindBy(xpath="//div[@class='form-group'][6]//input")
	WebElement country;
	
	@FindBy(xpath="//div[@class='form-group'][7]//input")
	WebElement phone;
	
	@FindBy(xpath="//div[@class='form-group'][8]//input")
	WebElement webSite;
	
	@FindBy(xpath="//div[@class='form-group'][9]//input")
	WebElement vat;
	
	@FindBy(xpath="//div[@class='form-group'][10]//input")
	WebElement clientgroup;
	
	@FindBy(xpath="//span[text()='Keep it blank to use the default (USD)']")
	WebElement currency;
	
	@FindBy(xpath="//div[@class='form-group'][12]//input")
	WebElement currencySymbol;
	
	@FindBy(xpath="//div[@class='form-group'][13]//label")
	WebElement onlinePayment ;
	
	@FindBy(xpath="//div[@class='form-group'][13]//input")
	WebElement checkBox ;
	
	@FindBy(xpath="//div[@id='ajaxModalContent']//div[1]")
	WebElement modal;
	
	@FindBy(xpath="//div[@id='select2-result-label-200']")
	WebElement currency_drp;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	@FindBy(xpath="//div[@id='client-table_filter']//input")
	WebElement search;
	
	@FindBy(xpath="//a[text()='ABC limited'][1]")
	WebElement clientName;
	
	@FindBy(xpath="//li[@class='active']//a")
	WebElement clientContact;
	
	@FindBy(xpath="//a[text()='Projects']") 
	WebElement Project;
	
	@FindBy(xpath=("//a[@title='Add project']"))
	WebElement addProject;
	
	@FindBy(xpath="//div[@class=' col-md-9']//input[1]")
	WebElement title;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//input[@name='start_date']")  
	WebElement startDate;
	
	@FindBy(xpath="//input[@name='deadline']")
	WebElement deadline;
	
	@FindBy(xpath="//input[@name='price']")
	WebElement price;
	
	@FindBy(xpath="//input[@id='s2id_autogen5']")
	WebElement label;
	
	@FindBy(xpath="//span[@class='select2-match']")
	WebElement labelOption;
	
	@FindBy(xpath="//div[text()='AUD']")
	WebElement currencyOpn;
	
	

	
public qalegendClientPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


public void clientTab() {
	
	page_utility.clickOnElement(clientTb);
}

public void addButtonTab() {
	
	page_utility.clickOnElement(addBtn);
}

public void clicOnAddButton() {
	
	page_utility.clickOnElement(addBtn);
}

public boolean companyNameFileld() {
	
	boolean status=page_utility.isElementDisplayed(CompanyName);
	return status;
	
}

public void EntercompanyNameFileld() throws IOException {
	
	page_utility.enterText(CompanyName, ExcelUtility.getString(1, 0, excelFilePath, "Client_detail"));
}

public boolean addressField() {
	
	boolean status1=page_utility.isElementDisplayed(addresss);
	return status1;
	
}

public void EnteraddressField() throws IOException {
	
	page_utility.enterText(addresss, ExcelUtility.getString(1, 1, excelFilePath, "Client_detail"));
}

public boolean cityField() {
	
	boolean status2=page_utility.isElementDisplayed(city);
	return status2;
	
}

public void EntercityField() throws IOException {
	
	page_utility.enterText(city, ExcelUtility.getString(1, 2, excelFilePath, "Client_detail"));
}

public boolean stateField() {
	
	boolean status3=page_utility.isElementDisplayed(state);
	return status3;
	
}

public void EnterstateField() throws IOException {
	
	page_utility.enterText(state, ExcelUtility.getString(1, 3, excelFilePath, "Client_detail"));
}

public boolean zipField() {
	
	boolean status4=page_utility.isElementDisplayed(zip);
	return status4;
	
}

public void EnterzipField() throws IOException {
	
	page_utility.enterText(zip, ExcelUtility.getNumeric(1, 4, excelFilePath, "Client_detail"));
}

public boolean countryField() {
	
	boolean status5=page_utility.isElementDisplayed(country);
	return status5;
	
}

public void EntercountryField() throws IOException {
	
	page_utility.enterText(country, ExcelUtility.getString(1, 5, excelFilePath, "Client_detail"));
}

public boolean phoneField() {
	
	boolean status6=page_utility.isElementDisplayed(phone);
	return status6;
	
}

public void EnterphoneField() throws IOException {
	
	page_utility.enterText(phone, ExcelUtility.getNumeric(1, 6, excelFilePath, "Client_detail"));
}

public boolean websiteField() {
	
	boolean status7=page_utility.isElementDisplayed(webSite);
	return status7;
	
}

public void EnterwebsiteField() throws IOException {
	
	page_utility.enterText(webSite, ExcelUtility.getString(1, 7, excelFilePath, "Client_detail"));
}

public boolean vatField() {
	
	
	boolean status8=page_utility.isElementDisplayed(vat);
	return status8;
	
}

public void EntervatField1() throws IOException {
	
	page_utility.enterText(vat, ExcelUtility.getNumeric(1, 8, excelFilePath, "Client_detail"));
}



public boolean clientField() {
	
	boolean status9=page_utility.isElementDisplayed(clientgroup);
	return status9;
	
}

public void EnterclientField() throws IOException {
	
	page_utility.enterText(clientgroup, ExcelUtility.getString(1, 9, excelFilePath, "Client_detail"));
}

public boolean currencyField() {
	
	boolean status10=page_utility.isElementDisplayed(currency);
	return status10;
	
}

public void EntercurrencyField() {
	
	page_utility.clickOnElement(currency);  
}


public void EnterCurropn() {
	
	page_utility.clickOnElement(currencyOpn); 
}
public boolean currencySymbolField() {
	
	boolean status11=page_utility.isElementDisplayed(currencySymbol);
	return status11;
	
}

public void EntercurrencySymbolField() throws IOException {
	
	page_utility.enterText(currencySymbol, ExcelUtility.getString(1, 10, excelFilePath, "Client_detail"));
}

public boolean onlinePaymentField() {
	
	boolean status12=page_utility.isElementDisplayed(onlinePayment);
	return status12;

}



public boolean checkBoxField() {
	
	boolean status13=page_utility.isElementDisplayed(checkBox);
	return status13;
	
}

public void ScrollcheckBoxField() {
	
	page_utility.scrollToFindElement(driver,checkBox);
}

public void clickCheckBoxField(){
	
	page_utility.clickOnElement(checkBox);
}

public WebElement modalField() {
	
	
	return modal;
}

public WebElement currency_drpdown() {
	
	return currency_drp;
}


public void clickSaveButton() {
	
	page_utility.clickOnElement(save);
}

public WebElement clientSearch() {
	
	return search;
}

public WebElement clientNameSearch() {
	
	return clientName;
}

public WebElement clientContactTab() {
	
	return clientContact;
}

public WebElement projectTab() {
	
	return Project;
}

public WebElement addProjectTab() {
	
	return addProject;
}

public WebElement titleField() {
	
	return title;
}

public WebElement descriptionField() {
	
	return description;
}

public WebElement priceField() {
	
	return price;
}

public WebElement labelField() {
	
	return label;
}


public void clickOnClientTab() {

 page_utility.clickOnElement(clientTb);

}

public WebElement startDateField() {
	
	return startDate;
}

public WebElement deadLineField() {
	
	return deadline;
}

public void labelOptionField() {
	
	page_utility.clickOnElement(labelOption);
}

}