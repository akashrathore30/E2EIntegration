package page_Classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PropertyFile;



public class Base_Page {
	public static WebDriver driver=initialiseDriver();
	
	public static final Logger log= Logger.getLogger(Base_Page.class);
	
	public static WebDriverWait wt=new WebDriverWait(driver, 10);

	public static WebDriver initialiseDriver() {

		String BrowserName = PropertyFile.GetPropertyObject().getProperty("Browser");
        
		System.out.println("got broser name from property file as"+ BrowserName );
		
		switch (BrowserName) {
		
		case "Firefox":
			if(driver==null) {
			FirefoxProfile fp = new FirefoxProfile();
			fp.setPreference("browser.startup.homepage", "http://www.google.com");
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/Drivers_Exe/geckodriver.exe");
			driver = new FirefoxDriver(fp);
			driver.navigate().forward();
			break;
			}

		case "Chrome":
			String CurrentWorkspace = System.getProperty("user.dir");
			System.out.println("Current Workdpace in Chrome is" + CurrentWorkspace);
			System.setProperty("webdriver.chrome.driver", CurrentWorkspace + "//Drivers_Exe/chrome.exe");
			driver = new ChromeDriver();
			
			break;

		default:
			break;
		}

		return driver;

	}

   /*public static void ClickElement(By ele) {	
	   wt.until(ExpectedConditions.visibilityOfElementLocated(ele)).click();
   }*/
   
   public static boolean IsElementDisplayed(By ele, String s) {
	   
	   try {
		wt.until(ExpectedConditions.visibilityOfElementLocated(ele));
		System.out.println(s+"element is displayed on the page");
		  return true;
	} catch (NoSuchElementException e) {
		
		e.printStackTrace();
		System.out.println(s+"Element is not present on the page");
		return false;
	}
	  catch(TimeoutException e) {
		  e.printStackTrace();
		  System.out.println(s+"Elements operation couldnot be completed in given time");
		  return false;
	   }
	   
         
	   
   }
   
   public static WebElement FindElement(By ele, String s) {
	   try {
	   return driver.findElement(ele);
	   }
	   catch(NoSuchElementException e) {
		  return null; 
	   }
   }
}
























