package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import pageUIs.HomePageUI;

public class HomePageObject extends AbstractPages{

	WebDriver driver;
	public HomePageObject(WebDriver _driver) {
		driver=_driver;
	}
	public RegisterPageObject clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return new RegisterPageObject(driver);//return ve doi tuong cua regishter page object
	}

	public LoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return new LoginPageObject(driver);
	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementIsDisplayed(driver, HomePageUI.MYACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MYACCOUNT_LINK);
	}
}
