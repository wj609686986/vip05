package com.testing.maven.vip05JunitMaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PlusTest {

	private static Plus pls;
	private static int x;
	private static int y;
	private static double dx;
	private static double dy;
	private static double expectedD;
	private static String expectedResult;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("---------------------PlusTest-----------------");
		pls = new Plus();
	}

	public PlusTest(String caseName,String expected,int firstNum,int secondNum,double firstd,double secondd,double dresult) {
		// TODO Auto-generated constructor stub
		expectedResult=expected;
		x=firstNum;
		y=secondNum;
		dx=firstd;
		dy=secondd;
		expectedD=dresult;
	}

	@Test
	public void test() {
		int result=pls.Sum(x, y);
		System.out.println(result);
		assertEquals(expectedResult, result+"");
	}
	
	@Test
	public void doubleTest() {
		double result=pls.Sum(dx, dy);
		System.out.println(result);
		assertEquals("测试结果", expectedD+"", result+"");
	}
	

	@Parameters(name = "{0}")
	public static Object[][] intData() {
		return new Object[][] { { "左边界-1", "-2147483649", -2147483648,-1,3.6,1.5,5.1}, 
			{ "左边界+0", "-2147483648", -2147483648, 0 ,3.6,1.5,5.0},
				{ "左边界+1", "-2147483647", -2147483648, 1 ,3.6,1.5,5.1} };

	}

}
