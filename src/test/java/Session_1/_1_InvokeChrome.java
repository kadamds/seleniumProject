package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_InvokeChrome {
	
	public static void main(String[] args) {
		
		// Set the path of browser driver
		
		//Automation
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Batch17SeleniumWebDriver\\chromedriver.exe"); // if driver is in other location
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		 
		// Topcasting/Upcasting - Object of ChromeDriver class with WebDriver interface
		
		WebDriver driver = new ChromeDriver(); 
	      
	     driver.manage().deleteAllCookies(); // delete all cookies
	     driver.manage().window().maximize(); // maximize browser window 
	     
	     driver.get("https://www.google.co.in/"); // entering url to open
	     
	     String title = driver.getTitle();
	     String titleExpected = "Google";
	     
	     System.out.println("web page title is : "+title);
	     
	     //Validation
	     if(title.equals(titleExpected)) {
	    	 
	    	 System.out.println("Title Match");
	     }
	     else {
	    	 
	    	 System.out.println("Title doesn't match");
	     }
	
	  // closing the current opened browser window
			driver.quit();
	
	}
	

}

