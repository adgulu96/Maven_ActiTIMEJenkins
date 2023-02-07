package TestNG_Concepts;

import org.testng.annotations.Test;

public class Ignore_particular_testMethod 
    {
		@Test (priority = 1)
		public void createTest()
		{
			System.out.println("I will run first");
		}
		@Test (enabled = false) //This particular method will be not executed means ignored
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

