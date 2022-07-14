/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import tw.com.hfu.code.entity.Employee;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Code1 {

	@Test
	public void test() {

		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return Integer.compare(o1, o2);
			}
		};

		int x = c.compare(50, 5);
		System.out.println(x == -1 ? "x<y" : x == 0 ? "x=y" : "x>y");

	}

	@Test
	public void test2() {

		Comparator<Integer> cm=(x,y)->Integer.compare(x, y);
		
		int a=cm.compare(1000, 100);
		System.out.println(a);
		
	}
	
	@Test
	public void test3() {
		
		int x[]= {187,87,342,12,4,312,987,43,7};
		
		Arrays.sort(x,0,3);
		for(int y:x){
			System.out.println(y);
		}
		
	}
	
	List<Employee> list=Arrays.asList(
			new Employee("Alice",20,70831),
			new Employee("Bard",54,20291),
			new Employee("Caps",61,34791),
			new Employee("Drek",34,17491),
			new Employee("Edi",41,13211),
			new Employee("Fed",74,80291)
			);
	@Test	
	public List<Employee> test4(List<Employee> list) {
		
		List<Employee> ls=new ArrayList<>();
		
		for(Employee e:list) {
			if(e.getPay()<40000.0) {
				ls.add(e);
			}else {}
		}
		return ls;
		
	}

	@Test
	public void test5(){
		List<Employee> emp=test4(list);
		for (Employee y:emp) {
			System.out.println(y);
		}
	}
	
}
