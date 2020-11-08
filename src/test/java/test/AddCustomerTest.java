package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		
		//LoginPage login1 = new LoginPage(driver);
												//argument
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");	
		login.enterPassword("abc123");
		login.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.validateDashboard();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.clickOnCustomerButton();
		addCustomer.clickOnAddCustomerButton();
		addCustomer.enterName("JuneSelenium");
		addCustomer.enterCompanyName("Techfios");
		addCustomer.enterEmail("@techfios.com");
		addCustomer.enterCountryName("Austria");
		
		//BrowserFactory.tearDown();
		
	}

}
