package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeXp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		WebElement UN=driver.findElement(By.id("username"));
		UN.click();
		UN.sendKeys("vaibhavjarile@gmail.com");
		Thread.sleep(3000);
		System.out.println("Done");
		
		WebElement PWD=driver.findElement(By.id("password"));
		PWD.click();
		PWD.sendKeys("vaibhav@1");
		Thread.sleep(3000);
		System.out.println("Done");
		
		WebElement Login=driver.findElement(By.id("Login"));
		Login.click();
		
		//driver.close();
	}

}
