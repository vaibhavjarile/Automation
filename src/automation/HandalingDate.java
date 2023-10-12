package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingDate {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement Date=driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button"));
		Date.click();
		
	//	WebElement Date1=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		//Date1.click();
		
		List<WebElement> d=driver.findElements(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		for(WebElement D:d)
		{
			if(D.getText().equalsIgnoreCase("16"));
			
			{
				D.click();
				break;
			}
		
	
		}
		


	}

}
