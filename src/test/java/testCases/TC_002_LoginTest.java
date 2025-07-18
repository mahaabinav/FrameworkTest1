package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{

	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		try
		{
		//Home page
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on myaccount link on the home page..");
		hp.clickLogin(); //Login link under MyAccount
		logger.info("clicked on login link under myaccount..");
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setEmail(configproperty.getProperty("email"));
		lp.setPassword(configproperty.getProperty("password"));
		lp.clickLogin(); //Login button
		logger.info("clicked on ligin button..");
		
		//My Account Page
		MyAccountPage macc=new MyAccountPage(driver);
				
		boolean targetPage=macc.isMyAccountPageExists();
		
		AssertJUnit.assertEquals(targetPage, true);
		}
		catch(Exception e)
		{
			AssertJUnit.fail();
		}
		
		logger.info("**** Finished TC_002_LoginTest  ****");
	}
}
