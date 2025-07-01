package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

import org.testng.Assert;
import org.testng.annotations.*;

public class TC001_AccountRegistration_Test extends BaseClass{

	

	
	@Test(groups={"Master","Regression"})
	void verify_account_register()
	{
		logger.info("Starting verify account test");
		
		
		
			
			logger.info("Starting of test method verify_account_register" );
		HomePage homepageobject=new HomePage(driver);
		
		homepageobject.clickMyAccount();
		homepageobject.clickRegister();
		
		//homepageobject.clickRegister();
		
		
		RegisterPage regpage=new RegisterPage(driver);
		//int i=1/0;
		
		logger.info("Starting of registration page" );
		//int a=10/0;
		regpage.setFirstName("John");
		regpage.setLastName("David");
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone("1111");
		
		//String password=randomAlphaNumeric();
		
		regpage.setPassword("test");
		regpage.setConfirmPassword("test");
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		logger.info("End of test method verify_account_register" );
		
		//int i=10;
	//	int num_students=10;
		
		
		try {
		
		}
		catch(Exception e)
		{
			logger.error("Error happened and Test failed****************");
			logger.error("Excpetion raised.Details:"+e.getMessage());
			logger.debug("Debug logs***********");
			logger.warn("Warn logs***********");
			Assert.fail();
			
			// Debug<<Info<<Warning<<Error
			
		}
		
	}
	
	
	
	
}
