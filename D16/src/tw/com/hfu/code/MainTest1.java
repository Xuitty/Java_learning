/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class MainTest1 {

	MainTest m = new MainTest();

	@Test
	public void test() {
		Collection<String> c1 = new ArrayList<>();
		c1.add("ABC");
		c1.add("DEF");
		c1.add("GHI");
		c1.add("JKL");
		c1.add("MNO");
		c1.add("PQR");
		c1.add("STU");
		c1.add("VWX");
		c1.add("YZ");
		m.getPrint1(c1);
	}

	@Test
	public void test2() {

		Collection<Double> c2 = new ArrayList<>();
		Collection<Double> c3 = new ArrayList<>();
		c2.add(123.123);
		c2.add(456.432);
		c2.add(234.132);
		c2.add(.75);
		c2.add(765.345);
		c2.add(654.4534);
		c2.add(6546.234324);
		c2.add(7657.345234);
		c3=c2;
		System.out.println(c2.containsAll(c3));
		System.out.println(c2.equals(c3));
		m.getPrint1(c2);

		Object obj[] = c2.toArray();
		Arrays.sort(obj);
		m.obj_print(obj);
	}
}
