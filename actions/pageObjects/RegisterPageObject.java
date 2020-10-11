package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends AbstractPages {

	WebDriver driver;
	public RegisterPageObject(WebDriver _driver) {
		driver=_driver;
	}
	public void clickToMaleRadioButton() {
		waitForElementClickable(driver, RegisterPageUI.MALE_RADIO_BUTTON);
		clickToElement(driver, RegisterPageUI.MALE_RADIO_BUTTON);
	}
	
	public void inputToFirstName(String firstNameValue) {
		waitForElementIsDisplayed(driver, RegisterPageUI.FRIST_NAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.FRIST_NAME_TEXTBOX, firstNameValue);
	}
	public void inputToLastName(String lastNameValue) {
		waitForElementIsDisplayed(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastNameValue);
	}
	public void selectDay(String dateValue) {
		waitForElementClickable(driver, RegisterPageUI.DATE_DROPDOWN);
		selectItemInDropdown(driver, RegisterPageUI.DATE_DROPDOWN, dateValue);
	}

	public void selectMonth(String monthValue) {
		waitForElementClickable(driver, RegisterPageUI.MONTH_DROPDOWN);
		selectItemInDropdown(driver, RegisterPageUI.MONTH_DROPDOWN, monthValue);
	}


	public void selectYear(String yearValue) {
		waitForElementClickable(driver, RegisterPageUI.YEAR_DROPDOWN);
		selectItemInDropdown(driver, RegisterPageUI.YEAR_DROPDOWN, yearValue);
	}

	public void inputToEmailTextbox(String emailValue) {
		waitForElementIsDisplayed(driver, RegisterPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, emailValue);
	}

	public void inputToPasswordTextbox(String passwordValue) {
		waitForElementIsDisplayed(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, passwordValue);
	}

	public void inputToCompanyTextbox(String companyValue) {
		waitForElementIsDisplayed(driver, RegisterPageUI.COMPANY_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.COMPANY_TEXTBOX, companyValue);
	}

	public void inputToConfirmPasswordTextbox(String comfirmPasswordValue) {
		waitForElementIsDisplayed(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, comfirmPasswordValue);
	}

	public void clickToRegisterButton() {
		waitForElementIsDisplayed(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public String getRegisterSuccessMessage() {
		waitForElementIsDisplayed(driver, RegisterPageUI.REGISTER_SUCCESS_TEXT);
		return getTextElement(driver, RegisterPageUI.REGISTER_SUCCESS_TEXT);
	}
	
	public HomePageObject clickToLogoutLink() {
		waitForElementClickable(driver, RegisterPageUI.LOG_OUT_LINK);
		clickToElement(driver, RegisterPageUI.LOG_OUT_LINK);
		return new HomePageObject(driver);
	}
}
