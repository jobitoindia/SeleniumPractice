package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();		
		
		TakesScreenshot srcTakeScr= (TakesScreenshot)driver;
		
		File srcFile=srcTakeScr.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("E:\\Notes\\indiaImg.png");
		
		org.openqa.selenium.io.FileHandler.copy(srcFile, destFile);
		
	}

}
