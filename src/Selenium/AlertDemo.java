package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement custIDField=driver.findElement(By.xpath("//input[@name='cusid']"));
		custIDField.sendKeys("53920");
		
		Thread.sleep(3000);
		
		WebElement sumbitBtn=driver.findElement(By.xpath("//input[@name='submit']"));
		sumbitBtn.click();
		
		Alert alert=driver.switchTo().alert();
		//alert.dismiss();  // it will click on cancel button
		//alert.accept();     // it will click on ok/sumit button
		String alertMsg=alert.getText();
		
		alert.sendKeys("hi");
		
		if(alertMsg.equals("Do you really want to delete this Customer?")) {
			System.out.println("Error message is correct");
		}
		else {
			System.out.println("incorrect error message");
		}
		
		
		
		
		
	}

}
