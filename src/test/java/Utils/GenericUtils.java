package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SwitchWindowToChild()
	{
		Set<String> a=driver.getWindowHandles();
		Iterator<String> b=a.iterator();
		String parantid=b.next();
		String childid=b.next();
		driver.switchTo().window(childid);
	}

}
