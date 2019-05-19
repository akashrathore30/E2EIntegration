package test_Classes;

import org.testng.annotations.Test;


public class Practise  {

	@Test(priority=0, groups={"regression", "smoke"})
	public void testA(){
		System.out.println("In testA of priority 1");
	}
	@Test(priority=1,groups={"smoke"})
	public void testB(){
		System.out.println("In testB of priority 1");
		
	}
	@Test(priority=1,groups={"regression"})
	public void testC(){
		System.out.println("In testC of priority 1");
		
	}
	@Test(priority=2,groups={"smoke"})
	public void testD(){
		System.out.println("In testD of priority 2");
		
	}
	@Test(priority=1,groups={"smoke"})
	public void testE(){
		System.out.println("In testE of priority 1");
		
	}
	@Test(priority=3,groups={"regression"})
	public void testF(){
		System.out.println("In testF of priority 3");
		
	}
	

}
