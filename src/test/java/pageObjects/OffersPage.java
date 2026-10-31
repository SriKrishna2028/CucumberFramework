package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By search=By.xpath("//input[@type='search']");
	private By productname=By.cssSelector("tr td:nth-child(1)");
	
	//Action Methods
	
	public void searchitem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	public void getsearchtext(String name)
	{
		 driver.findElement(search).getText();
	}
	public String getproductname(String name)
	{
		return driver.findElement(productname).getText();
	}
	

}
