package otherprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrool_Down_OpenWindow {
	
	@Test
	
	public void Scrolldown() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			
			Actions a=new Actions(driver);
			
			WebElement Openwindow=driver.findElement(By.xpath("//button[@id='openwindow']"));
			a.moveToElement(Openwindow).build().perform();
			Thread.sleep(3000);
			Openwindow.click();
			Thread.sleep(3000);
			
			
		
			
			
			
			
			
			
	}

}
