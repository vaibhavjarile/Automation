package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardKeys {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);

			WebElement UN=driver.findElement(By.name("username"));
			UN.sendKeys("Admin");
			Thread.sleep(3000);
			UN.sendKeys(Keys.CONTROL+"a");
			Thread.sleep(3000);
			UN.sendKeys(Keys.CONTROL+"c");
			Thread.sleep(3000);
			UN.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			
			WebElement PWD=driver.findElement(By.name("password"));
			PWD.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(3000);
			PWD.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
			PWD.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
			PWD.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
			PWD.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
			PWD.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
		    PWD.sendKeys("admin123");
			Thread.sleep(2000);
			
			WebElement Login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]"));
			Login.click();
			Thread.sleep(3000);
			
			driver.close();
			
			
		
	
	}

}
