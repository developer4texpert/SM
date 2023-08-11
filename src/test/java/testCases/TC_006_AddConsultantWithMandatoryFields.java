package testCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddConsultantPage;
import pageObjects.ConsultantsPage;
import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;

public class TC_006_AddConsultantWithMandatoryFields extends BaseClass{
	
	@Test
	public void verifyAddConsultant() throws InterruptedException, AWTException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		loginpage.enterPasswordField(rb.getString("password"));
		loginpage.clickOnLoginButton();
		super.robotMethod();
		
		MarketerDashBoardPage dashboard=new MarketerDashBoardPage(driver);
		dashboard.clickOnConsultants();
		
		ConsultantsPage consultantpage=new ConsultantsPage(driver);
		consultantpage.clickOnInsertConsultant();
		
		AddConsultantPage addConsultantPage=new AddConsultantPage(driver);
		addConsultantPage.enterFirstName("Vyas");
		addConsultantPage.enterLastName("Kumar");
		addConsultantPage.enterEmail("vyaskumar@gmail.com");
		addConsultantPage.enterPhoneNumber("9949976021");
		addConsultantPage.enterSkypeId("vyas1234");
		addConsultantPage.clickOnDOBDateTextField();
		addConsultantPage.clickOnDOBMonthDropDown("August");
		addConsultantPage.clickOnDOBYearDropDown("2023");
		addConsultantPage.clickOnDOBDate();
		addConsultantPage.enterSSNNumber("123456789");
		addConsultantPage.enterPassportNumber("Vasa7896");
		addConsultantPage.enterAddress("James Street Park Avenue");
		addConsultantPage.enterCity("Chicago");
		addConsultantPage.clickOnStateDropDownButton("Kansas");
		//addConsultantPage.selectStateFromStateList("Kansas");
		addConsultantPage.enterZipcode("34567");
		addConsultantPage.clickOnEducationDropDownButton("Undergraduate");
		addConsultantPage.enterUniversityName("JNTU");
		addConsultantPage.enterSpecialization("CSE");
		addConsultantPage.clickOnPassedOutDateField();
		addConsultantPage.clickOnPassedOutMonthDropDown("October");
		addConsultantPage.clickOnPassedOutYearDropDown("2011");
		addConsultantPage.clickOnPassedOutDate();
		addConsultantPage.clickOnSkillDropDownButton("SDET");
		addConsultantPage.enterMinimumPayRate("56");
		addConsultantPage.clickOnPriorityDropDownButton("High");
		addConsultantPage.clickOnVisaStatusDropDownButton("H1B");
		//addConsultantPage.enterPreferredLocation("Washington");
		addConsultantPage.clickOnUSEntryDateField();
		addConsultantPage.clickOnUSEntryMonthDropDown("March");
		addConsultantPage.clickOnUSEntryYearDropDown("2017");
		addConsultantPage.clickOnUSEntryDate();
		addConsultantPage.clickOnRecruiterDropDownButton("Naveen");
		addConsultantPage.clickOnSaveButton();
		Thread.sleep(3000);
		
		
		String actualSuccessMessage=AddConsultantPage.retrieveAddConsultantSuccessMessage();
		String expectedSuccessMessage="Consultant Added Successfully";
		Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
