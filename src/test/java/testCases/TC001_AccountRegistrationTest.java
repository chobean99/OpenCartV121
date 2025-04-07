package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	
	@Test(groups={"Regression","Master"})
	public void veryfy_account_registration() throws InterruptedException
	{
		logger.info("**** starting TC001_accountRegistrationTest ****");
		HomePage hp=new HomePage(driver);
		hp.clickRegister();
		logger.info("***clicked on register link****");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		Thread.sleep(3000);
		logger.info("**providing customer details**");
		regpage.setEmail(randomString()+"@gmail.com");
		
		String ppassword = randomAlphaNumber();
		
		Thread.sleep(3000);
		regpage.setPassword(ppassword);
		regpage.repeatPassword(ppassword);
		regpage.clickcheckbox1();
		regpage.clickcheckbox2();
		Thread.sleep(3000);
		regpage.clickNastavi();
		

		logger.info("**finished**");
	}
	
	

}
