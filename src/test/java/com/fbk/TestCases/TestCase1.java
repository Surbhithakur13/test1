package com.fbk.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	int a=10,b=20;
	@Test
	public void add()
	{
		
	Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		System.out.println("Subtract");
	Assert.assertEquals(-10, a-b);
	}
}
