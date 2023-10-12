package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TravellingDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibh\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		WebElement country=driver.findElement(By.xpath("//input[@id='autosuggest']"));                  //for country
		 System.out.println(country.isDisplayed());
		 System.out.println(country.isEnabled());
		 country.click();
		 country.sendKeys("Ind");
		 Thread.sleep(3000);
		// country.clear();
		/* country.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(3000);
		 country.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(3000);
		 country.sendKeys(Keys.ENTER);*/
		 
		WebElement departure=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		departure.click();
		Thread.sleep(3000);
		
		WebElement From=driver.findElement(By.xpath("//a[@text='Pune (PNQ)']"));                       // From
		From.click();
		System.out.println(From.getText());
		
		WebElement To=driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[1]/a"));    // To
		To.click();
		System.out.println(To.getText());
		
		 
		 WebElement checkbox=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']"));       //for check box
		 checkbox.click();
		 Thread.sleep(3000);
		 
		 WebElement currency=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));  //for currency
		 currency.click();
		 Thread.sleep(3000);
		 System.out.println("Done");
		
		 Select s=new Select( currency);          //for currency creat object for class
		 s.selectByIndex(1);
		 currency.click();
		 Thread.sleep(3000);
		 System.out.println("Done");
		 
		 WebElement trip=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));    //for trip
		 trip.click();
		 Thread.sleep(3000);
		 System.out.println("Done");
		 
		  List<WebElement>dropdowncountry=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));   //loop for country
		 
		 for(int i=1;i<dropdowncountry.size();i++)
		 {
			 if(dropdowncountry.get(i).getText().equalsIgnoreCase("india"));
			 {
				 dropdowncountry.get(i).click();
			 }
		 }
	
	  driver.close();
	
	}}
		 
		 
		 
		
		

	


