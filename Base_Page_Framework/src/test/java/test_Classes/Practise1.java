package test_Classes;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Practise1 {
	@Test
	public void testB(){
		System.out.println("In testB of priority 1");
		assertEquals("Akash", "Akash");
	}
	@Test()
	public void testA(){
		System.out.println("In testB of priority 1");
		assertEquals("Rathoresfgh", "Akash");
	}
	/*@Test(priority=1,groups={"smoke"})
	public void testC(){
		System.out.println("In testC of priority 1");
		
	}
	@Test(priority=2,groups={"smoke"})
	public void testD(){
		System.out.println("In testD of priority 2");
		
	}*/
	
}
