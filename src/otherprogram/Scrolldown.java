package otherprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolldown {

	
	@Test
	public void v() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			
			WebElement MouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
			Thread.sleep(3000);
			
			Actions a=new Actions(driver);
			a.moveToElement(MouseHover).build().perform();
			Thread.sleep(3000);
			
			WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
			Thread.sleep(3000);
			reload.click();
			Thread.sleep(3000);
	}
}
