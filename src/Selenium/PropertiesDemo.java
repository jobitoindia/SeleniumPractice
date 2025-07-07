package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("E:\\Aditi_notes\\Java_practices\\Java_Practices\\commonData.properties");

		Properties pr=new Properties();
		pr.load(fis);
		
		System.out.println(pr.getProperty("baseUrl"));
		System.out.println(pr.getProperty("usernAME"));	
		
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
		driver.get(pr.getProperty("baseUrl"));   // reading url throgh properties
		WebElement clickHereLink=driver.findElement(By.xpath("//a[contains(text(),'Click He')]"));
		
		clickHereLink.sendKeys(pr.getProperty("usernAME"));  // reading username throgh properties
			
	}

}
