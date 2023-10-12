package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			
		WebElement Frame1=driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
		driver.switchTo().frame(Frame1);
		Thread.sleep(1000);
		
		WebElement D1=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
		D1.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		WebElement Frame2=driver.findElement(By.xpath("//*[@id=\"frm2\"]"));
		driver.switchTo().frame(Frame2);
		Thread.sleep(3000);
		
		WebElement D2=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
		D2.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		WebElement Frame3=driver.findElement(By.xpath("//*[@id=\"frm3\"]"));
		driver.switchTo().frame(Frame3);
		Thread.sleep(3000);
		
		WebElement D3=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
		D3.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
	     driver.close();
		
	
			
	}

}
