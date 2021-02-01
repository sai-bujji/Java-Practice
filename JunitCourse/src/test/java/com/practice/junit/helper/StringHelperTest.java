package com.practice.junit.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {
	
	@BeforeClass
	
	public static void beforeClass() {
		System.out.println("====before class=========");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("=====before method====");
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testArraySort_randaomArray() {
		int[] numbers = {12, 3, 4, 1};
		int[] expected = {1, 3, 4, 12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_randaomArray1() {
		int[] numbers = null;
			
		Arrays.sort(numbers);
		
	}
	
	@After
	public void afterTest() {
		System.out.println("========after method=====");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("=========after class=======");
	}

}
