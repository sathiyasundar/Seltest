package HMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.base.testbase;

public class FrontofficePage extends testbase {
	
	@FindBy(xpath="//h3[contains(text(),'Appointment Details')]")WebElement tableName;
	@FindBy(xpath="//a[contains(text(),'Visitor Book')]")WebElement visitorbook;
	
	public FrontofficePage()
	{
		PageFactory.initElements(driver,this);
	}
	public boolean FOtableTitle(){
		return tableName.isDisplayed();
	}
	public vistorpage clickonvistorbook()
	{
		visitorbook.click();
		return new vistorpage();
	}
	
}
