package page_Classes;

import org.openqa.selenium.By;


public class Amazon_Page extends Base_Page {
    
	
	public static By byAmazon_Signinbutton= By.xpath("//span[contains(text(),'Hello. Sign in')]");
	
	public static By byAmazonIcon= By.xpath("//span[contains(text(),'Amazon')]");
	
	public static By byCartItemsCount= By.id("nav-cart-count");
	
	public static By byDeliveryLocation= By.xpath("//span[contains(text(),'Pune')]");
	
	
	
	
////////////////////////////////////////////////////////////
//////////////////////  Validators  ////////////////////////
///////////////////////////////////////////////////////////
	
	public static boolean IsAmazonIconPresent() {
		return IsElementDisplayed(byAmazonIcon, "Amazon_Icon_on_AmazonPage");	
	}
	
	public static boolean IsAmazonSignInButtonPresent() {
		return IsElementDisplayed(byAmazon_Signinbutton, "Amazon_signin_button");	
	}
	
	public static boolean IsAmazonCartItemsCountPresent() {
		return IsElementDisplayed(byCartItemsCount, "Amazon_cartcount_button");	
	}
	
	public static boolean IsAmazonDeliveryLocationPresent() {
		return IsElementDisplayed(byDeliveryLocation, "AmazonlocationButton");	
	}
	
	
	
	
////////////////////////////////////////////////////////////
//////////////////////Clickers  ////////////////////////
///////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
////////////////////////////////////////////////////////////
//////////////////////Setters  ////////////////////////
///////////////////////////////////////////////////////////	
	
	
	
}
