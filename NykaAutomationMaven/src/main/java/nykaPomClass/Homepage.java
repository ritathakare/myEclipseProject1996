package nykaPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

		private WebDriver driver;
		
		@FindBy(xpath="//a[@title='logo']")
		private WebElement logo;
		
		@FindBy(xpath="//input[@placeholder='Search on Nykaa']")
		private WebElement search;
		
		@FindBy(xpath="//div[@class='css-6cdipv']//li[1]")
		private WebElement cosmetics;
		
		public Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
		 
	}


