/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.collection;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import tw.com.hfu.code.MainTest;
import tw.com.hfu.code.entity.Person;
import tw.com.hfu.code.entity.Student;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Code {
	
	MainTest m=new MainTest();
	Person p=new Person();
	
	@Test
	public void test() {
		
		addCollection(new Person(1,"ABC","12"));
		addCollection(new Person(2,"ABC","12"));
		addCollection(new Student(3,"ABC","12"));
		//這裡可以用繼承
		
	}
	
	
	public void addCollection(Person p) {
		Collection<Person> c=new ArrayList<>();
		c.add(p);
		m.getPrint1(c);
		
	}
}
