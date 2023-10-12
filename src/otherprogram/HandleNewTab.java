package otherprogram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleNewTab {

	@Test
	
	public void HandalingTab() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(3000);
		
		Set<String> v=driver.getWindowHandles();
		
		Iterator<String> it=v.iterator();
		
			String Rahul_Sheety=it.next();
			
			String Click_Academy=it.next();
			
			Thread.sleep(3000);
			
			driver.switchTo().window(Click_Academy);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
			Thread.sleep(3000);
			
			driver.close();
		
	}
}


