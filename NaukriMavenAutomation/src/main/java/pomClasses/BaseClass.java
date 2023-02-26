package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	WebDriver driver; 
	public BaseClass(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	   this.driver=driver; // Initialization of 
	   Actions act = new Actions(driver);//Local webdriver variable
	   NoSuchMethodError obj = new NoSuchMethodError();
	}
}
