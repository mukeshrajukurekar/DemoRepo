package allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class Loginpage extends TestBase {
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	@FindBy(xpath="//div[contains(@class,'bot_column')]")
	WebElement saucelogo;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginpage()
	{
		return driver.getTitle();
	}
	
	public boolean validatesaucelogo()
	{
		return saucelogo.isDisplayed();
	}
	
	public Homepage login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new Homepage();
	}
		
	
}
