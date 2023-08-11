package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.InterviewSchedulePage;
import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;

public class TC_007_AddInterviewWithAllFields extends BaseClass{
	
	@Test
	public void addInterview() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		loginpage.enterPasswordField(rb.getString("password"));
		loginpage.clickOnLoginButton();
		
		MarketerDashBoardPage dashboard=new MarketerDashBoardPage(driver);
		dashboard.clickOnScheduleInterviewButton();
		
		InterviewSchedulePage interviewSchedule=new InterviewSchedulePage(driver);
		
		interviewSchedule.clickOnchooseConsultantDropDownButton("Shirisha Ramsan");
		interviewSchedule.clickOnInterviewDateCalendarButton();
		interviewSchedule.verifyDateMonthText("August2023");
		interviewSchedule.clickOnInterviewDate("9");
		interviewSchedule.clickOnStartTimeButton();
		interviewSchedule.clickOnStartTimeHourArrow();
		interviewSchedule.clickOnEndTimeButton();
		interviewSchedule.clickOnEndTimeHourArrow();
		interviewSchedule.clickOnClientDropDownButton("DMI");
		interviewSchedule.clickOnVendorDropDownButton("Tech RBM");
		interviewSchedule.clickOnSkillDropDownButton("Business Analyst");
		interviewSchedule.clickOnInterviewLevelDropDownButton("First Round");
		interviewSchedule.clickOnModeOfInterviewDropDownButton("WebEx");
		interviewSchedule.enterMeetinUrl("www.webex.com");
		interviewSchedule.clickOnMarketerDropDownButton("Sudheer");
		interviewSchedule.entercomments("This is my first interview");
		interviewSchedule.uploadResume("C:\\Users\\naresh\\Downloads\\Sravya Resume.docx");
		interviewSchedule.clickOnScheduleButton();
		
		String actualInterviewConsultant=dashboard.retrieveInterviewCreatedConsultantName();;
		String expectedInterviewConsultant="Shirisha Ramsan";
		Assert.assertEquals(actualInterviewConsultant,expectedInterviewConsultant);
		
		
		Thread.sleep(5000);
		
		
	}

	
}
