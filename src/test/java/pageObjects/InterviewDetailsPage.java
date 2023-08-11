package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterviewDetailsPage extends BasePage{

	public InterviewDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"roundDetails\"]/div/div/p-autocomplete/span/button")
	private WebElement interviewStatusDropDownButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> interviewStatusList;
	
	
	public void clickOnInterviewStatusDropDownButton(String interviewStatus)
	{
		interviewStatusDropDownButton.click();
		for(WebElement selectInterviewStatus:interviewStatusList)
		{
			if(selectInterviewStatus.getText().equals(interviewStatus))
			{
				selectInterviewStatus.click();
				break;
			}
		}
	}
	
}
