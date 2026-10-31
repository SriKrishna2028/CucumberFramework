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
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;

public class checkoutPageStepDefinition {
public WebDriver driver;
public String landingpageproductname;
public String offerpageproductname;
public CheckoutPage check;
TCS testContextSetup;
public checkoutPageStepDefinition(TCS testContextSetup)      //Instance Variable
{
	this.testContextSetup=testContextSetup;
	this.check=testContextSetup.POM.getCheckoutPage();  ///object
}

@Then("^User proceeds to checkout and validate the (.+) items in the checkout page$")
public void User_proceeds_to_checkout_and_validate(String name) throws InterruptedException
{
	check.CheckoutItems();
	// Assignment step(Assertion to extract name from the screen and compare with the name)
	Thread.sleep(2000);
}

 
@Then("Verify user has ability to enter promo code and place the order")
public void Verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	       
	Assert.assertTrue(check.VerifyPromoBtn());
	Assert.assertTrue(check.VerifyPlaceOrder());
	}





}

