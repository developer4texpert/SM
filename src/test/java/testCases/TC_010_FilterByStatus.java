package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;

public class TC_010_FilterByStatus extends BaseClass{

	@Test
	public void verifyFilterWithStatus() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		loginpage.enterPasswordField(rb.getString("password"));
		loginpage.clickOnLoginButton();
		
		MarketerDashBoardPage dashboard=new MarketerDashBoardPage(driver);
		dashboard.clickOnFilterButton();
		dashboard.clickOnKeyButton("Status");
		dashboard.clickOnValueButton("Rejected");
		dashboard.clickOnApplyButton();
		
		
		Thread.sleep(5000);
	}
}
