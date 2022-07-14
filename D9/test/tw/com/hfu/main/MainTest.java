/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.main;

import org.junit.jupiter.api.Test;

import tw.com.hfu.code.Demo1;
import tw.com.hfu.code.Person;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MainTest {
	@Test
	public void test() {
		
		Demo1 d=new Demo1();
		d.method();
	
	}
	@Test
	public void test1() {
		new Person().getMethod();
		System.out.println(new Person().getMethod1(50));
		System.out.println(new Person().getMethod2(6,9));
		System.out.println(new Person().getMethod3((byte)50,(byte)20,(byte)8));
	}
	
	public void test2() {
		new Demo1().method();
	}
	
}
