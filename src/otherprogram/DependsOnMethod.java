package otherprogram;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(dependsOnMethods = "LaunchBrowser")
	
	public void Login()
	{
		System.out.println("Login to the page");
	}
	
	@Test( dependsOnMethods = "CloseBrowser" )
	
	public void LaunchBrowser()
	{
		System.out.println("Launch the browser");
	}
	
	@Test
	
	public void CloseBrowser()
	{
		System.out.println("Close the browser");
	}

}
