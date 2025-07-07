package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,250);"); //verticle scroll by 250 pixelx
		((JavascriptExecutor) driver).executeScript("scroll(200,0);"); //horizontal scroll by 200 pixels
		
		Actions act=new Actions(driver);
		WebElement dblclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		act.moveToElement(dblclick).doubleClick(dblclick).build().perform();
		act.doubleClick(dblclick).perform();
		
		WebElement rtClik=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rtClik).perform();
		
	}

}
