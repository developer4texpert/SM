package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Login Page Elements
	@FindBy(id="username")
	private WebElement emailAddressField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@role='alert']/div/div[2]")
	private WebElement emailPasswordNotMatchingWarning;
	
	
	//Login Action Methods
	public void enterEmailAddress(String emailText)
	{
		emailAddressField.sendKeys(emailText);
	}
	
	public void enterPasswordField(String passwordText)
	{
		passwordField.sendKeys(passwordText);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public String retrieveEmailPasswordNotMatchingWarningMessageText() {
		String warningText=emailPasswordNotMatchingWarning.getText();
		return warningText;
		
	}

}
