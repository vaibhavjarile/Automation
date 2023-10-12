package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        WebElement UN=driver.findElement(By.xpath("//input[@id='username']"));   //by using x-path
        UN.click();
        UN.sendKeys("vaibhavjarile@gmail.com");
        
        WebElement PWD=driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));  //by using x-path
        PWD.click();
        PWD.clear();
        PWD.sendKeys("vaibhav@123");
        Thread.sleep(3000);
        
        WebElement Login=driver.findElement(By.cssSelector("input[class='button r4 wide primary']"));     //by cssselector
        Login.click();
        Thread.sleep(3000);

        driver.close();
	}

}
