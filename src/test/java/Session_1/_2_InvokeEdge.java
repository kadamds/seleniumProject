package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class _2_InvokeEdge {

	public static void main(String[] args) throws InterruptedException {

		// Set the path of browser driver 
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/msedgedriver.exe");

		// Topcasting/Upcasting - Object of chromedriver class with webdriver interface
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize(); // maximize browser window 
		driver.manage().deleteAllCookies(); // delete all cookies

		// entering url to open
		driver.get("https://www.facebook.com/");
		String pageTitle = driver.getTitle();
		Thread.sleep(2000);

		// Validation
		if(pageTitle.equals("Facebook – log in or sign uppp"))
		{
			System.out.println("Page title is correct");
		}
		else {
			System.out.println("Page Title is incorrect");
		}

		driver.navigate().to("https://www.amazon.in/");
		System.out.println("Title for amazon is :" + driver.getTitle());
		
		
		
		if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Amazon title is correct");
		}
		else 
		{
			System.out.println("Amazon title is Incorrect");
		}
		
		driver.navigate().back();
		
		System.out.println("Title after navigating back is  :" + driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		System.out.println("Title after navigating forword is  :" + driver.getTitle());
		
		Thread.sleep(2000);
		
		// closing the current opened browser window
		driver.quit();

	}

}
