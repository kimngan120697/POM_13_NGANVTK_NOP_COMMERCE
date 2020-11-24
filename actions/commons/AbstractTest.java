package commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AbstractTest {
	
	WebDriver driver;
	public WebDriver getBrowserDriver(String browserName){
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("headless_chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1366x768"); // Phải set size vì nó k có GUI
			driver = new ChromeDriver(options); // Nhét option vào
		} else if (browserName.equalsIgnoreCase("headless_firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\resources\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1366x768"); // Phải set size vì nó k có GUI
			driver = new FirefoxDriver(options); // Nhét option vào...
		}
		driver.get(GlobalConstants.DEV_URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
