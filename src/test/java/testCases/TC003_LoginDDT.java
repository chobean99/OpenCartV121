package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilites.DataProviders;



public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")
	public void verify_loginDDT(String email,String pwd, String exp) throws InterruptedException
	{
		
		logger.info("**  Starting TC003_LoginDDT **");
		try {
		//home page
				HomePage hp=new HomePage(driver);
				hp.clickMyAccount();
				
				//login
				Login lp=new Login(driver);
				lp.seteemail(p.getProperty(email));
				lp.setppassword(p.getProperty(pwd));
				Thread.sleep(20000);
				lp.clickLogin();
				
				//myaccount
				MyAccountPage macc=new MyAccountPage(driver);
				boolean targetPage=macc.doesMyAccountPageExists();
				
				/*
				 Data is valid - login success - test pass - logout
				 data is valid - login failed - test fail
				 
				 data is invalid - login success - test fail - logout
				 Data is invalid - login failed - test pass
				 */
				
				if(exp.equalsIgnoreCase("Valid"))
				{
					if(targetPage==true)
					{
						Assert.assertTrue(true);
						macc.clickLogout();
					}else
					{
						Assert.assertTrue(false);
					}
				}
				
				if(exp.equalsIgnoreCase("invalid"))
				{
					if(targetPage==true)
					{
						macc.clickLogout();
						Assert.assertTrue(false);
					}else
					{
						Assert.assertTrue(true);
					}
				}
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**  Finished TC003_LoginDDT **");
				
	}

}
