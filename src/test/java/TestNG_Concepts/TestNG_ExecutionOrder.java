package TestNG_Concepts;

import org.testng.annotations.Test;

public class TestNG_ExecutionOrder 
{
  //if not mentioned any priority then order of execution will be in alphabetical order
	@Test
	public void a()
	{
		System.out.println("I will run first");
	}
	@Test
	public void b()
	{
		System.out.println("I will run second");
	}
	@Test
	public void c()
	{
		System.out.println("i will run third");
	}
}
