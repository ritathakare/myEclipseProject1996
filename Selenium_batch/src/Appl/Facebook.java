package Appl;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args)throws InterruptedException  {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
		
WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
WebElement Login=driver.findElement(By.xpath("//button[text()='Log in']"));
//(//input[@type='radio'])[3]
userName.sendKeys("Velocity@gmail.com");
Password.sendKeys("1234566");
Login.click();


		
	}

}
