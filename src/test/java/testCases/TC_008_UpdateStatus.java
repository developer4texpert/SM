package testCases;

import org.testng.annotations.Test;

import pageObjects.InterviewDetailsPage;
import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;

public class TC_008_UpdateStatus extends BaseClass{

	@Test
	public void VerifyStatusUpdate() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		loginpage.enterPasswordField(rb.getString("password"));
		loginpage.clickOnLoginButton();
		
		MarketerDashBoardPage dashboard=new MarketerDashBoardPage(driver);
		
		dashboard.clickOnActions();
		
		InterviewDetailsPage interviewDetails=new InterviewDetailsPage(driver);
		interviewDetails.clickOnInterviewStatusDropDownButton("Rejected");
		Thread.sleep(5000);
		
		
	}
}
