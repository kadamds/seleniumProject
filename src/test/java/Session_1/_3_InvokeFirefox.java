package Session_1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class _3_InvokeFirefox {

	public static void main(String[] args) {

		// Set the path of browser driver 
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");

		// Topcasting/Upcasting - Object of chromedriver class with webdriver interface
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize(); // maximize browser window 
		driver.manage().deleteAllCookies(); // delete all cookies

		// entering url to open
		driver.get("https://web.whatsapp.com/");
		String pageTitle = driver.getTitle();

		// Validation
		if(pageTitle.equals("WhatsApp"))
		{
			System.out.println("Page title is correct");
		}
		else {
			System.out.println("Page Title is incorrect");
		}

		// closing the current opened browser window
		driver.quit();

	}

}