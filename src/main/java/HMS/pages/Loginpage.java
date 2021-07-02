package HMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.base.testbase;

public class Loginpage extends testbase {
	
	@FindBy(css="input#email")WebElement uname;
	@FindBy(css="input#password")WebElement upass;
	@FindBy(tagName="img")WebElement HMSlogo;
	@FindBy(linkText="Forgot Password?")WebElement fpass;
	@FindBy(className="btn")WebElement lbttn;
	
	
	//Initializing the Page Objects:	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}

//To validate the page title	
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
//To validate Logo
	public boolean validatelogo()
	{
		return HMSlogo.isDisplayed();
	}

	public Homepage login(String username,String password)
	{
		uname.sendKeys(username);
		upass.sendKeys(password);
		lbttn.click();
		return new Homepage();
	}
	
	
}
