package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MarketerDashBoardPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_DDTLogin extends BaseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email, String password, String exp)
	{
		logger.info("*****Starting TC_001_UserLoginWithValidCredentials*********");
		try
		{
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterEmailAddress(email);
			
			loginpage.enterPasswordField(password);
			
			loginpage.clickOnLoginButton();
			
			
			MarketerDashBoardPage dashboardpage=new MarketerDashBoardPage(driver);
		    boolean targetpage=dashboardpage.getDisplayStatusOfConsultantsLink();
		    
		    if(exp.equals("Valid"))
		    {
		    	if(targetpage==true)
		    	{
		    		dashboardpage.ClickOnUserNameText();
		    		dashboardpage.ClickOnLogout();
		    		Assert.assertTrue(true);
		    	}
		    	
		    	else
		    	{
		    		Assert.assertTrue(false);
		    	}
		    }
		    
		    String actualWarningMessage=loginpage.retrieveEmailPasswordNotMatchingWarningMessageText();
			String expectedWarningMessage="Invalid Username or Password";
			boolean defaultpage=actualWarningMessage.equals(expectedWarningMessage);
		    	
		    	if(exp.equals("Invalid"))
			    {
			    	if(defaultpage==true)
			    	{
			    		Assert.assertTrue(true);
			    		driver.navigate().refresh();
			    	}
			    	
			    	else
			    	{
			    		Assert.assertTrue(false);
			    	}
		        }
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	    	logger.info("**** Finished TC_003_DDTLogin******");
		
		
	}

}
