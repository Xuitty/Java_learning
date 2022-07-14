/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.list;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class EqualsHashDemo {

	List<Employee> list=Arrays.asList(
			new Employee("Alice",20,70831),
			new Employee("Bard",54,20291),
			new Employee("Caps",61,34791),
			new Employee("Drek",34,17491),
			new Employee("Edi",41,13211),
			new Employee("Fed",74,80291)
			);
	
	@Test
	public void test() {
		
		Employee emp=new Employee();
		int a=emp.hashCode();
		System.out.println(a);
		
		boolean b=emp.equals(list);
		System.out.println(b);
		
		
		
	}
	
}
