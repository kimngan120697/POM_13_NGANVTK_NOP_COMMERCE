package commons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPages {
	
	private WebDriverWait waitExplicit;
	private Actions action;
	private WebElement element;
	private long longTimeout=30;
	private By byXpath;
	private Select select;

	/*==============Selenium-Web-Browser===================*/
	
	//Selenium WebBrowser
	public void openUrl(WebDriver driver, String value) {
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String getPageSourceCode(WebDriver driver) {
		return driver.getPageSource();
	}
	
	public void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	public void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
    //Alert	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void sendkeyToAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public String getTextAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	
	//Windows
	public void switchToWindowByID(WebDriver driver) {
		
	}
	
	public void switchToWindowByTitle(WebDriver driver) {
		
	}
	
	public void closeAllWindowsWithoutParent(WebDriver driver) {
		
	}
	
	/*==============Selenium-Web-Element===================*/
	public WebElement findElementByXpath(WebDriver driver, String locator) {
		return driver.findElement(byXpathLocator(locator));
	}
	
	public List<WebElement> findElementsByXpath(WebDriver driver, String locator) {
		return driver.findElements(byXpathLocator(locator));
	}
	
	public By byXpathLocator(String locator) {
		return By.xpath(locator);
	}
	
	public void clickToElement(WebDriver driver, String locator) {
		findElementByXpath(driver, locator).click();
	}
	
	public void senkeyToElement(WebDriver driver, String locator, String value) {
		findElementByXpath(driver, locator).sendKeys(value);
	}
	
	public void selectItemInDropdown(WebDriver driver, String locator, String value) {
		element=findElementByXpath(driver, locator);
		select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public void getSelectedItemInDropdown(WebDriver driver) {
		
	}
	
	public void isDropdownMultiple(WebDriver driver) {
		
	}
	
	public void selectItemInCustomDropdown(WebDriver driver) {	
		
	}
	
	public String getAttributeElement(WebDriver driver, String locator, String attributeName) {
		return findElementByXpath(driver, locator).getAttribute(attributeName);
	}
	
	public String getTextElement(WebDriver driver, String locator){
		return findElementByXpath(driver, locator).getText();
	}
	
	public int countElementNumber(WebDriver driver, String locator) {
		return findElementsByXpath(driver, locator).size();
	}
	
	public void checkTheCheckbox(WebDriver driver) {
		
	}
	
	public void uncheckTheCheckbox(WebDriver driver) {
		
	}
	
	public boolean isElementDisplayed(WebDriver driver, String locator) {
		return findElementByXpath(driver,locator).isDisplayed();
	}
	
	public boolean isElementSelected(WebDriver driver, String locator) {
		return findElementByXpath(driver,locator).isSelected();
	}
	
	public boolean isElementEnabled(WebDriver driver,String locator) {
		return findElementByXpath(driver,locator).isEnabled();
	}	
	
	public void hoverMouseToElement(WebDriver driver, String locator) {
		action=new Actions(driver);
		element=findElementByXpath(driver, locator);
		action.moveToElement(element).perform();
	}
	

	// Frame / Iframe
	
	//User Intersaction
	public void doubleClickToElement(WebDriver driver) {
		
	}
	
	public void hoverMouseToElement(WebDriver driver) {
		
	}
	
	public void rightClick(WebDriver driver) {
		
	}
	
	public void dragAndDrop(WebDriver driver) {
		
	}
	
	public void sendKeyboardToElement(WebDriver driver) {
		
	}
	
	//Upload
	
	//Javascript Excutor
	
	//Wait
	public void waitForElementPresence(WebDriver driver) {
		
	}
	
	public void waitForElementIsDisplayed(WebDriver driver, String locator) {
		byXpath=byXpathLocator(locator);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(byXpath));
	}
	
	public void waitForElementClickable(WebDriver driver, String locator) {
		byXpath=byXpathLocator(locator);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(byXpath));
	}
	
	public void waitForElementInvisible(WebDriver driver, String locator) {
		byXpath=byXpathLocator(locator);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(byXpath));
	}
	
	public void waitForAlertPresence(WebDriver driver) {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.alertIsPresent());
	}
}
