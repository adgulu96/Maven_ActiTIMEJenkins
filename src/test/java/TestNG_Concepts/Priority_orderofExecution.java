package TestNG_Concepts;

import org.testng.annotations.Test;

public class Priority_orderofExecution 
{
	@Test (priority = 1)
	public void createTest()
	{
		System.out.println("I will run first");
	}
	@Test (priority = 2)
	public void updateTest()
	{
		System.out.println("I will run second");
	}
	@Test (priority = 3)
	public void modifyTest()
	{
		System.out.println("i will run third");
	}
}

