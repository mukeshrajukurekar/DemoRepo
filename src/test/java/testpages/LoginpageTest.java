package testpages;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import allpages.Homepage;
import allpages.Loginpage;
import testbase.TestBase;

public class LoginpageTest extends TestBase{
	Loginpage lp;
	Homepage hp;
	public LoginpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	    lp = new Loginpage();
	}
	
	@Test(priority=1)
	public void loginpagetitleTest()
	{
		String title =lp.validateloginpage();
		Assert.assertEquals(title,"Swag Labs");
	}
	@Test(priority=2)
	public void saucelogoTest()
	{
		boolean logo =lp.validatesaucelogo();
		Assert.assertTrue(logo);
	}
	@Test(priority=3)
	public void loginTest()
	{
		 hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
