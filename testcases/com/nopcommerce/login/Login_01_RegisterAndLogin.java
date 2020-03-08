package com.nopcommerce.login;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Login_01_RegisterAndLogin {

	private WebDriver driver;
	private Select select;
	private String email, password;

	@BeforeTest
	public void beforeTest() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		
		email="corona"+RandomNumber()+"@gmail.com";
		password="coronavirus";
	}

	@Test
	public void TC_01_RegisterToSystem() {

		// Click to Register link
		driver.findElement(By.cssSelector(".ico-register")).click();

		// Click mail radio button
		driver.findElement(By.cssSelector("#gender-male")).click();

		// Input to firstname textbox
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Corona");

		// Input to lasttname textbox
		driver.findElement(By.cssSelector("#LastName")).sendKeys("Virus");

		// Select item in Day
		select = new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthDay']")));
		select.selectByVisibleText("1");
		// Select item in Month
		select = new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthMonth']")));
		select.selectByVisibleText("February");

		// Select item in Year
		select = new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthYear']")));
		select.selectByVisibleText("1997");

		// Input to email text box
		driver.findElement(By.cssSelector("#Email")).sendKeys(email);

		// Input to company text box
		driver.findElement(By.cssSelector("#Company")).sendKeys("CoronaCompany");

		// Input to password text box
		driver.findElement(By.cssSelector("#Password")).sendKeys(password);

		// Input to confirm password text box
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys(password);

		// Input to firstname textbox
		driver.findElement(By.cssSelector("#register-button")).click();

		// Verify register success
		String resultText = driver.findElement(By.cssSelector(".result")).getText();
		Assert.assertEquals(resultText, "Your registration completed");

		// Click to Logout link
		driver.findElement(By.cssSelector(".ico-logout")).click();
	}

	@Test
	public void TC_02_LoginToSystem() {
		// Click to Login link
		driver.findElement(By.cssSelector(".ico-login")).click();
		
		// Input to email text box
		driver.findElement(By.cssSelector("#Email")).sendKeys(email);
		
		// Input to password text box
		driver.findElement(By.cssSelector("#Password")).sendKeys(password);
		
		// Input to Login Button
		driver.findElement(By.cssSelector(".login-button")).click();
		
		//Verify My Account Link displayed
		Assert.assertTrue(driver.findElement(By.cssSelector(".ico-account")).isDisplayed());
		

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
