package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		
		WebElement slider1=driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		a.clickAndHold(slider1).moveByOffset(-150, 0).build().perform();
		Thread.sleep(3000);
		
		WebElement slider2=driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		a.clickAndHold(slider2).moveByOffset(100, 0).build().perform();
		Thread.sleep(3000);
		
		WebElement slider3=driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		a.clickAndHold(slider3).moveByOffset(150, 0).build().perform();
		Thread.sleep(3000);

	}

}
