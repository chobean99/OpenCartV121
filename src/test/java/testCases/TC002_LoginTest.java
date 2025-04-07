package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("** Starting Login test**");
		try {
		//home page
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		//login
		Login lp=new Login(driver);
		lp.seteemail(p.getProperty("email"));
		lp.setppassword(p.getProperty("password"));
		Thread.sleep(20000);
		lp.clickLogin();
		
		//myaccount
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.doesMyAccountPageExists();
		
		Assert.assertTrue(targetPage);
		
		}catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("** Finished Login test**");


	}

}
