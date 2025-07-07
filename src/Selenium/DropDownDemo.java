package Selenium;

import java.awt.Image;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JulyBatch\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		
		String str;
		driver.get("https://demo.guru99.com/homepahe");
		
		List<WebElement> imgCount=driver.findElements(By.xpath("//img"));
		int homePageLinkCount=imgCount.size();
		
		driver.get("https://demo.guru99.com/reg");
		List<WebElement> regimgCount=driver.findElements(By.xpath("//img"));
		int RegPageLinkCount=regimgCount.size();

		driver.get("https://demo.guru99.com/login");
		
		List<WebElement> LoginimgCount=driver.findElements(By.xpath("//img"));
		int LoginPageLinkCount=LoginimgCount.size();
		
		int allPageLinkCount=RegPageLinkCount+homePageLinkCount+LoginPageLinkCount;
		System.out.println("ALl links on my page:"+allPageLinkCount);
	
	}
}
