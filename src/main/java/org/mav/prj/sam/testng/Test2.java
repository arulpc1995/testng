package org.mav.prj.sam.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority=0)
	public void test1() {
		System.out.println("Test1");
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);

	}
	@Test(priority=2)
	public void test4() {
		System.out.println("Test1");
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);

	}
	@Test(priority=1)

	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(false);
		Assert.assertTrue(false);

	}
	@Test(priority=-1)
	public void test3() {
		System.out.println("test3");
		Assert.assertTrue(false);
		Assert.assertTrue(true);

	}

}
