package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}

	
	@FindBy(xpath="//input[@id='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	WebElement txtRepeatedPassword;
	
	@FindBy(xpath="//label[@for='termsyes']//div[@class='Checkbox_checkmark__qMRt2']")
	WebElement checkbox1;
	
	@FindBy(xpath="//label[@for='older16yes']//div[@class='Checkbox_checkmark__qMRt2']")
	WebElement checkbox2;
	
	@FindBy(xpath="//span[normalize-space()='Nastavi']")
	WebElement nastavi;
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void repeatPassword(String rpassword)
	{
		txtRepeatedPassword.sendKeys(rpassword);
	}
	
	public void clickcheckbox1()
	{
		checkbox1.click();
	}
	public void clickcheckbox2()
	{
		checkbox2.click();
	}
	
	public void clickNastavi()
	{
		nastavi.click();
	}
}

