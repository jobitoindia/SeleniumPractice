package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("JOBITO");
		
		userName.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		Thread.sleep(3000);
		userName.clear();

		

	}

}
