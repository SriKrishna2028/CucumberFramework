 package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;  			//Global variable
	//instead of using public WebDriver driver; we use 
	 // 1. Change the global variable to ThreadLocal
//	private static ThreadLocal<WebDriver> tDriver = new ThreadLocal<>(); //This gives each thread its own separate slot for a WebDriver instance.
	
	 // 2. Add a helper method to easily get the driver instance for the current thread
//    public static WebDriver getDriver() {
//        return tDriver.get();
//    }
	
	public WebDriver WebDriverManager() throws 
IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		
		
		String browser_properties=prop.getProperty("browser");//new line...this is coming from properties
		String browser_maven=prop.getProperty("browser");//new line.. this is coming from maven
		 //result=testCondition? value1 : value2
		
		String browser=browser_maven!=null? browser_maven : browser_properties;  //new
		
		
		// 3. Check using getDriver() instead of a direct null check
//        if (getDriver() == null) 
//        {
//            WebDriver localDriver = null; // Temporary reference
		//continue rest with line 48 
				
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
		driver= new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				driver= new FirefoxDriver();
			}
			 // 4. Set the newly created driver into the ThreadLocal container
//            tDriver.set(localDriver);
			// 5. Always interact with the driver via getDriver()
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.manage().window().maximize();
		}
			
		
		return driver;
		
	}

}
