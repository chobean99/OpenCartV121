package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Ulogujte se']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//span[normalize-space()='Registrujte se']")
	WebElement lnkMRegister;
	
	
	public void clickMyAccount()
	{
		lnkMyAccount.click();
	}
	
	public void clickRegister()
	{
		lnkMRegister.click();
	}
	

}
