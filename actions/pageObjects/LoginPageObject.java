package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPages{
	
	WebDriver driver;
	
	public void inputToEmailTextbox(String emailValue) {
		waitForElementInvisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailValue);
	}
	
	public void inputToPasswordTextbox(String passwordValue) {
		waitForElementClickable(driver, LoginPageUI.PASSWORD_TEXTBOX);
		selectItemInDropdown(driver, LoginPageUI.PASSWORD_TEXTBOX, passwordValue);
	}
	
	public HomePageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return new HomePageObject();
	}
}
