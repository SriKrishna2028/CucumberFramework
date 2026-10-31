package stepDefinitions;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TCS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;

public class offerpagestepdefinition {
public WebDriver driver;
public String landingpageproductname;
public String offerpageproductname;
PageObjectManager POM;
TCS testContextSetup;

public offerpagestepdefinition(TCS testContextSetup)
{
	this.testContextSetup=testContextSetup;
}
	
	@Then("^User searched for (.+) shortname in the offers page$")
	public void user_searched_for_the_same_shortname_in_the_offers_page(String shortname) throws InterruptedException {
		
		

		switchtoofferpage();
		OffersPage offer=testContextSetup.POM.getOffersPage();
		offer.searchitem(shortname);
				
		
//		
		offerpageproductname=offer.getproductname(shortname);
		
	}	
public void switchtoofferpage()
{		
//	if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
//	POM=new PageObjectManager(testContextSetup.driver);   (no need)
	
	LandingPage land=testContextSetup.POM.getLandingPage();
	
//	LandingPage land=new LandingPage(testContextSetup.driver);  (no need due to previous step)
	land.topdealpage();
	testContextSetup.genericUtils.SwitchWindowToChild();
	
	
//Set<String> a=testContextSetup.driver.getWindowHandles();
//Iterator<String> b=a.iterator();
//String parantid=b.next();
//String childid=b.next();
//testContextSetup.driver.switchTo().window(childid);
}
	@And ("Validate product name matches with the landing page")
		public void validate() { 
			
			
			Assert.assertEquals(offerpageproductname, testContextSetup.landingpageproductname);
			
		}  
	    	
	}

