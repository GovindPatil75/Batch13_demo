package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testsoftassert {
	
	
	@Test
	public void test3() {
		
		SoftAssert soft=new SoftAssert();
		
		String expected="Test";
		
		String actual ="Test1";
		
		soft.assertEquals(actual, expected); // 
		
		System.out.println("BugSpotter");
		
		soft.assertAll(); // throw
		
	}

}
