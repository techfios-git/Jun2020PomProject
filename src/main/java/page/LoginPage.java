package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Liberary
	@FindBy(how = How.ID, using = "username") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Sign in')]") WebElement SIGNIN_BUTTON_ELEMENT;
	
	
	//Interactive methods
	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	/*public void login(String userName, String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
		
	}*/

}
