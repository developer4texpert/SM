package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketerDashBoardPage extends BasePage{

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
		scheduleInterviewButton.click();
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
}
