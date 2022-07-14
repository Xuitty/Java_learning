/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.entity;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class UsePerson {
	
	public void method3(){
		Person p=new Person();
		p.setId(0);
		p.setName("AAA");
		p.setEmail("iopewrz@qewq.coa");
	
		Person p1=new Person(1,"WEA","eaweaw@adzxc.ala");
				
		Person[] px= {p,p1};
		
		for(Person pz:px) {
			System.out.println(pz);
		}
	}

	
	@Test
	public void method2(){
		Person p[]= {new Person(0,"ZZZ","opqr@qqq.com"),
				     new Person(1,"yyy","opqr@qqq.com"),
				     new Person(2,"ZZZ","opqr@qqq.com")};
		
		for(Person p1:p) {
			System.out.println(p1);
		}
	}
	
	public void method1() {
		Person p=new Person();
		p.setId(0);
		p.setName("ABC");
		p.setEmail("123@abc.com");
		System.out.println(p.toString());
		
		Person p1=new Person(1,"DEF","456@def.com");
		System.out.println(p1.toString());
		
	}
	
	
}
