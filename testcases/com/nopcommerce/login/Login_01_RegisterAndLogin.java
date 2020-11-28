package com.nopcommerce.login;

import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.PageGeneratorManager;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


//Page Object kế thừa abstract page
// Test case kế thừa abstract test
public class Login_01_RegisterAndLogin extends AbstractTest {

	private WebDriver driver;
	private String email, password, registerSuccessMsg, registerErrorMsg;
	private HomePageObject homePage;
	private LoginPageObject loginPage;
	private RegisterPageObject registerPage;

	String firstName = "Vo Thi Kim";
	String lastName = "Ngan";
	String day = "12";
	String month = "June";
	String year = "1997";
	String company = "VNIB";

	// Lấy 2 giá trị
    // @Parameters({ "browser", "url" })
	// Lấy 1 giá trị
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browserName) {

		driver = getBrowserDriver(browserName);
		
		//Generator random email
		email = "julia" + RandomNumber() + "@gmail.com";
		password = "abcd@54321";

//		homePage = new HomePageObject(driver);
//		registerPage = new RegisterPageObject(driver);
//		loginPage = new LoginPageObject(driver);
		
		//Che giấu việc khởi tạo
		homePage = PageGeneratorManager.getHomPageObject(driver);
		registerPage = PageGeneratorManager.getRegisterPageObject(driver);
		loginPage = PageGeneratorManager.getLoginPageObject(driver);
	}

	@Test
	public void TC_01_RegisterWithEmptyData() {
		//Home page Click to Register link => Register Page 
		registerPage = homePage.clickToRegisterLink();
		
		//Click on Register Button
		registerPage.clickToRegisterButton();
		
		//Verify Error message is displayed
		registerErrorMsg = registerPage.getFirtNameEmptyErrorMessage();
		Assert.assertEquals(registerErrorMsg, "First name is required.");
		
		registerErrorMsg = registerPage.getLastNameEmptyErrorMessage();
		Assert.assertEquals(registerErrorMsg, "Last name is required.");
		
		registerErrorMsg = registerPage.getEmailEmptyErrorMessage();
		Assert.assertEquals(registerErrorMsg, "Email is required.");
		
		registerErrorMsg = registerPage.getPasswordEmptyErrorMessage();
		Assert.assertEquals(registerErrorMsg, "Password is required.");
		
		registerErrorMsg = registerPage.getComfirmPasswordEmptyErrorMessage();
		Assert.assertEquals(registerErrorMsg, "Password is required.");
	}
	
	@Test
	public void TC_02_RegisterWithValidEmail() {
		
	}
	
	@Test
	public void TC_03_RegisterToSystem() {

		// Click to Register link => Register page
		registerPage = homePage.clickToRegisterLink();

		// Click male radio button
		registerPage.clickToMaleRadioButton();

		// Input to firstname textbox
		registerPage.inputToFirstName(firstName);
		// Input to lasttname textbox
		registerPage.inputToLastName(lastName);

		// Select item in Day
		registerPage.selectDay(day);

		// Select item in Month
		registerPage.selectMonth(month);

		// Select item in Year
		registerPage.selectYear(year);

		// Input to email text box
		registerPage.inputToEmailTextbox(email);

		// Input to company text box
		registerPage.inputToCompanyTextbox(company);

		// Input to password text box
		registerPage.inputToPasswordTextbox(password);

		// Input to confirm password text box
		registerPage.inputToConfirmPasswordTextbox(password);

		// Click to Register button
		registerPage.clickToRegisterButton();

		// Verify register success
		registerSuccessMsg = registerPage.getRegisterSuccessMessage();
		Assert.assertEquals(registerSuccessMsg, "Your registration completed");

		// Click to Logout link => Home Page
		homePage = registerPage.clickToLogoutLink();
	}

	@Test
	public void TC_03_LoginToSystem() {
		// Click to Login link => Login Page
		loginPage = homePage.clickToLoginLink();

		// Input to email text box
		loginPage.inputToEmailTextbox(email);

		// Input to password text box
		loginPage.inputToPasswordTextbox(password);

		// Click to Login Button => Home Page
		homePage = loginPage.clickToLoginButton();

		// Verify My Account Link displayed
		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

	}

	
	
	public int RandomNumber() {
		Random rand = new Random();
		return rand.nextInt(999999);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
