package otherprogram;

import org.testng.annotations.Test;

public class Program1 {
	
	@Test(groups = {"login"})
	
	public void AdmissionLogin()
	{
		System.out.println("Admission Login");
	}
	
	@Test
	
	public void AdmissionBrokenLinkks()
	{
		System.out.println("Admission broken links");
	}

}
