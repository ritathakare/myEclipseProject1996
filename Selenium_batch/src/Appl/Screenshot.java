package Appl;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(3000);
        TakesScreenshot t=(TakesScreenshot )driver;
        //Visible area of application in the browser
       for(int i=1;i<4;i++)
       {
        File src= t.getScreenshotAs(OutputType.FILE);
        
        File dest=new File("C:\\Users\\Rita\\Pictures\\Screenshots\\practice\\Test"+i+".jpg");
        
        FileHandler.copy(src, dest);
       }
        
        
        
        
}
}