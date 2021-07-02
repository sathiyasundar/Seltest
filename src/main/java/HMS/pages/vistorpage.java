package HMS.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.base.testbase;
import HMS.util.Datepicker;
import HMS.util.ReadExcel;
import HMS.util.CommonUtility;

public class vistorpage extends testbase{
	Datepicker datutil=new Datepicker();
	

    
	
	@FindBy(xpath="//h3[contains(text(),'Visitor List')]")WebElement tableName;
	@FindBy(xpath="//a[contains(text(),'Add Visitor')]")WebElement Addvisitor;
	@FindBy(xpath="//h4[contains(text(),'Add Visitor')]")WebElement Advscreentitle;
	@FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/select[1]")WebElement drppurpose;
	@FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")WebElement vname;
	@FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")WebElement vphone;
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]")WebElement Vidcard;	
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")WebElement vnp;
    @FindBy(xpath="//input[@id='date']")WebElement vdat;
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")WebElement vintime;
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")WebElement vouttime;
    @FindBy(xpath="//textarea[@id='description']")WebElement vnote;
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")WebElement vupload;
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")WebElement vsavebtt;
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[1]/button[1]")WebElement vsclose;
	public vistorpage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean vbtableTitle(){
		return tableName.isDisplayed();
	}
	
	public void clickonaddvistor()
	{
		Addvisitor.click();
		
	}
	public boolean advTitle(){
		waitforElementvisible(Advscreentitle);
		return Advscreentitle.isDisplayed();
	}
	
			
	public void addvisdetails(String data[] )
	{
		
		String currentUsersHomeDir = System.getProperty("user.dir");
		String floc=currentUsersHomeDir+"\\src\\test\\resources\\test.jpg";
		
		Select drp=new Select(drppurpose);
		drp.selectByVisibleText(data[0]);
		vname.sendKeys(data[1]);
		vphone.sendKeys(data[2]);
		Vidcard.sendKeys(data[3]);
		vnp.sendKeys(data[4]);
		vdat.click();
		datutil.datpicker(data[5]);
		vnote.sendKeys(data[6]);
		CommonUtility.mouseclick(vupload);
		CommonUtility.upload(floc);
		//vsavebtt.click();
		vsclose.click();
	}
	
}
