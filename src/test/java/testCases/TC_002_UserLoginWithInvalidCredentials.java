package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.BaseClass;
import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;

public class TC_002_UserLoginWithInvalidCredentials extends BaseClass{

	@Test(priority=1)
	void loginWithInvalidCredentials()
	{
		
		logger.info("*****Starting TC_001_UserLoginWithInValidCredentials*********");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress("yuvi1@texperts-inc.com");
		logger.info("Entered User Email Address");
		loginpage.enterPasswordField("txp1@Y**B**2018");
		logger.info("Entered User Email Password");
		loginpage.clickOnLoginButton();
		logger.info("Clicked on Login Button");
		
		String actualWarningMessage=loginpage.retrieveEmailPasswordNotMatchingWarningMessageText();
		String expectedWarningMessage="Invalid Username or Password";
		Assert.assertEquals(actualWarningMessage,expectedWarningMessage);
		
			
	}
}

