package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='radio1']"));
		radiobutton1.click();
		Thread.sleep(3000);
		
		WebElement radiobutton2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radiobutton2.click();
		Thread.sleep(3000);
		
		WebElement radiobutton3=driver.findElement(By.xpath("//input[@value='radio3']"));
		radiobutton3.click();
		Thread.sleep(3000);
		
		driver.close();

	}

}
