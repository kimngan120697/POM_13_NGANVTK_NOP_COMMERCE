package pageUIs;

public class RegisterPageUI {
	public static final String MALE_RADIO_BUTTON="//input[@id='gender-male']";
	public static final String FEMALE_RADIO_BUTTON="//input[@id='gender-female']";
	public static final String FRIST_NAME_TEXTBOX="//input[@id='FirstName']";
	public static final String LAST_NAME_TEXTBOX="//input[@id='LastName']";
	public static final String DATE_DROPDOWN="//select[@name='DateOfBirthDay']";
	public static final String MONTH_DROPDOWN="//select[@name='DateOfBirthMonth']";
	public static final String YEAR_DROPDOWN="//select[@name='DateOfBirthYear']";
	public static final String EMAIL_TEXTBOX="//input[@id='Email']";
	public static final String COMPANY_TEXTBOX="//input[@id='Company']";
	public static final String NEWSLETTER_CHECKBOX="//input[@id='Newsletter']";
	public static final String PASSWORD_TEXTBOX="//input[@id='Password']";
	public static final String CONFIRM_PASSWORD_TEXTBOX="//input[@id='ConfirmPassword']";
	public static final String REGISTER_BUTTON="//input[@id='register-button']";
	public static final String REGISTER_SUCCESS_TEXT="//div[contains(text(),'Your registration completed')]";

	public static final String FIRST_NAME_EMPTY_ERROR_MSG="//span[@id='FirstName-error' and text()='First name is required.']";
	public static final String LAST_NAME_EMPTY__ERROR_MSG="//span[@id='LastName-error' and text()='Last name is required.']";
	public static final String EMAIL_EMPTY_ERROR_MSG="//span[@id='Email-error' and text()='Email is required.']";
	public static final String PASSWORD_EMPTY_ERROR_MSG="//span[@id='Password-error' and text()='Password is required.']";
	public static final String CONFIRM_EMPTY_PASSWORD_ERROR_MSG="//span[@id='ConfirmPassword-error' and text()='Password is required.']";
	
	public static final String LOG_OUT_LINK="//a[contains(text(),'Log out')]";

}
