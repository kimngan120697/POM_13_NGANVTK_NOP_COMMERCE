package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.LoginPageUI;

public class LoginPageObject extends AbstractPages{
	
	WebDriver driver;
	public LoginPageObject(WebDriver _driver) {
		driver=_driver;
	}
	public void inputToEmailTextbox(String emailValue) {
		waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailValue);
	}
	
	public void inputToPasswordTextbox(String passwordValue) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passwordValue);
	}
	
	public HomePageObject clickToLoginButton() {
		waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getHomPageObject(driver);
	}
}
