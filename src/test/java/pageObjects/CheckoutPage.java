package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By cartBag=By.cssSelector("img[alt='Cart']"); 
	By checkoutButton=By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
	By promoBtn=By.cssSelector("button[class='promoBtn']");
	By placeorder=By.xpath("//button[contains(text(), 'Place Order')]");

public void CheckoutItems()
{
	driver.findElement(cartBag).click();
	driver.findElement(checkoutButton).click();
}

public boolean VerifyPromoBtn()
{
	return driver.findElement(promoBtn).isDisplayed();
}
public boolean VerifyPlaceOrder()
		{
			return driver.findElement(placeorder).isDisplayed();
		}
}
