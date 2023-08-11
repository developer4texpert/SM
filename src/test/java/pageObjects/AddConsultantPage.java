package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddConsultantPage extends BasePage {

	public AddConsultantPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "MiddleName")
	private WebElement middleNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "PhoneNumber")
	private WebElement phoneNumberTextField;

	@FindBy(id = "AlternativeNumber")
	private WebElement alternativeNumberTextField;

	@FindBy(id = "SkypeId")
	private WebElement skypeIdTextField;

	@FindBy(id = "navigators")
	private WebElement dobDateField;

	@FindBy(className = "p-datepicker-month")
	private WebElement dobMonthDropDown;

	@FindBy(className = "p-datepicker-year")
	private WebElement dobYearDropDown;

	@FindBy(xpath = "//span[@class='p-datepicker-prev-icon pi pi-chevron-left ng-tns-c42-3']")
	private WebElement dobLeftArrow;

	@FindBy(xpath = "//span[@class='p-datepicker-next-icon pi pi-chevron-right ng-tns-c42-3']")
	private WebElement dobRightArrow;

	@FindBy(xpath = "//span[normalize-space()='17']")
	private WebElement dobDates;

	@FindBy(id = "SSN")
	private WebElement ssnTextField;

	@FindBy(id = "PassportNumber")
	private WebElement passportNumberTextField;

	@FindBy(id = "Address")
	private WebElement addressTextField;

	@FindBy(id = "City")
	private WebElement cityTextField;

	@FindBy(xpath = "(//span[@class='p-button-icon pi pi-chevron-down'])[1]")
	private WebElement stateDropDownButton;

	@FindBy(xpath = "//div/li")
	private List<WebElement> stateList;

	@FindBy(id = "Zipcode")
	private WebElement zipcodeTextField;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-chevron-down'])[2]")
	private WebElement educationDropDownButton;
	
	@FindBy(xpath="//div/ul[@role='listbox']//li")
	private List<WebElement> educationList;
	
	@FindBy(id="univerName")
	private WebElement universityNameTextField;
	
	@FindBy(id="Specialization")
	private WebElement specializationTextField;
	
	@FindBy(xpath="(//input)[@id='navigators'][2]")
	private WebElement passedOutDateField;
	
	@FindBy(xpath="(//div//select)[1]")
	private WebElement passedOutMonthDropDown;
	
	@FindBy(xpath="(//div//select)[2]")
	private WebElement passedOutYearDropDown;
	
	@FindBy(xpath="//span[normalize-space()='24']")
	private WebElement passedOutDate;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-chevron-down'])[3]")
	private WebElement skillDropDownButton;
	
	@FindBy(xpath="//div[@class='cdk-virtual-scroll-content-wrapper']/li")
	private List<WebElement> skillList;
	
	@FindBy(id="MinPayrate")
	private WebElement minimumPayRateTextField;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-chevron-down'])[4]")
	private WebElement priorityDropDownButton;
	
	@FindBy(xpath="//cdk-virtual-scroll-viewport//div/li")
	private List<WebElement> priorityList;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-chevron-down'])[5]")
	private WebElement visaStatusDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> visaStatusList;
	
	@FindBy(id="Preferred location")
	private WebElement preferredLocationTextField;
	
	@FindBy(xpath="(//input)[@id='navigators'][3]")
	private WebElement usEntryDateField;
	
	@FindBy(xpath="//div//select[1]")
	private WebElement usEntryDateMonthDropDown;
	
	@FindBy(xpath="//div//select[2]")
	private WebElement usEntryDateYearDropDown;
	
	@FindBy(xpath="//span[normalize-space()='11']")
	private WebElement usEntryDate;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-chevron-down'])[6]")
	private WebElement recruitersDropDownButton;
	
	@FindBy(xpath="//div[@class='cdk-virtual-scroll-content-wrapper']/li")
	private List<WebElement> recruitersList;
	
	@FindBy(xpath="//button[normalize-space()='CANCEL']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//span[normalize-space()='SAVE']")
	private WebElement saveButton;
	
	@FindBy(xpath="(//div[@role='alert']//div//div)[2]")
	private static WebElement addConultantSuccessMessage;
	
	
	

	// Action Methods

	public void enterFirstName(String firstName) {
		firstNameTextField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameTextField.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}

	public void enterPhoneNumber(String phoneNumber) {
		phoneNumberTextField.sendKeys(phoneNumber);
	}

	public void enterSkypeId(String skypeId) {
		skypeIdTextField.sendKeys(skypeId);
	}

	public void clickOnDOBDateTextField() {
		dobDateField.click();
	}

	public void clickOnDOBMonthDropDown(String month) {
		dobMonthDropDown.click();
		Select dobMonth = new Select(dobMonthDropDown);
		dobMonth.selectByVisibleText(month);
	}

	public void clickOnDOBYearDropDown(String year) {
		dobYearDropDown.click();
		Select dobYear = new Select(dobYearDropDown);
		dobYear.selectByVisibleText(year);
	}

	public void clickOnDOBDate() {
		dobDates.click();

	}

	public void enterSSNNumber(String ssnNumber) {
		ssnTextField.sendKeys(ssnNumber);
	}

	public void enterPassportNumber(String passport) {
		passportNumberTextField.sendKeys(passport);
	}

	public void enterAddress(String address) {
		addressTextField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityTextField.sendKeys(city);
	}

	public void clickOnStateDropDownButton(String state) {
		stateDropDownButton.click();
		for(WebElement selectState:stateList)
		{
			if(selectState.getText().equals(state))
			{
				selectState.click();
				break;
			}
		}
	}

	public void enterZipcode(String zipcode) {
		zipcodeTextField.sendKeys(zipcode);
	}
	
	public void clickOnEducationDropDownButton(String education)
	{
		educationDropDownButton.click();
		for(WebElement selectEducation:educationList)
		{
			if(selectEducation.getText().equals(education))
			{
				selectEducation.click();
				break;
				
			}
		}
	}
	
	public void enterUniversityName(String universityname)
	{
		universityNameTextField.sendKeys(universityname);
	}
	
	public void enterSpecialization(String specialization)
	{
		specializationTextField.sendKeys(specialization);
	}
	
	public void clickOnPassedOutDateField()
	{
		passedOutDateField.click();
	}
	
	public void clickOnPassedOutMonthDropDown(String month)
	{
		passedOutMonthDropDown.click();
		Select passedOutMonth=new Select(passedOutMonthDropDown);
		passedOutMonth.selectByVisibleText(month);
	}
	
	public void clickOnPassedOutYearDropDown(String year)
	{
		passedOutYearDropDown.click();
		Select passedOutYear=new Select(passedOutYearDropDown);
		passedOutYear.selectByVisibleText(year);
	}
	
	public void clickOnPassedOutDate()
	{
		passedOutDate.click();
	}
	
	public void clickOnSkillDropDownButton(String skill)
	{
		skillDropDownButton.click();
		for(WebElement selectSkill:skillList)
		{
			if(selectSkill.getText().equals(skill))
			{
				selectSkill.click();
				break;
			}
		}
		
	}
	
	public void enterMinimumPayRate(String payrate)
	{
		minimumPayRateTextField.sendKeys(payrate);
	}
	
	public void clickOnPriorityDropDownButton(String priority)
	{
		priorityDropDownButton.click();
		for(WebElement selectPriority:priorityList)
		{
			if(selectPriority.getText().equals(priority))
			{
				selectPriority.click();
				break;
			}
		}
	}
	
	public void clickOnVisaStatusDropDownButton(String visa)
	{
		visaStatusDropDownButton.click();
		for(WebElement selectVisa:visaStatusList)
		{
			if(selectVisa.getText().equals(visa))
			{
				selectVisa.click();
				break;
			}
		}
	}
	
	public void enterPreferredLocation(String preferredLocation)
	{
		preferredLocationTextField.sendKeys(preferredLocation);
	}
	
	public void clickOnUSEntryDateField()
	{
		usEntryDateField.click();
	}
	
	public void clickOnUSEntryMonthDropDown(String usMonth)
	{
		usEntryDateMonthDropDown.click();
		Select usEntryMonth = new Select(usEntryDateMonthDropDown);
		usEntryMonth.selectByVisibleText(usMonth);
	}
	
	public void clickOnUSEntryYearDropDown(String usYear)
	{
		usEntryDateYearDropDown.click();
		Select usEntryYear = new Select(usEntryDateYearDropDown);
		usEntryYear.selectByVisibleText(usYear);
	}
	
	public void clickOnUSEntryDate()
	{
		usEntryDate.click();
	}
	
	public void clickOnRecruiterDropDownButton(String recruiter)
	{
		recruitersDropDownButton.click();
		for(WebElement selectRecruiter:recruitersList)
		{
			if(selectRecruiter.getText().equals(recruiter))
			{
				selectRecruiter.click();
				break;
				
			}
		}
	}
	
	public void clickOnCancelButton()
	{
		cancelButton.click();
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public static String retrieveAddConsultantSuccessMessage()
	{
		String successText=addConultantSuccessMessage.getText();
		return successText;
	}
	
	
	
	
	

}
