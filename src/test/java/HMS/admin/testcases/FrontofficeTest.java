package HMS.admin.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.FrontofficePage;
import HMS.pages.Homepage;
import HMS.pages.Loginpage;

public class FrontofficeTest extends testbase {
	Loginpage loginPage;
	Homepage homePage;
	FrontofficePage ffPage;
	
	public FrontofficeTest()
	{
		super();
	}

	 @BeforeMethod
	 public void setup()
	 {
		 initialization();
		 loginPage=new Loginpage();
		 homePage=loginPage.login(pop.getProperty("username"),pop.getProperty("password"));
		 ffPage=homePage.clickonfrontoffice();
	 }
	 @Test(priority=1)
	 public void verifytabletitle()
	 {
		 ffPage.FOtableTitle();
	 }
	 @Test(priority=2)
	 public void clickonvistor()
	 {
		 ffPage.clickonvistorbook();
	 }
	
	 @AfterMethod
		public void tearDown(){
			driver.quit();
		}
	
	
	
}
