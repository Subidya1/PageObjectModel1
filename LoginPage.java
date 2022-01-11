package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUsername() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Thread.sleep(10000);
		return this;		
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;	
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		//HomePage hp = new HomePage();
		return new HomePage(driver);
	}
}
