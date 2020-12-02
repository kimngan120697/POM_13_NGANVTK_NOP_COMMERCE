package com.nopcommerce.login;

import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.PageGeneratorManager;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


//Page Object kế thừa abstract page
// Test case kế thừa abstract test
public class Practice_Assert_Verify_log extends AbstractTest {

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
	public void beforeTest(@Optional("firefox") String browserName) {

	
		

	}

	@Test
	public void TC_01_Assert() {
		log.info("TC_01: Step 01: .................. ");
		Assert.assertTrue(true);

		log.info("TC_01: Step 02: .................. ");
		Assert.assertTrue(true);
		
		log.info("TC_01: Step 03: .................. ");
		Assert.assertTrue(true);

		log.info("TC_01: Step 04: .................. ");
		Assert.assertTrue(false);

		log.info("TC_01: Step 05: .................. ");
		Assert.assertTrue(true);

	}
	
	@Test
	public void TC_02_Verify() {
		log.info("TC_02: Step 01: .................. ");
		verifyTrue(true);

		log.info("TC_02: Step 02: .................. ");
		verifyTrue(false);
		
		log.info("TC_02: Step 03: .................. ");
		verifyTrue(true);

		log.info("TC_02: Step 04: .................. ");
		verifyTrue(false);

		log.info("TC_02: Step 05: .................. ");
		verifyTrue(true);
	}
	@AfterTest
	public void afterTest() {
		
	}

}
