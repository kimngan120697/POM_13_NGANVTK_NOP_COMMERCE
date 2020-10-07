package commons;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	WebDriver driver;
	
	//Selenium WebBrowser
	public void openUrl(String value) {
		driver.get(value);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageSourceCode() {
		return driver.getPageSource();
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	public void forward() {
		driver.navigate().forward();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void sendkeyToAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public String getTextAlert() {
		return driver.switchTo().alert().getText();
	}
	
	public void waitForAlertPresence() {
	
	}
	
	public void switchToWindowByID() {
		
	}
}
