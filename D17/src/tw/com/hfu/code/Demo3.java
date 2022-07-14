/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo3 {
	
	@Test
	public void test1() {  //List可以重複，有順序性
		
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"LOL","15"));
		l.add(new Student(1,"LOL","15"));
		l.add(new Student(1,"LOL","15"));
		l.add(new Student(1,"LOL","15"));
		System.out.println(l);
		
	}
	
	@Test
	public void test2() {  // Set不能重複，順序隨機決定
		
		Set<Student> s=new HashSet<>();
		s.add(new Student(1,"LOL","15"));
		s.add(new Student(2,"LOL","15"));
		s.add(new Student(3,"LOL","15"));
		s.add(new Student(4,"LOL","15"));

		System.out.println(s);
	}
	
}
