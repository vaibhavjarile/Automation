package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingFrame1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement Frame1=driver.findElement(By.xpath("//*[@id=\"courses-iframe\"]"));
		driver.switchTo().frame(Frame1);
		Thread.sleep(3000);
		
		WebElement blog=driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a"));
		blog.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		

	}

}
