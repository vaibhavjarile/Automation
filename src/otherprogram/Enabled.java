package otherprogram;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled = false)
	
	public void Launch()
	{
		System.out.println("Launch the browser");
	}
	
	@Test(enabled = true)
	
	public void Close()
	{
		System.out.println("Close the browser");
	}
	
	@Test(enabled = false)
	
	public void Login()
	{
		System.out.println("Login the page");
	}

}
