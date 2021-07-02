package HMS.admin.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.Loginpage;

public class LoginpageTest extends testbase {
	
	Loginpage loginpage;
	
	public LoginpageTest()
    {
	   super();
    }
 @BeforeMethod
 public void setup()
 {
	 initialization();
	 loginpage=new Loginpage();
	 
 }
@Test(priority=1)
public void verifytitle() {
	String actualtittle=loginpage.validateLoginPageTitle();
	String Expectedtittle="Smart Hospital : Hospital Management System";
	Assert.assertEquals(actualtittle, Expectedtittle);
	
}
	@Test(priority=2)
	public void verifylogo()
	{
		boolean log=loginpage.validatelogo();
		Assert.assertTrue(log);
	}
	
	@Test(priority=3)
	public void logintest()
	{
		loginpage.login(pop.getProperty("username"),pop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
