package otherprogram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindows {
	
	@Test
	
	public void handlingWindow() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("https://rahulshettyacademy.com/AutomationPractice/");
		 d.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 d.findElement(By.xpath("//button[@id='openwindow']")).click();
		 System.out.println(d.getCurrentUrl());
		 Thread.sleep(3000);
		 
		 Set<String> v=d.getWindowHandles();
		 
		 Iterator<String> is=v.iterator();
		 
		 String Rahul_Sheety=is.next();
		 
		 String Click_Academy=is.next();
		 
		 Thread.sleep(3000);
		 
		 d.switchTo().window(Click_Academy);
		 System.out.println(d.getCurrentUrl());
		 
		 d.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[2]/a")).click();
		 Thread.sleep(3000);
		 System.out.println(d.getCurrentUrl());
		 
		 
		d.switchTo().window(Click_Academy);
		 Thread.sleep(3000);
		
		 //d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		// Thread.sleep(3000);
		
		 d.switchTo().window(Rahul_Sheety);
		 System.out.println(d.getCurrentUrl());
		 Thread.sleep(3000);
		 
		 d.quit();
		 
		 
	}

}
