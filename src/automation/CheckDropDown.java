package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement checkdropdown1=driver.findElement(By.xpath("//option[@value='option1']"));
		checkdropdown1.click();
		System.out.println(checkdropdown1.isDisplayed());
		System.out.println(checkdropdown1.isSelected());
		Thread.sleep(2000);
		 
		 WebElement checkdropdown2=driver.findElement(By.xpath("//option[@value='option2']"));
		 checkdropdown2.click();
		 System.out.println(checkdropdown2.isDisplayed());
		 System.out.println(checkdropdown2.isEnabled());
		 Thread.sleep(3000);
		 
		 WebElement checkdropdown3=driver.findElement(By.xpath("//option[@value='option3']"));
		 checkdropdown3.click();
		 System.out.println(checkdropdown3.isDisplayed());
		 System.out.println(checkdropdown3.isEnabled());
		 Thread.sleep(3000);
		 
		 List<WebElement>Dropdown=driver.findElements(By.xpath("//select[@id='dropdown-class-example']"));
		 
		 for(int i=0;i<Dropdown.size();i++)
		 {
			 Dropdown.get(i).click();
		 }
		 
		 for(WebElement v:Dropdown)
		 {
			 v.click();
		 }
		 
		 driver.close();
		 
		 
		 

	}

}
