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

public class AbstractPage {
	
	private WebDriver driver;
	private WebDriverWait waitExplicit;
	private Actions action;
	private WebElement element;
	private long longTimeout=30;
	private By byXpath;
	private Select select;
	
	public AbstractPage(WebDriver localDriver) {
		System.out.print("Driver at testcase: " + localDriver);
		driver=localDriver;
		System.out.print("Driver at abstract: " + driver);
	}
	
	/*==============Selenium-Web-Browser===================*/
	
	//Selenium WebBrowser
	public void openUrl(String value) {
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
	
    //Alert	
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
	
	//Windows
	public void switchToWindowByID() {
		
	}
	
	public void switchToWindowByTitle() {
		
	}
	
	public void closeAllWindowsWithoutParent() {
		
	}
	
	/*==============Selenium-Web-Element===================*/
	public WebElement findElementByXpath(String locator) {
		return driver.findElement(byXpathLocator(locator));
	}
	
	public List<WebElement> findElementsByXpath(String locator) {
		return driver.findElements(byXpathLocator(locator));
	}
	
	public By byXpathLocator(String locator) {
		return By.xpath(locator);
	}
	
	public void clickToElement(String locator) {
		findElementByXpath(locator).click();
	}
	
	public void senkeyToElement(String locator, String value) {
		findElementByXpath(locator).clear();
		findElementByXpath(locator).sendKeys(value);
	}
	
	public void selectItemInDropdown(String locator, String valueItem) {
		element = findElementByXpath(locator);
		select = new Select(element);
		select.selectByVisibleText(valueItem);
	}
	
	public void getSelectedItemInDropdown() {
		
	}
	
	public void isDropdownMultiple() {
		
	}
	
	public void selectItemInCustomDropdown() {	
		
	}
	
	public String getAttributeElement(String locator, String attributeName) {
		return findElementByXpath(locator).getAttribute(attributeName);
	}
	
	public String getTextElement(String locator){
		return findElementByXpath(locator).getText();
	}
	
	public int countElementNumber(String locator) {
		return findElementsByXpath(locator).size();
	}
	
	public void checkTheCheckbox() {
		
	}
	
	public void uncheckTheCheckbox() {
		
	}
	
	public boolean isElementDisplayed(String locator) {
		return findElementByXpath(locator).isDisplayed();
	}
	
	public boolean isElementSelected(String locator) {
		return findElementByXpath(locator).isSelected();
	}
	
	public boolean isElementEnabled(String locator) {
		return findElementByXpath(locator).isEnabled();
	}	
	
	public void hoverMouseToElement(String locator) {
		action=new Actions(driver);
		element=findElementByXpath(locator);
		action.moveToElement(element).perform();
	}
	

	// Frame / Iframe
	
	//User Intersaction
	public void doubleClickToElement() {
		
	}
	
	public void hoverMouseToElement() {
		
	}
	
	public void rightClick() {
		
	}
	
	public void dragAndDrop() {
		
	}
	
	public void sendKeyboardToElement() {
		
	}
	
	//Upload
	
	//Javascript Excutor
	
	//Wait
	public void waitForElementPresence() {
		
	}
	
	public void waitForElementIsDisplayed(String locator) {
		byXpath=byXpathLocator(locator);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(byXpath));
	}
	
	public void waitForElementClickable(String locator) {
		byXpath=byXpathLocator(locator);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(byXpath));
	}
	
	public void waitForElementInvisible(String locator) {
		byXpath=byXpathLocator(locator);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(byXpath));
	}
	
	public void waitForAlertPresence() {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.alertIsPresent());
	}
}
