package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.RegisterPageUI;

//ke thua abstract page
public class RegisterPageObject extends AbstractPages {

	WebDriver driver;
	
	//khoi tao contructor de map driver lan dau tien
	public RegisterPageObject(WebDriver _driver) {
		driver=_driver;
	}
	public void clickToMaleRadioButton() {
		waitToElementClickable(driver, RegisterPageUI.MALE_RADIO_BUTTON);
		clickToElement(driver, RegisterPageUI.MALE_RADIO_BUTTON);
	}
	
	public void inputToFirstName(String firstNameValue) {
		waitToElementVisible(driver, RegisterPageUI.FRIST_NAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.FRIST_NAME_TEXTBOX, firstNameValue);
	}
	public void inputToLastName(String lastNameValue) {
		waitToElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastNameValue);
	}
	public void selectDay(String dateValue) {
		waitToElementClickable(driver, RegisterPageUI.DATE_DROPDOWN);
		selectItemInDropdown(driver, RegisterPageUI.DATE_DROPDOWN, dateValue);
	}

	public void selectMonth(String monthValue) {
		waitToElementClickable(driver, RegisterPageUI.MONTH_DROPDOWN);
		selectItemInDropdown(driver, RegisterPageUI.MONTH_DROPDOWN, monthValue);
	}


	public void selectYear(String yearValue) {
		waitToElementClickable(driver, RegisterPageUI.YEAR_DROPDOWN);
		selectItemInDropdown(driver, RegisterPageUI.YEAR_DROPDOWN, yearValue);
	}

	public void inputToEmailTextbox(String emailValue) {
		waitToElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, emailValue);
	}

	public void inputToPasswordTextbox(String passwordValue) {
		waitToElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, passwordValue);
	}

	public void inputToCompanyTextbox(String companyValue) {
		waitToElementVisible(driver, RegisterPageUI.COMPANY_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.COMPANY_TEXTBOX, companyValue);
	}

	public void inputToConfirmPasswordTextbox(String comfirmPasswordValue) {
		waitToElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, comfirmPasswordValue);
	}

	public void clickToRegisterButton() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public String getRegisterSuccessMessage() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_SUCCESS_TEXT);
		return getTextElement(driver, RegisterPageUI.REGISTER_SUCCESS_TEXT);
	}
	
	public HomePageObject clickToLogoutLink() {
		waitToElementClickable(driver, RegisterPageUI.LOG_OUT_LINK);
		clickToElement(driver, RegisterPageUI.LOG_OUT_LINK);
		return PageGeneratorManager.getHomPageObject(driver);
	}
	public String getFirtNameEmptyErrorMessage() {
		waitToElementVisible(driver, RegisterPageUI.FIRST_NAME_EMPTY_ERROR_MSG);
		return getTextElement(driver, RegisterPageUI.FIRST_NAME_EMPTY_ERROR_MSG);
	}
	public String getLastNameEmptyErrorMessage() {
		waitToElementVisible(driver, RegisterPageUI.LAST_NAME_EMPTY__ERROR_MSG);
		return getTextElement(driver, RegisterPageUI.LAST_NAME_EMPTY__ERROR_MSG);
	}
	public String getEmailEmptyErrorMessage() {
		waitToElementVisible(driver, RegisterPageUI.EMAIL_EMPTY_ERROR_MSG);
		return getTextElement(driver, RegisterPageUI.EMAIL_EMPTY_ERROR_MSG);
	}
	public String getPasswordEmptyErrorMessage() {
		waitToElementVisible(driver, RegisterPageUI.PASSWORD_EMPTY_ERROR_MSG);
		return getTextElement(driver, RegisterPageUI.PASSWORD_EMPTY_ERROR_MSG);
	}
	public String getComfirmPasswordEmptyErrorMessage() {
		waitToElementVisible(driver, RegisterPageUI.CONFIRM_EMPTY_PASSWORD_ERROR_MSG);
		return getTextElement(driver, RegisterPageUI.CONFIRM_EMPTY_PASSWORD_ERROR_MSG);
	}
}
