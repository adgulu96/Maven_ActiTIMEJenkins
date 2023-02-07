package TestNG_Concepts;

import org.testng.annotations.Test;
@Test //optimized
public class TestNG_Intro 
{
	//@Test  //for optimization we need to write this in before class so that no need to write this annotation in all methods
	public void m1()
	{
		System.out.println("I am first testNG method");
	}
	//@Test
	public void m2()
	{
		System.out.println("i am second testNG method");
	}
}
