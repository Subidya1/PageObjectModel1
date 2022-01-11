package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLogin extends BaseClass {
	
	@Test
	public void runLogin() throws InterruptedException {
		
		System.out.println(driver);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()	
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage();

}

	
}