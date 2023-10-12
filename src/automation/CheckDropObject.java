package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropObject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dropdownbutton=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        System.out.println(dropdownbutton.isSelected());
		System.out.println(dropdownbutton.isEnabled());
		dropdownbutton.click();
		Thread.sleep(3000);
		
  		Select s=new Select(dropdownbutton);     // creat Object for select class
		s.selectByIndex(1);                      //by index
		Thread.sleep(3000);
		
		s.selectByVisibleText("Option1");        //by visible text
		s.selectByVisibleText("Option2"); 
		s.selectByVisibleText("Option3"); 
	    Thread.sleep(3000);
	    
	   // s.selectByValue("Option1");
	    
	    List<WebElement> V=s.getOptions();
	    
	    for(int i=1;i<V.size();i++)
	    {
	    	System.out.println(V.get(i).getText());
	    }
		 
	    driver.close();   
		
	}

}
