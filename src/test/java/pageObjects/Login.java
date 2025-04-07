package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
	
	public Login (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement eemail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement ppassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement llogin;
	
	public void seteemail(String email)
	{
		eemail.sendKeys(email);	}
	public void setppassword(String pwd)
	{
		ppassword.sendKeys(pwd);
	}

	public void clickLogin()
	{
		llogin.click();
	}
}
