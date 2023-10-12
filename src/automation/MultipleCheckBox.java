package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox {                                              //For check box

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//checkbox1.click();
		Thread.sleep(3000);
		
		System.out.println(checkbox1.isEnabled());
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		
		List<WebElement>v=driver.findElements(By.xpath("//input[@type='checkbox']"));  //for selection of multiple check box
		for(int i=0;i<v.size();i++)               //Loop
		{
			v.get(i).click();
		}
        for(WebElement s:v)        
        {
        	s.click();
        	Thread.sleep(3000);
         }
        
	}

}
