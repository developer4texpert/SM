package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ConsultantsPage;
import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;

public class TC004_SearchByConsultant extends BaseClass{

	@Test(groups={"Regression","Master"})
	public void verifySearchWithValidConsultant() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress(rb.getString("email"));
		loginpage.enterPasswordField(rb.getString("password"));
		loginpage.clickOnLoginButton();
		
		MarketerDashBoardPage dashboard=new MarketerDashBoardPage(driver);
		dashboard.clickOnConsultants();
		
		ConsultantsPage consultantpage=new ConsultantsPage(driver);
		consultantpage.enterConsultantOrSkillInSearchBox("Hasini");
		consultantpage.consultantOrSkillSearchButton();
		
		String actualConsultantName=consultantpage.retrieveConsultantSearchResult();
		String expectedConsultantName="Hasini Amara";
		
		Assert.assertEquals(actualConsultantName,expectedConsultantName);	
	}
}
