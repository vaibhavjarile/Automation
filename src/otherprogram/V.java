package otherprogram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class V {

	@BeforeClass
		public void i()
		{
		System.out.println("this method will execute before the class");
		}
	
	@AfterClass
		public void a()
		{
		System.out.println("this code will execute after the class");
		}
	@Test
	public void v()
	{
		System.out.println("hello");
	}
	
	
}
