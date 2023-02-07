package TestNG_Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert_TestNG  //IF ASSERT FAIL FOUND THEN WHOLE CLASS WILL  MARK AS FAIL (EXCEPTION)
{
	@Test
	public void createContact()  //ONLY THIS METHOD WILL STOP AFTER THE ASSERT ERROR FROM
	{
		System.out.println("STEP:-1");
		System.out.println("STEP:-2");
		Assert.assertEquals(false, true);
		              //(actual, expected) //AFTER THIS LINE IF FAIL AND OTHER TEST WILL WORK
		System.out.println("STEP:-3");
		System.out.println("STEP:-4");
	}
	@Test
	public void modifyContact()    //THIS AND ANY OTHER SCRIPT WILL BE EXECUTED AS IT IS
	{
		System.out.println("STEP:-5");
		System.out.println("STEP:-6");
	}
	
	@Test 
	public void assertExample()
	{
		String actualName = "abinash";
		String expName = "abinash das";
		Assert.assertEquals(actualName, expName);
	}
}
