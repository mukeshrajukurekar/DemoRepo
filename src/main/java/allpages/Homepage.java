package allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class Homepage extends TestBase {
	
	@FindBy(xpath="//div[contains(@class,'app_logo')]")
	WebElement swaglabslogo;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menubutton;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logoutbutton;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatetitlehomepage()
	{
		return driver.getTitle();
	}
	
	public boolean validateswaglablogo()
	{
		return swaglabslogo.isDisplayed();
	}
	
	public void validatemenubutton()
	{
		menubutton.click();
	}
	
	public void validatelogotbutton()
	{
		logoutbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
