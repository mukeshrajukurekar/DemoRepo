package testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import allpages.Homepage;
import allpages.Loginpage;
import testbase.TestBase;

public class HomepageTest extends TestBase{
	
	Loginpage lp;
	Homepage hp;
	public HomepageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	    lp = new Loginpage();
	    hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validatetitleTest()
	{
		String hptitle=hp.validatetitlehomepage();
		Assert.assertEquals(hptitle,"Swag Labs","homepage title not matched");
	}
	@Test(priority=2)
	public void verifyswaglogoTest()
	{
		boolean logo =hp.validateswaglablogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=3)
	public void verifymenuTest()
	{
		hp.validatemenubutton();
	}
	
	@Test(priority=4)
	public void verifylogoutTest()
	{
		hp.validatelogotbutton();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
