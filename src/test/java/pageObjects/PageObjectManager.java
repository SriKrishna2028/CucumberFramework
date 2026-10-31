package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage land;       					 //Global variable  //initialization
	public OffersPage offer;       					 //Global variable
	public WebDriver driver;
	public CheckoutPage check;
	
	public PageObjectManager(WebDriver driver)   	 //Constructor
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage()    			//Method
	{
	land=new LandingPage(driver);    				//Object
	return land;    				
	}
	
	
	public OffersPage getOffersPage()                         //Class
	{
		offer=new OffersPage(driver); 				//Object (every page object class expects driver as an argument for its constructor)
		return offer;
	}
	public CheckoutPage getCheckoutPage()                         //Class
	{
		check=new CheckoutPage(driver); 				//Object (every page object class expects driver as an argument for its constructor)
		return check;
	}

}
