package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ConsultantsPage;
import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;

public class TC_005_SearchBySkill extends BaseClass{

	@Test
	public void verifySearchWithValidSkill() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		loginpage.enterPasswordField(rb.getString("password"));
		loginpage.clickOnLoginButton();
		
		MarketerDashBoardPage dashboard=new MarketerDashBoardPage(driver);
		dashboard.clickOnConsultants();
		
		ConsultantsPage consultantpage=new ConsultantsPage(driver);
		consultantpage.enterConsultantOrSkillInSearchBox("Business");
		consultantpage.consultantOrSkillSearchButton();
		
		String actualSkillName=consultantpage.retrieveSkillSearchResult();
		Thread.sleep(2000);
		String expectedSkillName="usiness Analys";
		
		Assert.assertEquals(actualSkillName,expectedSkillName);
		
		
	}
}
