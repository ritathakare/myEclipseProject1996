package Appl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Healthcare {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hcgoncology.com/");
WebElement location=driver.findElement(By.xpath("//select[@name='location_id']"));
			location.click();	
	}
}
//(//div[@class='header-button-container']//span)[6]
//forpopup window-xpath//span[text()='close']
//select[@name='location_id']