package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("8208134076");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Jobito@123354546");
		
		WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();
		
	}

}
