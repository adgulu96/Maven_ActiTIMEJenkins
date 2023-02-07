package TestNG_Concepts;

import org.testng.annotations.Test;

public class DependsOnMethod_AndFailthen  //one method will fail and the other 2 will be skipped
	{
		@Test (priority = 1)
		public void createTest()  
		{
			int arr [] = {1,2,3};
			System.out.println(arr[5]);
		}
		@Test (dependsOnMethods = "createTest")
		public void updateTest()
		{
			System.out.println("I will run second");
		}
		@Test (dependsOnMethods = "updateTest")
		public void modifyTest()
		{
			System.out.println("i will run third");
		}
	}
