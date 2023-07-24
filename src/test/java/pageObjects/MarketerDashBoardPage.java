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
}
