package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayYoutube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=NT9TKqB99tc");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement play=driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
		play.click();
		System.out.println("Done");
		Thread.sleep(3000);
		
		//driver.close();
			
		}
		

	}


