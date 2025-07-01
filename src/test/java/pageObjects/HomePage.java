package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	public HomePage( WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver,this); // MANDATORY
		//initElements method is used to initialize web elements.
	}
	
	//a[text()='Register']
	
	
	
	
	@FindBy(how=How.XPATH, using="//span[text()='My Account']")  
	WebElement lnkMyaccount;
	
	@FindBy(how=How.XPATH, using="//a[text()='Register']")  
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")   // Login link added in step5
	WebElement linkLogin;

	
	
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}

	public void clickRegister()
	{
		lnkRegister.click();
	}

	
	
	public void clickLogin()    // added in step5
	{
		linkLogin.click();
	}
	
	
}
