package com.testing.maven.vip05JunitMaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginJunitTest {

	@Test
	public void test() {
		System.out.println("----------LoginUnitTest被执行啦-------");
		LoginSample ls = new LoginSample();
		ls.login("1111", "22222");
	}

}
