package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;
import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;

public class TC_001_UserLoginWithValidCredentials extends BaseClass{

	@Test(priority=1,groups= {"Sanity","Master"})
	void loginWithValidCredentials()
	{
		logger.info("*****Starting TC_001_UserLoginWithValidCredentials*********");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		logger.info("Entered User Email Address");
		loginpage.enterPasswordField(rb.getString("password"));
		logger.info("Entered User Email Password");
		loginpage.clickOnLoginButton();
		logger.info("Clicked on Login Button");
		
		MarketerDashBoardPage dashboardpage=new MarketerDashBoardPage(driver);
		Assert.assertTrue(dashboardpage.getDisplayStatusOfConsultantsLink());
		logger.info("Performing Validation");
		logger.info("******Completed TC_001_UserLoginWithValidCredentials*******");
			
	}
}
