package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

	WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
	alert.click();
	Thread.sleep(3000);
	
	//driver.switchTo().alert().accept();
	
	//System.out.println(driver.switchTo().alert().getText());
	
	String alertmassage=driver.switchTo().alert().getText();
	System.out.println(alertmassage);
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().dismiss();
	

	}
	
	}


