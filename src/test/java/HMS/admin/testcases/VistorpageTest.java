package HMS.admin.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import HMS.base.testbase;
import HMS.pages.FrontofficePage;
import HMS.pages.Homepage;
import HMS.pages.Loginpage;
import HMS.pages.vistorpage;
import HMS.util.ReadExcel;

public class VistorpageTest extends testbase {
	
	Loginpage logpage;
	Homepage hpage;
	FrontofficePage ffpage;
	vistorpage vpage;
	// ReadExcel vdata =new ReadExcel();
	 String sheetName = "vistor";
	public VistorpageTest ()
	{
		super();
	}
	
	 @BeforeMethod
	 public void setup()
	 {
		 initialization();
		 logpage=new Loginpage();
		 hpage=logpage.login(pop.getProperty("username"),pop.getProperty("password"));
		 ffpage=hpage.clickonfrontoffice();
		vpage=ffpage.clickonvistorbook();
	 }

	
	  @DataProvider
	  public Object[][] getVISTestData()
	  { 
		  Object data[][] =  ReadExcel.getTestData(sheetName); 
		  return data; 
		  }
	 
     @Test(dataProvider="getVISTestData")
     public void addvisitor(String args[]) {
    	 Assert.assertTrue(vpage.vbtableTitle());
    	 vpage.clickonaddvistor();
    	 Assert.assertTrue(vpage.advTitle());
         vpage.addvisdetails(args);
     }
     
     @AfterMethod
 	public void tearDown(){
 		driver.quit();
 	}
	
}
