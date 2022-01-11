package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage verifyFirstName() {
		System.out.println("FirstName is displayed");
		
		return this;

}
	
}
