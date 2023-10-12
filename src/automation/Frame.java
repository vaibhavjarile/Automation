package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
        
		driver.switchTo().frame(0);
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		e.click();
		
		List<WebElement> L=driver.findElements(By.xpath("//*[@id=\"selectable\"]"));
		for(WebElement L1:L)
		{
			System.out.println(L1.getText());
		}
		L.get(0).click();
	}

}
