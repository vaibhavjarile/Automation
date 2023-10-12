package otherprogram;

import org.testng.annotations.Test;

public class Program2 {
	
	@Test(groups = {"login"})
	
	public void PlacementLogin()
	{
		System.out.println(" placement login");
	}
	
	@Test
	
	public void PlacementBrokenLinks()
	{
		System.out.println("placement broken links");
	}

}
