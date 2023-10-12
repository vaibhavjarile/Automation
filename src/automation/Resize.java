package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		
		WebElement arrow=driver.findElement(By.xpath("(//div[@style='z-index: 90;'])[3]"));
	   // a.clickAndHold(arrow).moveByOffset(50, 50).build().perform();
	    
	    a.clickAndHold(arrow).dragAndDropBy(arrow, 150, 200).build().perform();
	    
	}

}
