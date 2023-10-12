package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_CollegeSite {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.unipune.ac.in/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			
			Actions a=new Actions(driver);
			
			WebElement Abouttheuni=driver.findElement(By.xpath("//span[@id='stUI5_txt']"));
			Thread.sleep(3000);
			a.moveToElement(Abouttheuni).build().perform();
			Thread.sleep(3000);
			
			WebElement Academics=driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
			Thread.sleep(3000);
			a.moveToElement(Academics).build().perform();
			Thread.sleep(3000);
			
			WebElement Research=driver.findElement(By.xpath("//span[@id='stUI184_txt']"));
			Thread.sleep(3000);
			a.moveToElement(Research).build().perform();
			Thread.sleep(3000);
			
			WebElement Administration=driver.findElement(By.xpath("//span[@id='stUI194_txt']"));
			Thread.sleep(3000);
			a.moveToElement(Administration).build().perform();
			Thread.sleep(3000);
			
			WebElement BOD=driver.findElement(By.xpath("//span[@id='stUI215_txt']"));
			Thread.sleep(3000);
			a.moveToElement(BOD).build().perform();
			Thread.sleep(3000);
			
			WebElement StudentCorner=driver.findElement(By.xpath("//span[@id='stUI229_txt']"));
			Thread.sleep(3000);
			a.moveToElement(StudentCorner).build().perform();
			Thread.sleep(3000);
			
			WebElement UsefulLink=driver.findElement(By.xpath("//span[@id='stUI253_txt']"));
			Thread.sleep(3000);
			a.moveToElement(UsefulLink).build().perform();
			Thread.sleep(3000);
			
			driver.close();
			
					
					
					
					
					
					
					
					
					
					

	}

}
