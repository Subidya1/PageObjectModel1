package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {
	
	
	@Test
	public void runCreateLead() throws InterruptedException {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickCreateLeadButton()
		.verifyFirstName();
		
		
	}

}
