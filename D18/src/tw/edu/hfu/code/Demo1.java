/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.edu.hfu.code;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo1 {
	
	@Test
	public void test() {
		
		TreeSet<Integer> t=new TreeSet<>();
		t.add(20);
		t.add(30);
		t.add(40);
		System.out.println(t.lower(90));
			
	}
	
}
