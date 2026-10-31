package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
private	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	By topdeals=By.xpath("//a[text()='Top Deals']");
	By increment=By.cssSelector("a.increment");
	By addToCartBtn=By.cssSelector(".product-action button");

public void searchitem(String name)
{
	driver.findElement(search).sendKeys(name);
}
public void getsearchtext(String name)
{
	driver.findElement(search).getText();
}
public String getProductName()
{
	return driver.findElement(productname).getText();
}
public void topdealpage()
		{
			driver.findElement(topdeals).click();
		}
public String getTitleLandingPage()
{
	return driver.getTitle();
}
public void incrementQuantity(int quantity)
{
	int i=quantity-1;
	while(i>0)
	{	
	driver.findElement(increment).click();
	i--;
	
	}
}
public void addToCart()
{
	driver.findElement(addToCartBtn).click();
}
}
