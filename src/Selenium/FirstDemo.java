package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		int num1,num2,num3;
		WebElement userNameField,passField,loginBtn;
		
		driver.manage().window().maximize();
		
		userNameField=driver.findElement(By.xpath("//input[@id='email']"));
		userNameField.sendKeys("8208134076");
		
		passField=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passField.sendKeys("Pune@1326");
		
		loginBtn=driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();
		
//		WebElement forgotLink=driver.findElement(By.linkText("Forgotten password?"));
//		forgotLink.click();
		
//		WebElement forgotLinkk=driver.findElement(By.partialLinkText("Forgotten"));
//		forgotLinkk.click();		
	}
}
