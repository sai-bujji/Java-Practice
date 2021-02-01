package com.practice.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper = new StringHelper();
	private String input;
	private String expected;
		
	public StringHelperParameterizedTest(String input, String expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

	@BeforeClass	
	public static void beforeClass() {
		System.out.println("====before class=========");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("=====before method====");
	}
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String expectedOutPuts[][]= {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutPuts);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
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
