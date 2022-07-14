/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import org.junit.jupiter.api.Test;

import tw.com.hfu.extends1.AllClasss;
import tw.com.hfu.extends1.Others;
import tw.com.hfu.extends1.Student;
import tw.com.hfu.extends1.Worker;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class TestDemo {
	@Test
	public void test01() {

		Student s = new Student();
		Worker w = new Worker();
		Others o = new Others();
		s.sleep();
		s.eat();
		s.read();
		w.sleep();
		w.eat();
		w.work();
		o.sleep();
		o.eat();

	}

	@Test
	public void test02() {

		AllClasss a=new AllClasss();
		//a.getAll();

	}
}
