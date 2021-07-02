package HMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.base.testbase;

public class Homepage extends testbase {
//WebElements
	@FindBy(css="img.topuser-image")WebElement profile;
	@FindBy(xpath="//h4[contains(text(),'Super Admin')]")WebElement userNameLabel;
	@FindBy(css="ul.sidebar-menu>li")WebElement frontoffice;
	
	
	
	
	//Initializing the Page Objects:	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		profile.click();
		return userNameLabel.isDisplayed();
	}
	
	public FrontofficePage clickonfrontoffice()
	{
		frontoffice.click();
		return new FrontofficePage();
	}

}
