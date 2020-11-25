package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class PageGeneratorManager {

	//Cấp phát việc khởi tạo đối tượng cho Home Page
	public static HomePageObject getHomPageObject (WebDriver driver) {
		return new HomePageObject(driver); 
	}
	
	//Cấp phát việc khởi tạo đối tượng cho Register Page
	public static RegisterPageObject getRegisterPageObject(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	
	//Cấp phát việc khởi tạo đối tượng cho Login Page
	public static LoginPageObject getLoginPageObject(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
}
