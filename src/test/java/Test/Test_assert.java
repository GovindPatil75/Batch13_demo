package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_assert {

	
	@Test
	public void test1() {
		
		
		String expected="Test";
		
		String actual="Test1";
		
		Assert.assertEquals(actual, expected); // fail
		
		System.out.println("BugSpotter");
	}
	
	@Test
	public void test2() {
		
		
		String expected="Test";
		
		String actual="Test";
		
		Assert.assertEquals(actual, expected); // fail
		
		System.out.println("BugSpotter");
	}
}
