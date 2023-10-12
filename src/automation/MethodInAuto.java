package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodInAuto {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	
	driver.navigate().back();
	System.out.println("Done");
	Thread.sleep(3000);
	
	driver.navigate().forward();
	System.out.println("Done");
	
	driver.close();
	driver.quit();
	
	

	}

}
