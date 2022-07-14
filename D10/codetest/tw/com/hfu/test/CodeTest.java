/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.test;

import org.junit.jupiter.api.Test;

import tw.com.hfu.code.*;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class CodeTest {
	@Test
	public void testConstructor() {
		Constructor c0 = new Constructor();
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor();
	}

	@Test
	public void testFu() {
		FuClass fc = new FuClass();
		fc.setId(1);
		fc.setName("ABC");
		System.out.println(fc.toString());
	}

	@Test
	public void testSu() {
		SuClass sc = new SuClass(2, "DEF", "20", "GHI");
//		sc.setId(2);
//		sc.setName("DEF");
//		sc.setAge("20");
//		sc.setAddress("GHI");
		System.out.println(sc.toString());
	}
}
