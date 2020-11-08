package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHOME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement CUNTRY_FIELD_LOCATOR;
	
	//Interactive Methods
	public void clickOnCustomerButton() {
		CUSTOMER_FIELD_LOCATOR.click();
	}
	
	public void clickOnAddCustomerButton() {
		waitForElement(driver, 3, ADD_CUSTOMER_FIELD_LOCATOR);
		ADD_CUSTOMER_FIELD_LOCATOR.click();
	}
	
	public void enterName(String name) {
		waitForElement(driver, 3, USERNAME_FIELD_LOCATOR);
		int randomNum = randomNumGenerator();
		USERNAME_FIELD_LOCATOR.sendKeys(name + randomNum);
	}
	
	public void enterCompanyName(String company) {
		selectFromDropdown(COMPANY_FIELD_LOCATOR, company);
	}
	
	public void enterEmail(String email) {
		int randomNum = randomNumGenerator();
		EMAIL_FIELD_LOCATOR.sendKeys(randomNum + email);
	}

	public void enterCountryName(String country) {
		selectFromDropdown(CUNTRY_FIELD_LOCATOR, country);
	}	
	
	

}
