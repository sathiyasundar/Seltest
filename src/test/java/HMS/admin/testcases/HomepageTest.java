package HMS.admin.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.Homepage;
import HMS.pages.Loginpage;

public class HomepageTest extends testbase{
	Loginpage loginPage;
	Homepage homePage;
	
	public HomepageTest()
	{
		super();
	}
	 @BeforeMethod
	 public void setup()
	 {
		 initialization();
		 loginPage=new Loginpage();
		 homePage=loginPage.login(pop.getProperty("username"),pop.getProperty("password"));
	 }
	
	 @Test(priority=1)
		public void verifyHomePageTitleTest(){
			String homePageTitle = homePage.verifyHomePageTitle();
			Assert.assertEquals(homePageTitle, "Smart Hospital and Research","Home page title not matched");
		}
	
	 @Test(priority=2)
		public void verifyUserNameTest(){
			
			Assert.assertTrue(homePage.verifyCorrectUserName());
		}
	 @Test(priority=3)
	 public void clickonfrontoffice()
	 {
		 homePage.clickonfrontoffice();
	 }
	 
	
	 @AfterMethod
		public void tearDown(){
			driver.quit();
		}

}
