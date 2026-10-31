package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TCS {
	public WebDriver driver;
	public String landingpageproductname;
	public PageObjectManager POM;				//Initialization
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TCS() throws IOException
	{
		testBase=new TestBase();
		this.driver = testBase.WebDriverManager(); 
		POM=new PageObjectManager(driver);
		genericUtils=new GenericUtils(driver);
	}
}
