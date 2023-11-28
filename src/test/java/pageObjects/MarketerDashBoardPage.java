package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketerDashBoardPage extends BasePage{

	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	public MarketerDashBoardPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Marketer Dashboard Page Elements
	@FindBy(xpath="//span[normalize-space()='Consultants']")
	private WebElement consultantsLink;
	
	@FindBy(xpath="//span[@class='ml-2 d-none d-lg-inline text-gray-600 small']")
	private WebElement userNameText;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//span[normalize-space()='SCHEDULE INTERVIEW']")
	private WebElement scheduleInterviewButton;
	
	@FindBy(xpath="//div[@role='alert']//div//div/div")
	private WebElement interviewCreationSuccessMessage;
	
	@FindBy(xpath="(//div[@data-index='0']//span)[1]")
	private WebElement interviewConsultantText;
	
	@FindBy(xpath="//div[@data-index='0']//i[@class='fa fa-window-restore fa-lg text-grey']")
	private WebElement actions;
	
	@FindBy(xpath="//*[@id=\"p-tabpanel-0\"]/app-scheduled-list/div[1]/div/div/div[1]/div/div[1]/div[2]/i")
	private WebElement interviewOptions;
	
	@FindBy(xpath="//ul[@class='dropdown-menu show']//li")
	private List<WebElement> interviewOptionsList;
	
	@FindBy(xpath="//*[@id=\"buttons_dates\"]/div[3]/i")
	private WebElement filterButton;
	
	@FindBy(xpath="/html/body/div/div/div[1]/div[1]/div/p-autocomplete/span/button")
	private WebElement keyButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> keyButtonValues;
	
	@FindBy(xpath="/html/body/div/div/div[1]/div[2]/div/p-autocomplete/span/button")
	private WebElement valueButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> valueButtonValues;
	
	@FindBy(xpath="/html/body/div/div/div[2]/button[2]")
	private WebElement applyButton;
	
	
	
	
	
	
	
	
	//Marketer Dashboard Action Methods
	public boolean getDisplayStatusOfConsultantsLink()
	{
		boolean displayStatus=consultantsLink.isDisplayed();
		return displayStatus;
	}
		
	public void clickOnConsultants() {
		consultantsLink.click();	
	}
	
	public void ClickOnUserNameText()
	{
		userNameText.click();
	}
	
	public void ClickOnLogout()
	{
		logout.click();
	}
	
	public void clickOnScheduleInterviewButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(scheduleInterviewButton)).click();
		
	}
	
	public String retrieveInterviewCreatedConsultantName()
	{
		String interviewCreatedConsultantName=interviewConsultantText.getText();
		return interviewCreatedConsultantName;
	}
	
	public void clickOnActions()
	{
		actions.click();
	}
	
	public void clickOnInterviewOptions(String listOptions)
	{
		interviewOptions.click();
		for(WebElement optionsList:interviewOptionsList)
		{
			if(optionsList.getText().equals(listOptions))
			{
				optionsList.click();
				break;
			}
		}
	}
	
	public void clickOnFilterButton()
	{
		filterButton.click();
	}
	
	public void clickOnKeyButton(String keyListOptions)
	{
		keyButton.click();
		for(WebElement keyList:keyButtonValues)
		{
			if(keyList.getText().equals(keyListOptions))
			{
				keyList.click();
				break;
			}
		}
		
	}
	
	public void clickOnValueButton(String valueListOptions)
	{
		valueButton.click();
		for(WebElement valueList:valueButtonValues)
		{
			if(valueList.getText().equals(valueListOptions))
			{
				valueList.click();
				break;
			}
		}
		
	}
	
	public void clickOnApplyButton()
	{
		applyButton.click();
	}
}
