package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	@Test
	public void strictLevelComparison() {
		String a1="hell";
		String a2="hello";
		SoftAssert s=new SoftAssert();
		s.assertEquals(a2, a1);
		System.out.println("Soft Assertion strict level completed");
		s.assertTrue(a2.equals(a1));
		s.assertAll();
		System.out.println("After assert all");
	}
	@Test
	public void containsLevelComparison() {
		String expectedCity="Delhi";
		String actualCity="New Delhi";
		
		SoftAssert s= new SoftAssert();
		s.assertTrue(actualCity.contains(expectedCity));
		s.assertAll();
		System.out.println("Soft Assertion contains level completed");
	}

}
