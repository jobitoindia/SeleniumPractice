package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement srcElement=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement destElement=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		((JavascriptExecutor) driver).executeScript("scroll(0,250);"); //verticle scroll by 250 pixelx

		act.dragAndDrop(srcElement, destElement).perform();

	}

}
