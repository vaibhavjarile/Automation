package otherprogram;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 100)
	
	public void LaunchBrowser()
	{
		System.out.println("Launch the mention url");
	}
	
	@Test(priority = 200)
	public void Login()
	{
		System.out.println("Login to page");
	}
	
	@Test(priority = 300)
	public void CloseBrowser()
	{
		System.out.println("Close the brower");
	}

}
