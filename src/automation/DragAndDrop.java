package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			
			WebElement source=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
			Thread.sleep(3000);
			
			WebElement target=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
			Thread.sleep(3000);
			
			Actions a=new Actions(driver);
			Thread.sleep(3000);
			a.dragAndDrop(source, target).build().perform();
			
			WebElement Source1=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
			Thread.sleep(3000);
			
			WebElement target1=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
			Thread.sleep(3000);
			a.dragAndDrop(Source1, target1).build().perform();
			
			WebElement source2=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
			Thread.sleep(3000);
			
			WebElement target2=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
			Thread.sleep(3000);
			a.dragAndDrop(source2, target2).build().perform();
			
			WebElement source3=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
			Thread.sleep(3000);
			
			WebElement target3=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
			Thread.sleep(3000);
			a.dragAndDrop(source3, target3).build().perform();
			
			WebElement source4=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
			Thread.sleep(3000);
			
			WebElement target4=driver.findElement(By.xpath("//*[@id=\"box102\"]"));
			Thread.sleep(3000);
			a.dragAndDrop(source4, target4).build().perform();
			
			WebElement source5=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
			Thread.sleep(3000);
			
			WebElement target5=driver.findElement(By.xpath("//*[@id=\"box101\"]"));
			Thread.sleep(3000);
			a.dragAndDrop(source5, target5).build().perform();
			
			WebElement source6=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
			Thread.sleep(3000);
			
			WebElement target6=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
			Thread.sleep(3000);
			a.dragAndDrop(source6, target6).build().perform();
			
			WebElement source7=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
			Thread.sleep(3000);
			
			WebElement target7=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
			Thread.sleep(3000);
			a.dragAndDrop(source7, target7).build().perform();
			
			//driver.close();
			
			
			

	}

}
