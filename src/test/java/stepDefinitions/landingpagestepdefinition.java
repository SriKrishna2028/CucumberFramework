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

public class landingpagestepdefinition {
public WebDriver driver;
public String landingpageproductname;
public String offerpageproductname;
TCS testContextSetup;
LandingPage land;
public landingpagestepdefinition(TCS testContextSetup)      //Instance Variable
{
	this.testContextSetup=testContextSetup;
	this.land=testContextSetup.POM.getLandingPage();
}
      
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		Assert.assertTrue(land.getTitleLandingPage().contains("GreenKart"));
		
//		testContextSetup.driver= new ChromeDriver();
//		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		testContextSetup.driver.manage().window().maximize();
	    
	}
	@When("^User search for a product with shortname (.+) and capture the actual product name$")
	public void user_search_for_a_product_with_shortname_and_capture_the_actual_product_name(String shortname) throws InterruptedException {
		
		
		land.searchitem(shortname);
//		testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
	    Thread.sleep(2000);
	    testContextSetup.landingpageproductname=land.getProductName().split("-")[0].trim();
	   System.out.println(landingpageproductname);
	}
	
	@When("Added {string} items of the selected products to the cart")
	public void Added_items_of_the_selected_products_to_the_cart(String quantity)
	{
		land.incrementQuantity(Integer.parseInt(quantity));
		land.addToCart();
	}
	
	
	
	 
	    	
	}

