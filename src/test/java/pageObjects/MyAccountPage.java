package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Moj nalog']")
	WebElement msgHeading;
	
	@FindBy(xpath="//span[contains(text(),'Izlogujte se')]")
	WebElement lnkLogout;
	
	
	
	public boolean doesMyAccountPageExists()
	{
		try {
		return (msgHeading.isDisplayed());
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
