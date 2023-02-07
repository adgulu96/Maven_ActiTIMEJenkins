package TestNG_Concepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_TestNG 
{
	@Test
	public void createContact()
	{
		System.out.println("STEP:-1");
		System.out.println("STEP:-2");
		System.out.println("STEP:-3");
		
		//SOFT ASSERT IN TESTNG not a static method, we have to create a instance of softassert class
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, false); //after assert failing also all the rest of code will get executed
		System.out.println("STEP:-4");
		System.out.println("STEP:-5");
		System.out.println("STEP:-6");
		//assertAll() should be always written in the last of the script always 
		soft.assertAll();                //use to track the assert error it is mandatory to know the error
	}
	
	@Test
	public void modifyContact()
	{
		System.out.println("STEP:-7");
		System.out.println("STEP:-8");
		System.out.println("STEP:-9");
	}
}
