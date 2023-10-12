package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //to enter url
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Done");
		
		WebElement UN=driver.findElement(By.name("username")); //locate username by using name locater
		UN.click();                                          //to perform opretion
		UN.sendKeys("vaibhavjarile@gmail.com");
		Thread.sleep(3000);
		System.out.println("Done");
		
		WebElement PWD=driver.findElement(By.name("password"));
		PWD.click();
		PWD.sendKeys("vaibhav@1");
		Thread.sleep(3000);
		System.out.println("Done");
		
		WebElement Login=driver.findElement(By.tagName("button"));
		Login.click();
		Thread.sleep(3000);
		System.out.println("Done");
		
		
		driver.close();
		
		
	}

}
