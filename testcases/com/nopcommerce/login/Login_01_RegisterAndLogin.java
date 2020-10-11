package com.nopcommerce.login;

import org.testng.annotations.Test;

import commons.AbstractPage;
import commons.AbstractPages;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

import org.testng.annotations.BeforeTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login_01_RegisterAndLogin extends AbstractPages{

	private WebDriver driver;
	private String email, password, registerSuccessMsg;
	private HomePageObject homePage;
	private LoginPageObject loginPage;
	private RegisterPageObject registerPage;
	
	String firstName="Vo Thi Kim";
	String lastName="Ngan";
	String day="12";
	String month="June";
	String year="1997";
	String company="VNIB";
	
	
	@BeforeTest
	public void beforeTest() {

		// Apply for firefox lastest
//		String osName=System.getProperty("os.name");
//		if (osName.toLowerCase().contains("window")) {
//			System.setProperty("webdriver.gecko.driver", ".//browserDrivers//geckodriver.exe");
//		}else if(osName.toLowerCase().contains("mac")) {
//			System.setProperty("webdriver.gecko.driver", "./browserDrivers//geckodriver_mac");
//		}else {
//			System.setProperty("webdriver.gecko.driver", "./browserDrivers//geckodriver_linux");
//		}
		
		driver = new FirefoxDriver();
		System.out.println("Driver at testcase= " + driver.toString());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		openUrl(driver, "https://demo.nopcommerce.com/");
		//--> Home Page

		email = "julia" + RandomNumber() + "@gmail.com";
		password = "abcd@54321";
		
		homePage = new HomePageObject(driver);
		registerPage = new RegisterPageObject(driver);
		loginPage = new LoginPageObject(driver);
	}

	@Test
	public void TC_01_RegisterToSystem() {

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
	public void TC_02_LoginToSystem() {
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
