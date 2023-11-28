package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;

public class TC_009_AddNewRound extends BaseClass{

	@Test
	public void addNewRound() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		loginpage.enterPasswordField(rb.getString("password"));
		loginpage.clickOnLoginButton();
		
		MarketerDashBoardPage dashboard=new MarketerDashBoardPage(driver);
		dashboard.clickOnInterviewOptions("New Round");
		
		
		Thread.sleep(5000);
		
	}
}
