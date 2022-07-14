/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import tw.com.hfu.code.entity.Person;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MainTest {

	@Test
	public void test01() {
		// 集合
		Collection col = new ArrayList<>();
		col.add("SSS");
		col.add('A');
		col.add(123);
		col.add(12.1233124);
		col.add(true);
		col.add(new Person());
		Collection col1 = new ArrayList<>();
		col1.addAll(col);
		//System.out.println(col.containsAll(col1));
		
		Object obj[] = col.toArray();
		
		obj_print(obj);
		

		/*getPrint1(col);
		System.out.println(col.contains('A'));
		System.out.println(col.isEmpty());
		col.clear();
		System.out.println(col.contains('A'));
		System.out.println(col.isEmpty());*/

	}

	public void obj_print(Object[] obj) {
		for(Object y:obj) {
			System.out.println(y);
			
		}
	}

	@Test
	public void test02() {
		// 泛型
		Collection<Integer> col = new ArrayList<>();
		col.add(10);
		col.add(23);
		col.add(123);
		col.add(12);
		col.add(123);
		col.add(1234);
		getPrint2(col);

	}

	public void getPrint1(Collection colprint) {

		for(Object obj:colprint) {
			System.out.println(obj);
		}
	}
	public void getPrint2(Collection<Integer> colprint) {

		Iterator<Integer> obj=colprint.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
	}
}
