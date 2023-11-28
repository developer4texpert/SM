package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewSchedulePage extends BasePage{

	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	public InterviewSchedulePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//button[@class='p-element p-ripple p-autocomplete-dropdown ng-tns-c50-4 p-button p-component p-button-icon-only ng-star-inserted']")
	private WebElement chooseConsultantDropDownButton;
	
	@FindBy(xpath="//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c50-4 p-autocomplete-panel p-component ng-star-inserted']//ul//li")
	private List<WebElement> hotListConsultants;
	
	@FindBy(xpath="//*[@id=\"newInterview\"]/div/form/div/div[2]/div[1]/div[2]/div/p-calendar/span/button")
	private WebElement interviewDateCalendarButton;
	
	@FindBy(xpath="//*[@id=\"newInterview\"]/div/form/div/div[2]/div[1]/div[2]/div/p-calendar/span/div/div/div/div[1]/div")
	private WebElement monthYearText;
	
	@FindBy(xpath="//*[@id=\\\"newInterview\\\"]/div/form/div/div[2]/div[1]/div[2]/div/p-calendar/span/div/div/div/div[1]/button[2]")
	private WebElement nextArrowSymbol;
	
	@FindBy(xpath="p-datepicker-prev-icon pi pi-chevron-left ng-tns-c42-5")
	private WebElement previousArrowSymbol;
	
	@FindBy(xpath="//div//table//tbody//td")
	private List<WebElement> interviewDates;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-clock'])[1]")
	private WebElement startTimeButton;
	
	@FindBy(xpath="//*[@id=\"newInterview\"]/div/form/div/div[2]/div[1]/div[3]/div/p-calendar/span/div/div/div[1]/button[1]")
	private WebElement startTimeHourArrow;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-clock'])[2]")
	private WebElement endTimeButton;
	
	@FindBy(xpath="//*[@id=\"newInterview\"]/div/form/div/div[2]/div[1]/div[4]/div/p-calendar/span/div/div/div[1]/button[1]")
	private WebElement endTimeHourArrow;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-chevron-down'])[3]")
	private WebElement clientDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> clientsList;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-chevron-down'])[4]")
	private WebElement vendorDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> vendorsList;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-chevron-down'])[5]")
	private WebElement skillDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> skillsList;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-chevron-down'])[6]")
	private WebElement interviewLevelDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> interviewLevelList;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-chevron-down'])[7]")
	private WebElement modeOfInterviewDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> modeOfInterviewList;
	
	
	@FindBy(id="MeetingURL")
	private WebElement meetingUrlTextField;
	
	@FindBy(xpath="(//button//span[@class='p-button-icon pi pi-chevron-down'])[8]")
	private WebElement marketerDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> marketerList;
	
	@FindBy(xpath="//*[@id=\"newInterview\"]/div/form/div/div[2]/div[1]/div[12]/textarea")
	private WebElement commentsTextArea;
	
	@FindBy(id="upload")
	private WebElement resumeFile;
	
	@FindBy(xpath="//div[@class='modal-body p-4']//span[contains(text(),'Schedule')]")
	private WebElement scheduleButton;
	
	public void clickOnchooseConsultantDropDownButton(String consultant)
	{
		wait.until(ExpectedConditions.elementToBeClickable(chooseConsultantDropDownButton)).click();
		for(WebElement consultants:hotListConsultants)
		{
			if(consultants.getText().equals(consultant))
			{
				consultants.click();
				break;
			}
		}
		
		
	}
	
	
	
	public void clickOnInterviewDateCalendarButton() {
		wait.until(ExpectedConditions.elementToBeClickable(interviewDateCalendarButton)).click();	
	}
	
	public void verifyDateMonthText(String monthyear)
	{
		while(true)
		{
			String monYear=monthYearText.getText();
			if(monYear.equals(monthyear))
				break;
			else
				nextArrowSymbol.click();
				
		}
	}
	
	public void clickOnInterviewDate(String date)
	{
		for(WebElement selectDate:interviewDates)
		{
			if(selectDate.getText().equals(date))
			{
				selectDate.click();
				break;
			}
		}
	}
	
	public void clickOnStartTimeButton()
	{
		startTimeButton.click();
	}
	
	public void clickOnStartTimeHourArrow()
	{
		startTimeHourArrow.click();
	}
	
	public void clickOnEndTimeButton()
	{
		endTimeButton.click();
	}
	
	public void clickOnEndTimeHourArrow()
	{
		endTimeHourArrow.click();
	}
	
	public void clickOnClientDropDownButton(String client)
	{
		wait.until(ExpectedConditions.elementToBeClickable(clientDropDownButton)).click();
		for(WebElement clients:clientsList)
		{
			if(clients.getText().equals(client))
			{
				clients.click();
				break;
			}
		}
	}
	
	public void clickOnVendorDropDownButton(String vendor)
	{
		wait.until(ExpectedConditions.elementToBeClickable(vendorDropDownButton)).click();
		for(WebElement vendors:vendorsList)
		{
			if(vendors.getText().equals(vendor))
			{
				vendors.click();
				break;
			}
		}
	}
	
	
	public void clickOnSkillDropDownButton(String skill)
	{
		wait.until(ExpectedConditions.elementToBeClickable(skillDropDownButton)).click();
		for(WebElement skills:skillsList)
		{
			if(skills.getText().equals(skill))
			{
				skills.click();
				break;
			}
		}
	}
	
	public void clickOnInterviewLevelDropDownButton(String interviewlevel)
	{
		wait.until(ExpectedConditions.elementToBeClickable(interviewLevelDropDownButton)).click();
		for(WebElement levels:interviewLevelList)
		{
			if(levels.getText().equals(interviewlevel))
			{
				levels.click();
				break;
			}
		}
	}
	
	
	public void clickOnModeOfInterviewDropDownButton(String interviewmode)
	{
		wait.until(ExpectedConditions.elementToBeClickable(modeOfInterviewDropDownButton)).click();
		for(WebElement modes:modeOfInterviewList)
		{
			if(modes.getText().equals(interviewmode))
			{
				modes.click();
				break;
			}
		}
	}
	
	public void enterMeetinUrl(String meetingurl)
	{
		meetingUrlTextField.sendKeys(meetingurl);
	}
	
	public void clickOnMarketerDropDownButton(String marketer)
	{
		wait.until(ExpectedConditions.elementToBeClickable(marketerDropDownButton)).click();
		for(WebElement marketers:marketerList)
		{
			if(marketers.getText().equals(marketer))
			{
				marketers.click();
				break;
			}
		}
	}
	
	public void entercomments(String comments)
	{
		commentsTextArea.sendKeys(comments);
	}
	
	public void uploadResume(String file)
	{
		resumeFile.sendKeys(file);
	}
	
	public void clickOnScheduleButton()
	{
		scheduleButton.click();
	}
	
	
	
}
