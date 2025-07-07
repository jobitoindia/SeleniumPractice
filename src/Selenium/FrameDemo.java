package Selenium;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException, TimeoutException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		Thread.sleep(10000);   //hard coded wait condition
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		500 ms-- pollingtime 
				
		driver.get("https://demo.guru99.com/test/guru99home/");
		
//		driver.switchTo().frame(1);   //using index
//		driver.switchTo().frame("a077aa5e");  //using by String:name/id
		
		
		WebElement frmField=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frmField);   //using webElement
		
		WebElement bannnerImage=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		bannnerImage.click();
		
		WebElement loginBtn=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));

		WebElement signUpButton=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));

		WebDriverWait wait=new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
		
		FluentWait<WebDriver> waitt = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(20))
			    .pollingEvery(Duration.ofSeconds(5))
			    .ignoring(NoSuchElementException.class);
		
		
		
		
		
		
		
		
		
		
		
	}

}
