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
		

		// Click mail radio button

		// Input to firstname textbox

		// Input to lasttname textbox

		// Select item in Day
		// Select item in Month

		// Select item in Year

		// Input to email text box

		// Input to company text box

		// Input to password text box

		// Input to confirm password text box

		// Input to firstname textbox

		// Verify register success

		// Click to Logout link
	}

	@Test
	public void TC_02_LoginToSystem() {
		// Click to Login link
		
		// Input to email text box
		
		// Input to password text box
		
		// Input to Login Button
		
		//Verify My Account Link displayed
		

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
