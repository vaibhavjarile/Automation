package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Opration {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			
			Actions v=new Actions(driver);
			Thread.sleep(3000);
			WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
			Thread.sleep(3000);
			v.moveToElement(mouseHover).build().perform();
			Thread.sleep(3000);
			
			mouseHover.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			mouseHover.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			mouseHover.sendKeys(Keys.ENTER);
			Thread.sleep(3000);

	}

}
